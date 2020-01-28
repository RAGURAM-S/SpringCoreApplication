package com.ragu.learn.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee ragu = new Employee(args[0], args[1]);
		System.out.println(ragu);
		
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("emp-beans.xml"));
		
//		EmployeeCRUD cruds = new EmployeeCRUD();
		
		EmployeeCRUD crud = beanFactory.getBean(EmployeeCRUD.class);
		Employee updatedEmployee = crud.createEmployee(ragu);
		
		System.out.println("Employee creation complete..!");
		System.out.println(updatedEmployee);	
		
		
	}

}