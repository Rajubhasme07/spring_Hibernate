package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerDao;

@SpringBootApplication
public class SpringHibernateBasicApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerDao dao = (CustomerDao) context.getBean("d");

		Customer c ;
		
		int ucid;
		String cname;
		String cadd;
		
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		
		while(i==1)
		
	{
		System.out.println("1.Add Customer");
		
		System.out.println("2.show Customer");
		System.out.println("3.Delete Customer");
		System.out.println("4.Update Customer");
		System.out.println("0.Exit");
		System.out.println("Enter Your Choice:");
	
		int choice=Integer.parseInt(sc.nextLine());
		
	switch(choice)
	{
	case 1:
		
		System.out.println("Enter the Customer Name:");
		cname=sc.nextLine();
		
		System.out.println("Enter the Customer Address:");
		cadd=sc.nextLine();
		
		c=new Customer(cname,cadd);
		dao.saveCustomer(c);
		
		System.out.println("Data inserted !");
		break;
		
	case 2: 
		
		System.out.println(":Total Customer:");
	
		List<Customer> list=dao.getCustomer();
		
		for(Customer c1:list) 
		{
			System.out.println(c1);
		}
		
		break;
	case 3:
		
		System.out.println("Enter The Id You want to Delete :");
		ucid=Integer.parseInt(sc.nextLine());
		
			c=new Customer(ucid);
			
			dao.deleteCustomer(c);
			
		System.out.println("Data Deleted Successfully !");
		break;
		
	case 4:
		
		System.out.println("What do you want to update");
		System.out.println("1.Name");
		System.out.println("2.Address");
		int uch=Integer.parseInt(sc.nextLine());
		
		if(uch==1) {
			
			 System.out.println("Enter The Id You want to Update :"); 
			 ucid=Integer.parseInt(sc.nextLine());
			 
			 System.out.println("Enter Updated Name"); 
			 cname=sc.nextLine();
			 
			 Customer c1=dao.getById(ucid);
			 c=new Customer(c1.getC_id(),cname,c1.getC_add());
			 dao.updateCustomer(c);
			  System.out.println("Data updated Successfully");
		
		}
		else if(uch==2) {
			
			
			 System.out.println("Enter The Id You want to Update :"); 
			 ucid=Integer.parseInt(sc.nextLine());
			 System.out.println("Enter Updated Address"); 
			 cadd=sc.nextLine();
			
			 
//			 Use this method for retriev specific id data
			 Customer c1=dao.getById(ucid);
			 
			 c=new Customer(c1.getC_id(),c1.getC_name(),cadd);
			 dao.updateCustomer(c);
			 
			  System.out.println("Data updated Successfully");
		
		}
		
		
		
		
		break;
		default :
			System.out.println("Invalid Credential");
		case 0:
			System.out.println("thank You");
			break;
	
	}
		}	
		
		
		
		
		
		
	}

	}


