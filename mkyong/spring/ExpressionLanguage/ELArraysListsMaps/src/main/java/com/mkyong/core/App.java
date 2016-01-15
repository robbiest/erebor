package com.mkyong.core;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class App {
	public static void main(String[] args) {
	    //ApplicationContext context = new ClassPathXmlApplicationContext("EquivalentBean.xml");
 
	    //Customer obj = (Customer) context.getBean("customerBean");
	    //System.out.println(obj);

	    
	    ApplicationContext other = new ClassPathXmlApplicationContext("SpringBeansAnno.xml");
	    
	    Customer ooo = (Customer) other.getBean("customerBean");
	    System.out.println(ooo);	    
	}
}