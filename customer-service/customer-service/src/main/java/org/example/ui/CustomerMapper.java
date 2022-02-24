package org.example.ui;

import org.example.model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer customer=new Customer();
        customer.setCustomerId(rs.getInt("id"));
        customer.setFirstName(rs.getString("first_name"));
        customer.setLastName(rs.getString("last_name"));
        customer.setEmail(rs.getString("email"));
        return customer;
    }
}
