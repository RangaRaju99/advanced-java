package com.lpu.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lpu.entity.Categories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class CategoryDaoImpl implements CategoryDao {

    @PersistenceContext
    private EntityManager em;

    public void save(Categories c){
        em.persist(c);
    }

    public Categories findById(int id){
        return em.find(Categories.class,id);
    }

    public List<Categories> findAll(){
        return em.createQuery("from Categories",Categories.class)
                 .getResultList();
    }

    public void update(Categories c){
        em.merge(c);
    }

    public void delete(int id){
        Categories c=em.find(Categories.class,id);
        if(c!=null) em.remove(c);
    }

    public Categories findWithProducts(int id){
        return em.createQuery(
          "select c from Categories c left join fetch c.prodCategoryList where c.category_id=:id",
          Categories.class)
          .setParameter("id",id)
          .getSingleResult();
    }
}