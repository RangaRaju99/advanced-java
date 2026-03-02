package com.lpu.jdbc;

public class Demo {

	
	/*
	===========================================================
	        STATIC vs SINGLETON — COMPLETE NOTES
	        (Backend + Interview + Real-Life Understanding)
	===========================================================

	✅ ONE CORE TRUTH
	--------------------------------
	Both Static and Singleton usually provide ONE shared object.

	The REAL difference is based on TWO questions:

	👉 WHO controls object creation?
	👉 WHEN is the object created?

	Do not complicate beyond this.

	===========================================================
	🧠 REAL LIFE EXAMPLE
	===========================================================

	Imagine opening a shop.

	STATIC Thinking:
	---------------
	Before customers arrive:
	- Switch ON lights
	- Start AC
	- Open billing machine

	Even if nobody comes → resources wasted.

	This is called:

	⭐ EAGER INITIALIZATION
	(Create immediately when class loads)


	SINGLETON Thinking:
	------------------
	Customer enters first…

	NOW you switch ON everything.

	Smart usage ✔
	No waste ✔

	This is called:

	⭐ LAZY INITIALIZATION
	(Create ONLY when required)

	===========================================================
	✅ STATIC — CONCEPT
	===========================================================

	A static object is created automatically when the class is loaded
	by the JVM.

	Example:

	static {
	    conn = DriverManager.getConnection(...);
	}

	Properties:
	------------
	✔ Runs automatically
	✔ Executes ONLY once
	✔ Shared across entire application
	✔ No developer control

	Rule:
	------
	Use static ONLY when the object MUST exist at startup.

	Examples:
	---------
	✔ Constants (PI value)
	✔ Utility classes
	✔ Configuration loaders
	✔ Logger instances

	===========================================================
	✅ STATIC — ADVANTAGES
	===========================================================

	✔ Very simple to implement
	✔ Fast access (already created)
	✔ No synchronization required
	✔ Good for:
	    - College projects
	    - Small apps
	    - Testing environments

	===========================================================
	❌ STATIC — DISADVANTAGES (IMPORTANT)
	===========================================================

	🚨 Resource Waste
	Connection created even if DB never used.

	🚨 Startup Failure
	If DB is DOWN → static block fails → app may crash.

	🚨 No Retry Mechanism
	Static runs only once.

	🚨 Hard to Test
	Cannot easily mock static objects.

	⭐ Interview One-Liner:
	"Static uses eager initialization which may waste resources
	and reduce fault tolerance."

	===========================================================
	✅ SINGLETON — CONCEPT
	===========================================================

	Singleton ensures ONLY ONE object is created,
	but YOU control WHEN it is created.

	Basic Rules of Singleton:
	-------------------------
	1. Constructor MUST be private.
	2. Object stored in static variable.
	3. Provide public method to access it.

	Example:

	class DBConnection {

	    private static DBConnection obj;

	    private DBConnection() {}

	    public static DBConnection getInstance() {

	        if(obj == null) {
	            obj = new DBConnection();
	        }

	        return obj;
	    }
	}

	===========================================================
	✅ SINGLETON — ADVANTAGES
	===========================================================

	✔ Saves memory
	✔ Object created ONLY when needed
	✔ Application can start even if DB is down
	✔ More professional design
	✔ Preferred in interviews

	⭐ Interview One-Liner:
	"Singleton provides controlled lazy initialization,
	improving resource usage."

	===========================================================
	❌ SINGLETON — DISADVANTAGES
	===========================================================

	🚨 Not Scalable
	One connection cannot handle thousands of users.

	🚨 Thread Safety Issue
	Multiple threads may create multiple objects.

	Fix → Use:
	- Synchronized method
	- Double Checked Locking
	- Bill Pugh Singleton (advanced)

	🚨 Harder to extend (breaks OOP flexibility)

	===========================================================
	🔥 STATIC vs SINGLETON — QUICK TABLE
	===========================================================

	Initialization   : Static → Eager | Singleton → Lazy
	Control          : Static → None  | Singleton → Full
	Startup Safety   : Static → Risky | Singleton → Safer
	Resource Usage   : Static → Waste | Singleton → Efficient
	Interview Value  : Static → Good  | Singleton → ⭐ Better

	===========================================================
	🚨 TRICKY INTERVIEW CASE (VERY IMPORTANT)
	===========================================================

	❓ Is Singleton always ONE object?

	👉 PER CLASSLOADER → ONE object.

	If multiple classloaders exist,
	multiple singleton objects CAN exist.

	(Senior-level knowledge.)

	===========================================================
	🚨 MOST IMPORTANT INDUSTRY TRUTH
	===========================================================

	REAL COMPANIES USE:

	❌ Static — NO
	❌ Singleton — NO

	✅ CONNECTION POOL — YES

	Because applications handle:

	👉 Thousands of users.

	One connection = Traffic Jam.

	Connection Pool:
	----------------
	✔ Maintains limited connections (ex: 10–50)
	✔ Reuses them
	✔ Prevents DB overload
	✔ Improves performance

	Popular Pools:
	- HikariCP ⭐ (Most used in Spring Boot)
	- Apache DBCP
	- C3P0

	===========================================================
	💀 BEGINNER MISTAKE (DESTROYS PERFORMANCE)
	===========================================================

	Creating connection AGAIN and AGAIN.

	Example:

	public static Connection getConnection() throws SQLException {

	    return DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/lpu",
	            "root",
	            "Root"
	    );
	}

	Connection c1 = getConnection();
	Connection c2 = getConnection();
	Connection c3 = getConnection();

	👉 THREE different connections.

	Each connection costs:
	- Memory
	- Network
	- Database threads

	If 1000 users come → DATABASE COLLAPSES.

	ONLY acceptable when using a connection pool.

	===========================================================
	🧠 ULTIMATE BRAIN TRICK (REMEMBER FOREVER)
	===========================================================

	Ask ONE question:

	👉 "Do I need this object NOW
	    or ONLY when required?"

	NOW → Static
	WHEN REQUIRED → Singleton

	Simple decision rule.

	===========================================================
	🔥 KILLER INTERVIEW ANSWER
	===========================================================

	"Static uses eager initialization, whereas Singleton uses
	lazy initialization. Singleton provides better control,
	fault tolerance, and resource management."

	Short.
	Powerful.
	Professional.

	===========================================================
	⭐ MY STRONG ADVICE
	===========================================================

	For Learning JDBC:
	👉 Understand Singleton.

	For Real Backend Jobs:
	👉 Master Connection Pooling.

	That is what makes you production-level engineer.

	===========================================================
	*/

}
