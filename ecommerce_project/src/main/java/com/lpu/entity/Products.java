package com.lpu.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Products {

    @Id
    private int product_id;

    private String product_name;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Categories category;

    @ManyToMany(mappedBy="productList")
    private List<Orders> orderList = new ArrayList<>();

    //  helper method
    public void addOrder(Orders o){
        orderList.add(o);
        o.getProductList().add(this);
    }

    public Products(){}

    public Products(int id,String name){
        this.product_id=id;
        this.product_name=name;
    }

    // getters setters
    public int getProduct_id(){return product_id;}
    public void setProduct_id(int id){this.product_id=id;}

    public String getProduct_name(){return product_name;}
    public void setProduct_name(String name){this.product_name=name;}

    public Categories getCategory(){return category;}
    public void setCategory(Categories c){this.category=c;}

    public List<Orders> getOrderList(){return orderList;}
    public void setOrderList(List<Orders> list){this.orderList=list;}

    @Override
    public String toString(){
        return "Product[id="+product_id+", name="+product_name+"]";
    }
}