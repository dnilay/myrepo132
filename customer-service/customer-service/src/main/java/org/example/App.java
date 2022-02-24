package org.example;

import org.example.config.SpringConfig;
import org.example.model.Customer;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        App app=new App();
        try
        {

            AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
            CustomerService customerService= configApplicationContext.getBean("customerServiceImpl",CustomerService.class);
           /* Customer customer=customerService.createCustomer(new Customer(2,"Marry","Public","marry@email.com"));
            System.out.println(customer);*/
            System.out.println(customerService.displayAllCustomers());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
