package com.mkyong.common;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;
        // comment
	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
	}
}
