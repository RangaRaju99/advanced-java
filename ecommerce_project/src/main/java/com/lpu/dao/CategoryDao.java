package com.lpu.dao;

import java.util.List;
import com.lpu.entity.Categories;

public interface CategoryDao {

    void save(Categories c);

    Categories findById(int id);

    List<Categories> findAll();

    void update(Categories c);

    void delete(int id);

    Categories findWithProducts(int id);
}