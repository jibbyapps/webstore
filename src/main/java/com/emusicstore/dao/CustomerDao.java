package com.emusicstore.dao;

import com.emusicstore.model.Customer;

import java.util.List;

/**
 * Created by vitaliiromanchenko on 26.07.16.
 */
public interface CustomerDao {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);
    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);





}
