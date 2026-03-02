package com.lpu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.dao.ProductDao;
import com.lpu.entity.Products;



@Service
public class ProductService {

    @Autowired
    private ProductDao dao;

    public void saveProduct(Products p){
        dao.save(p);
    }

    public Products getProduct(int id){
        return dao.findById(id);
    }

    public List<Products> getAllProducts(){
        return dao.findAll();
    }

    public void updateProduct(Products p){
        dao.update(p);
    }

    public void deleteProduct(int id){
        dao.delete(id);
    }

    public List<Products> getProductsByCategory(int categoryId){
        return dao.findByCategory(categoryId);
    }

    public List<Products> getProductsWithOrders(){
        return dao.findProductsWithOrders();
    }
}