package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="C_data")
public class Customer {
	
	
	@Id
	@GeneratedValue
	private int c_id;
	@Column
	private String c_name;
	@Column
	private String c_add;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Customer(int c_id, String c_add) {
		super();
		this.c_id = c_id;
		this.c_add = c_add;
	}




	public Customer(String c_name, String c_add) {
		super();
		this.c_name = c_name;
		this.c_add = c_add;
	}




	public Customer(int c_id, String c_name, String c_add) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_add = c_add;
	}



	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(int c_id) {
		super();
		this.c_id = c_id;
	}













	public int getC_id() {
		return c_id;
	}













	public void setC_id(int c_id) {
		this.c_id = c_id;
	}













	public String getC_name() {
		return c_name;
	}













	public void setC_name(String c_name) {
		this.c_name = c_name;
	}













	public String getC_add() {
		return c_add;
	}













	public void setC_add(String c_add) {
		this.c_add = c_add;
	}













	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", c_add=" + c_add + "]";
	}
	
	

}
