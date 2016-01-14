package com.mkyong.common;

import java.util.Map;

public class Customer {

	private Map map;

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Customer [map=" + map + "]";
	}
	
	

}