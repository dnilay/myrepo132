package org.example.dao;

import org.example.model.Customer;

import java.util.List;

public interface CustomerDao {

    public Customer createCustomer(Customer customer);

    public List<Customer> displayAllCustomers();
}
