package com.lpu.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    private int customer_id;

    private String name;
    private String email;
    private String address;

    @OneToMany(mappedBy="customer", cascade=CascadeType.ALL)
    private List<Orders> ordersList = new ArrayList<>();

 
    public void addOrder(Orders o){
        ordersList.add(o);
        o.setCustomer(this);
    }

    public void removeOrder(Orders o){
        ordersList.remove(o);
        o.setCustomer(null);
    }

    public Customer(){}

    public Customer(int id,String name,String email,String address){
        this.customer_id=id;
        this.name=name;
        this.email=email;
        this.address=address;
    }

   
    public int getCustomer_id(){return customer_id;}
    public void setCustomer_id(int id){this.customer_id=id;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}

    public String getAddress(){return address;}
    public void setAddress(String address){this.address=address;}

    public List<Orders> getOrdersList(){return ordersList;}
    public void setOrdersList(List<Orders> list){this.ordersList=list;}

    @Override
    public String toString(){
        return "Customer[id="+customer_id+", name="+name+"]";
    }
}