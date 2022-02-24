package org.example.service;

import org.example.dao.CustomerDao;
import org.example.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerDao customerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerDao.createCustomer(customer);
    }

    @Override
    public List<Customer> displayAllCustomers() {
        return customerDao.displayAllCustomers();
    }
}
