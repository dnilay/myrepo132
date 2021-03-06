package org.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "myEmp")

public class Employee {
	
	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;

	private Address address;
	
	public Employee() {
		super();
	}

	/*
	 * public Employee(String employeeId, String firstName, String lastName, String
	 * email,Address address) { super(); this.employeeId = employeeId;
	 * this.firstName = firstName; this.lastName = lastName; this.email = email;
	 * this.address=address; }
	 */

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "Address"+address+ "]";
	}
	
	

}
