package com.lpu.dao;

import java.util.List;
import com.lpu.entity.Customer;

public interface CustomerDao{

    void save(Customer c);

    Customer findById(int id);

    List<Customer> findAll();

    void update(Customer c);

    void delete(int id);

    // custom project methods
    Customer findByEmail(String email);

    List<Customer> findCustomersWithOrders();
}