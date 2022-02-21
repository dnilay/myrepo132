package org.example.demo;

import java.util.UUID;

import org.example.demo.model.Address;
import org.example.demo.model.Employee;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try (// ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)) {
			Employee employee=context.getBean("myEmp",Employee.class);
			employee.setEmployeeId(UUID.randomUUID().toString());
			employee.setFirstName("John");
			employee.setLastName("Doe");
			employee.setEmail("john@email.com");
			employee.setAddress(new Address("Mumbai", "India"));
			System.out.println(employee);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
