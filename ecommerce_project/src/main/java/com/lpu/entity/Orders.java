package com.lpu.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Orders {

    @Id
    private int orderId;

    private LocalDate orderDate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="delivery_id")
    private Delivery delivery;

    @ManyToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST})
    @JoinTable(
        name="product_order",
        joinColumns=@JoinColumn(name="order_id"),
        inverseJoinColumns=@JoinColumn(name="product_id")
    )
    private List<Products> productList = new ArrayList<>();

    // 🔹 helper
    public void addProduct(Products p){
        productList.add(p);
        p.getOrderList().add(this);
    }

    public Orders(){}

    public Orders(int id,LocalDate date){
        this.orderId=id;
        this.orderDate=date;
    }

    // getters setters
    public int getOrderId(){return orderId;}
    public void setOrderId(int id){this.orderId=id;}

    public LocalDate getOrderDate(){return orderDate;}
    public void setOrderDate(LocalDate date){this.orderDate=date;}

    public Customer getCustomer(){return customer;}
    public void setCustomer(Customer c){this.customer=c;}

    public Delivery getDelivery(){return delivery;}
    public void setDelivery(Delivery d){this.delivery=d;}

    public List<Products> getProductList(){return productList;}
    public void setProductList(List<Products> list){this.productList=list;}

    @Override
    public String toString(){
        return "Order[id="+orderId+", date="+orderDate+"]";
    }
}