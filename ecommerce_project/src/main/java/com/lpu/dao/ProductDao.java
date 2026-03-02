package com.lpu.dao;

import java.util.List;
import com.lpu.entity.Products;

public interface ProductDao{

    void save(Products p);

    Products findById(int id);

    List<Products> findAll();

    void update(Products p);

    void delete(int id);

    List<Products> findByCategory(int categoryId);

    List<Products> findProductsWithOrders();
}