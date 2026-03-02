package com.lpu.entity;

import jakarta.persistence.*;

/*
 ============================================================
        HIBERNATE / JPA ENTITY LIFECYCLE – MASTER LAB
 ============================================================

 This single file demonstrates:

 ✔ Transient State
 ✔ Persistent State
 ✔ Detached State
 ✔ Removed State
 ✔ Dirty Checking
 ✔ First Level Cache
 ✔ Merge Trap
 ✔ Rollback
 ✔ Garbage Collection
 ✔ Exception Cases
 ✔ Interview Traps

 ------------------------------------------------------------
 MEMORY VISUALIZATION
 ------------------------------------------------------------

 🔥 TRANSIENT
 JVM Heap        ✅
 1st Level Cache ❌
 Database        ❌
 GC Eligible     ✅

 👉 Created using "new"

 ------------------------------------------------------------

 🔥 PERSISTENT (After em.persist())

 Heap            ✅
 PersistenceCtx  ✅   (First Level Cache)
 Database        ✅   (On commit/flush)
 GC Eligible     ❌   (EntityManager holds reference)

 WHY NOT GC?
 👉 Because Persistence Context strongly references it.

 ------------------------------------------------------------

 🔥 DIRTY CHECKING

 When you modify a managed object:

    s.setName("New");

 Hibernate stores:

 OLD VALUE → Ranga
 NEW VALUE → New

 On commit → UPDATE automatically.

 👉 You NEVER write SQL.

 FAVORITE INTERVIEW QUESTION.

 ------------------------------------------------------------

 ⭐ FIRST LEVEL CACHE (Persistence Context)

 Scope: ONE EntityManager

 Proof:
    s1 == again   → TRUE

 Same object returned.
 No SQL fired.
 Massive performance boost.

 ------------------------------------------------------------

 🚨 SECOND LEVEL CACHE

 ❌ Not enabled by default.

 Works across MULTIPLE EntityManagers.

 Providers:
 ✔ Ehcache
 ✔ Hazelcast

 Flow:
 DB → L2 Cache → L1 Cache → Application

 Interview Gold:
 👉 Which cache is mandatory?
 ✅ First Level Cache

 ------------------------------------------------------------

 🔥 DETACHED (After em.detach())

 Heap        ✅
 Database    ✅
 Tracking    ❌

 Setter works in JVM…
 BUT DB is NOT updated.

 ------------------------------------------------------------

 🚨 MERGE TRAP

 Stud managedCopy = em.merge(detached);

 ❌ merge does NOT reuse object.
 ✔ Creates NEW managed copy.

 ALWAYS use returned object.

 ------------------------------------------------------------

 🔥 ROLLBACK MAGIC

 Cancels:
 ✔ INSERT
 ✔ UPDATE
 ✔ DELETE

 ⚠ Database reverts
 BUT JVM object still changed!

 VERY tricky interview question.

 ------------------------------------------------------------

 🔥 REMOVED STATE

 em.remove(obj);

 Object becomes REMOVED.

 commit() → DELETE executed.

 ------------------------------------------------------------

 ⚠️ EXCEPTION CASES

 ❌ Persist Detached
    -> "detached entity passed to persist"
    ✔ Use merge()

 ❌ Remove Detached
    -> IllegalArgumentException

 ❌ Update Outside Transaction
    -> TransactionRequiredException

 ------------------------------------------------------------

 🧨 TRICKY INTERVIEW QUESTIONS

 ⭐ When does object become persistent?
 👉 At persist()
 NOT commit()

 ⭐ Heaviest State?
 ✅ Persistent (Dirty checking overhead)

 ⭐ Fastest?
 ✅ Detached (No tracking)

 ⭐ Can GC remove persistent object?
 ❌ No — until detached or EM closed.

 ------------------------------------------------------------

 🔥 OPERATIONS ALLOWED

 State        persist   merge   remove   setter
 ------------------------------------------------
 Transient      ✅       ❌       ❌       ✅
 Persistent     ❌       ✅       ✅       ✅ (auto update)
 Detached       ❌       ✅       ❌       ✅ (JVM only)

 ------------------------------------------------------------

 🧠 GOLDEN RULE

 👉 Hibernate tracks ONLY Persistent objects.

 EVERYTHING revolves around this.

 ------------------------------------------------------------

 ⭐ ULTRA MEMORY TRICK

 new      → TRANSIENT
 persist  → PERSISTENT
 detach   → DETACHED
 merge    → PERSISTENT
 remove   → REMOVED

 ============================================================
*/

public class Driver{

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("dev");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        /*
         =====================================================
                1️⃣ TRANSIENT STATE
         =====================================================
         Exists ONLY in JVM Heap.
         Hibernate has ZERO knowledge.
        */

        Stud s1 = new Stud();
        s1.setId(1);
        s1.setName("Ranga");

        System.out.println("TRANSIENT -> " + s1);


        /*
         =====================================================
                2️⃣ PERSISTENT STATE
         =====================================================
         TRANSIENT → PERSISTENT happens at persist()
        */

        tx.begin();

        em.persist(s1); // Now inside First Level Cache

        // DIRTY CHECKING DEMO
        s1.setName("Hacker Ranga"); // No SQL yet!

        tx.commit(); // INSERT + UPDATE fired here

        System.out.println("PERSISTENT -> Data saved");


        /*
         =====================================================
                FIRST LEVEL CACHE DEMO
         =====================================================
        */

        Stud again = em.find(Stud.class, 1);

        System.out.println("Same object from cache? -> " + (s1 == again));


        /*
         =====================================================
                3️⃣ DETACHED STATE
         =====================================================
        */

        em.detach(s1);

        s1.setName("Detached Name"); // DB NOT updated

        tx.begin();
        tx.commit(); // Nothing happens

        System.out.println("DETACHED -> Hibernate not tracking");


        /*
         =====================================================
                MERGE (DETACHED → PERSISTENT)
         =====================================================
        */

        tx.begin();

        Stud managedCopy = em.merge(s1); // NEW managed object

        managedCopy.setName("Merged Back");

        tx.commit(); // UPDATE fired


        /*
         =====================================================
                ROLLBACK DEMO
         =====================================================
        */

        tx.begin();

        managedCopy.setName("Will Rollback");

        tx.rollback(); // DB restored

        System.out.println("ROLLBACK executed");


        /*
         =====================================================
                REMOVE STATE
         =====================================================
        */

        tx.begin();

        Stud removeObj = em.find(Stud.class, 1);

        em.remove(removeObj);

        tx.commit(); // DELETE executed

        System.out.println("Entity removed");


        /*
         =====================================================
                GARBAGE COLLECTION
         =====================================================
         Now no strong references remain.
        */

        s1 = null;
        managedCopy = null;
        again = null;

        System.gc(); // Suggest JVM cleanup

        System.out.println("GC Requested");


        em.close();
        emf.close();
    }
}
