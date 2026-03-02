package com.lpu.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.lpu.entity.Products;

import jakarta.persistence.*;

@Component
public class ProductDaoImpl implements ProductDao{

    @PersistenceContext
    private EntityManager em;

    public void save(Products p){
        em.persist(p);
    }

    public Products findById(int id){
        return em.find(Products.class,id);
    }

    public List<Products> findAll(){
        return em.createQuery("from Products",Products.class)
                 .getResultList();
    }

    public void update(Products p){
        em.merge(p);
    }

    public void delete(int id){
        Products p=em.find(Products.class,id);
        if(p!=null) em.remove(p);
    }

    public List<Products> findByCategory(int categoryId){
        return em.createQuery(
          "select p from Products p where p.category.category_id=:cid",
          Products.class)
          .setParameter("cid",categoryId)
          .getResultList();
    }

    public List<Products> findProductsWithOrders(){
        return em.createQuery(
          "select distinct p from Products p left join fetch p.orderList",
          Products.class)
          .getResultList();
    }
}