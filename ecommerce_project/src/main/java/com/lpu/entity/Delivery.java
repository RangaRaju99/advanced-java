package com.lpu.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="delivery")
public class Delivery {

    @Id
    private int delivery_id;

    private String type;
    private String status;

    @OneToMany(mappedBy="delivery", cascade=CascadeType.ALL)
    private List<Orders> ordersDeliveryList = new ArrayList<>();

    // 🔹 helper
    public void addOrder(Orders o){
        ordersDeliveryList.add(o);
        o.setDelivery(this);
    }

    public Delivery(){}

    public Delivery(int id,String type,String status){
        this.delivery_id=id;
        this.type=type;
        this.status=status;
    }

    // getters setters
    public int getDelivery_id(){return delivery_id;}
    public void setDelivery_id(int id){this.delivery_id=id;}

    public String getType(){return type;}
    public void setType(String type){this.type=type;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public List<Orders> getOrdersDeliveryList(){return ordersDeliveryList;}
    public void setOrdersDeliveryList(List<Orders> list){this.ordersDeliveryList=list;}

    @Override
    public String toString(){
        return "Delivery[id="+delivery_id+", status="+status+"]";
    }
}