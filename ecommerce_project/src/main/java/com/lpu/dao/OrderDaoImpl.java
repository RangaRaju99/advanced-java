package com.lpu.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lpu.entity.Orders;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class OrderDaoImpl implements OrderDao{

    @PersistenceContext
    private EntityManager em;

    public void save(Orders o){
        em.persist(o);
    }

    public Orders findById(int id){
        return em.find(Orders.class,id);
    }

    public List<Orders> findAll(){
        return em.createQuery("from Orders",Orders.class)
                 .getResultList();
    }

    public void update(Orders o){
        em.merge(o);
    }

    public void delete(int id){
        Orders o=em.find(Orders.class,id);
        if(o!=null) em.remove(o);
    }

    public List<Orders> findOrdersWithProducts(){
        return em.createQuery(
          "select distinct o from Orders o left join fetch o.productList",
          Orders.class)
          .getResultList();
    }

    public List<Orders> findOrdersByCustomer(int customerId){
        return em.createQuery(
          "select o from Orders o where o.customer.customer_id=:id",
          Orders.class)
          .setParameter("id",customerId)
          .getResultList();
    }
}