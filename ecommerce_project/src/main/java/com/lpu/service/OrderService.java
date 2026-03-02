package com.lpu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.dao.OrderDao;
import com.lpu.entity.Orders;


@Service
public class OrderService {

    @Autowired
    private OrderDao dao;

    public void saveOrder(Orders o){
        dao.save(o);
    }

    public Orders getOrder(int id){
        return dao.findById(id);
    }

    public List<Orders> getAllOrders(){
        return dao.findAll();
    }

    public void updateOrder(Orders o){
        dao.update(o);
    }

    public void deleteOrder(int id){
        dao.delete(id);
    }

    public List<Orders> getOrdersWithProducts(){
        return dao.findOrdersWithProducts();
    }

    public List<Orders> getOrdersByCustomer(int customerId){
        return dao.findOrdersByCustomer(customerId);
    }
}