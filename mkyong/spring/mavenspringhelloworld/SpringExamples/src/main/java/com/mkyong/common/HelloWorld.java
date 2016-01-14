package com.mkyong.common;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;
        // comment and another comment and a third comment and a fourth comment
	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
	}
}
