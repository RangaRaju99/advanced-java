package com.lpu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.dao.DeliveryDao;
import com.lpu.entity.Delivery;



@Service
public class DeliveryService {

    @Autowired
    private DeliveryDao dao;

    public void saveDelivery(Delivery d){
        dao.save(d);
    }

    public Delivery getDelivery(int id){
        return dao.findById(id);
    }

    public List<Delivery> getAllDelivery(){
        return dao.findAll();
    }

    public void updateDelivery(Delivery d){
        dao.update(d);
    }

    public void deleteDelivery(int id){
        dao.delete(id);
    }

    public Delivery getDeliveryWithOrders(int id){
        return dao.findWithOrders(id);
    }
}