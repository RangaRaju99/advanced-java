package com.lpu.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.lpu.entity.Delivery;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DeliveryDaoImpl implements DeliveryDao{

    @PersistenceContext
    private EntityManager em;

    public void save(Delivery d){
        em.persist(d);
    }

    public Delivery findById(int id){
        return em.find(Delivery.class,id);
    }

    public List<Delivery> findAll(){
        return em.createQuery("from Delivery",Delivery.class)
                 .getResultList();
    }

    public void update(Delivery d){
        em.merge(d);
    }

    public void delete(int id){
        Delivery d=em.find(Delivery.class,id);
        if(d!=null) em.remove(d);
    }

    public Delivery findWithOrders(int id){
        return em.createQuery(
          "select d from Delivery d left join fetch d.ordersDeliveryList where d.delivery_id=:id",
          Delivery.class)
          .setParameter("id",id)
          .getSingleResult();
    }
}