package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"StandardBean.xml");

		Customer cust = (Customer) context.getBean("CustomerBean");
		System.out.println(cust);
		
		
		ApplicationContext other = new ClassPathXmlApplicationContext(
				"UtilList.xml");

		Customer ss = (Customer) other.getBean("CustomerBean");
		System.out.println(ss);
	}
}