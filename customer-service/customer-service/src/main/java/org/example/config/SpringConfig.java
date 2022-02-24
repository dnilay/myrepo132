package org.example.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "org.example")
public class SpringConfig {
    @Bean
    public JdbcTemplate jdbcTemplate()
    {
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSource dataSource()
    {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://database-2.cpvbwdjbacbj.us-east-1.rds.amazonaws.com:3306/hr");
        dataSource.setUser("root");
        dataSource.setPassword("root1234");
        return dataSource;

    }
}
