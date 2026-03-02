package com.lpu.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="categories")
public class Categories {

    @Id
    private int category_id;

    private String category_name;
    private String category_type;

    @OneToMany(mappedBy="category", cascade=CascadeType.ALL)
    private List<Products> prodCategoryList = new ArrayList<>();


    public void addProduct(Products p){
        prodCategoryList.add(p);
        p.setCategory(this);
    }

    public void removeProduct(Products p){
        prodCategoryList.remove(p);
        p.setCategory(null);
    }

    public Categories() {}

    public Categories(int id,String name,String type){
        this.category_id=id;
        this.category_name=name;
        this.category_type=type;
    }

   
    public int getCategory_id(){return category_id;}
    public void setCategory_id(int id){this.category_id=id;}

    public String getCategory_name(){return category_name;}
    public void setCategory_name(String name){this.category_name=name;}

    public String getCategory_type(){return category_type;}
    public void setCategory_type(String type){this.category_type=type;}

    public List<Products> getProdCategoryList(){return prodCategoryList;}
    public void setProdCategoryList(List<Products> list){this.prodCategoryList=list;}

    @Override
    public String toString(){
        return "Category[id="+category_id+", name="+category_name+"]";
    }
}