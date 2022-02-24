package org.example.dao;

import org.example.model.Customer;
import org.example.ui.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CustomerDaoImpl implements CustomerDao{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Customer createCustomer(Customer customer) {
       int result= jdbcTemplate.update("insert into customer(id,first_name,last_name,email) values(?,?,?,?)",customer.getCustomerId(),customer.getFirstName(),customer.getLastName(),customer.getEmail());
        System.out.println(result+" row(s) updated..");
        return customer;
    }

    @Override
    public List<Customer> displayAllCustomers() {
        List<Customer> customers=jdbcTemplate.query("select id,first_name,last_name,email from customer",new CustomerMapper());
        return customers;
    }
}
