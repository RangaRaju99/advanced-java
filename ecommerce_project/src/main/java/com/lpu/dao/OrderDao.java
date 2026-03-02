package com.lpu.dao;

import java.util.List;
import com.lpu.entity.Orders;

public interface OrderDao{

    void save(Orders o);

    Orders findById(int id);

    List<Orders> findAll();

    void update(Orders o);

    void delete(int id);

    List<Orders> findOrdersWithProducts();

    List<Orders> findOrdersByCustomer(int customerId);
}