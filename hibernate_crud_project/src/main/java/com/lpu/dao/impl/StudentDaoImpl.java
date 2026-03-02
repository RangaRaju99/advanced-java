package com.lpu.dao.impl;


import java.util.List;

import com.entity.Student;
import com.lpu.dao.StudentDao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDaoImpl implements StudentDao {
	
	
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");

    @Override
    public void save(Student s) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.persist(s);
            tx.commit();
        }
        catch(Exception e){
            if(tx.isActive()) tx.rollback();
            e.printStackTrace();
        }
        finally {
            em.close();
        }
    }

    @Override
    public Student findById(int id) {

        EntityManager em = emf.createEntityManager();
        Student s = em.find(Student.class, id);
        em.close();

        return s;
    }

    @Override
    public List<Student> findAll(int page, int size) {

        EntityManager em = emf.createEntityManager();

        List<Student> list = em.createQuery(
                "FROM Student s WHERE s.deleted = false",
                Student.class)
                .setFirstResult(page * size)
                .setMaxResults(size)
                .getResultList();

        em.close();

        return list;
    }

    @Override
    public void update(Student s) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();
            em.merge(s);
            tx.commit();
        }
        catch(Exception e){
            if(tx.isActive()) tx.rollback();
        }
        finally{
            em.close();
        }
    }

    @Override
    public void delete(Student s) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();

            // SOFT DELETE
            s.setDeleted(true);
            em.merge(s);

            tx.commit();
        }
        catch(Exception e){
            if(tx.isActive()) tx.rollback();
        }
        finally{
            em.close();
        }
    }
}
