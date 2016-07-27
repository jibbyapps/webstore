package com.emusicstore.service;

import com.emusicstore.model.Customer;

import java.util.List;

/**
 * Created by vitaliiromanchenko on 26.07.16.
 */


public interface CustomerService {
    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);
    List<Customer> getAllCustomers();

}
