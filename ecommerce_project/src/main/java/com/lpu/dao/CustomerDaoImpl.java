package com.lpu.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.lpu.entity.Customer;

import jakarta.persistence.*;


@Component
public class CustomerDaoImpl implements CustomerDao {

    @PersistenceContext
    private EntityManager em;

    public void save(Customer c){
        em.persist(c);
    }

    public Customer findById(int id){
        return em.find(Customer.class,id);
    }

    public List<Customer> findAll(){
        return em.createQuery("from Customer",Customer.class)
                 .getResultList();
    }

    public void update(Customer c){
        em.merge(c);
    }

    public void delete(int id){
        Customer c = em.find(Customer.class,id);
        if(c!=null) em.remove(c);
    }

    public Customer findByEmail(String email){
        return em.createQuery(
            "select c from Customer c where c.email=:e",
            Customer.class)
            .setParameter("e",email)
            .getSingleResult();
    }

    public List<Customer> findCustomersWithOrders(){
        return em.createQuery(
            "select distinct c from Customer c left join fetch c.ordersList",
            Customer.class)
            .getResultList();
    }
}