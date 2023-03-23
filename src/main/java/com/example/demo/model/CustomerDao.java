package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class CustomerDao {
	HibernateTemplate template;
	

    
    public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	// method to save Customer
	public void saveCustomer(Customer c) {
		template.save(c);
	}

	// method to update Customer
	public void updateCustomer(Customer c) {
		template.update(c);
	}

	// method to delete Customer
	public void deleteCustomer(Customer c) {
		template.delete(c);
	}

	// method to return one Customer of given id
	public Customer getById(int id) {
		Customer e = (Customer) template.get(Customer.class, id);
		return e;
	}

	// method to return all Customers
	public List<Customer> getCustomer() {
		List<Customer> list = new ArrayList<Customer>();
		list = template.loadAll(Customer.class);
		return list;
	}

}

	
