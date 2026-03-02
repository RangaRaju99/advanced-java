package com.lpu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.dao.CustomerDao;
import com.lpu.entity.Customer;


@Service
public class CustomerService{

    @Autowired
    private CustomerDao dao;

    public void saveCustomer(Customer c){
        dao.save(c);
    }

    public Customer getCustomer(int id){
        return dao.findById(id);
    }

    public List<Customer> getAllCustomers(){
        return dao.findAll();
    }

    public void updateCustomer(Customer c){
        dao.update(c);
    }

    public void deleteCustomer(int id){
        dao.delete(id);
    }

    public Customer getCustomerByEmail(String email){
        return dao.findByEmail(email);
    }

    public List<Customer> getCustomersWithOrders(){
        return dao.findCustomersWithOrders();
    }
}