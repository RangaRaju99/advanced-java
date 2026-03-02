package com.lpu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.dao.CategoryDao;
import com.lpu.entity.Categories;




@Service
public class CategoryService {

    @Autowired
    private CategoryDao dao;

    public void saveCategory(Categories c){
        dao.save(c);
    }

    public Categories getCategory(int id){
        return dao.findById(id);
    }

    public List<Categories> getAllCategories(){
        return dao.findAll();
    }

    public void updateCategory(Categories c){
        dao.update(c);
    }

    public void deleteCategory(int id){
        dao.delete(id);
    }

    public Categories getCategoryWithProducts(int id){
        return dao.findWithProducts(id);
    }
}