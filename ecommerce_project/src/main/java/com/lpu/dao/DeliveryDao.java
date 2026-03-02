package com.lpu.dao;

import java.util.List;
import com.lpu.entity.Delivery;

public interface DeliveryDao {

    void save(Delivery d);

    Delivery findById(int id);

    List<Delivery> findAll();

    void update(Delivery d);

    void delete(int id);

    Delivery findWithOrders(int id);
}