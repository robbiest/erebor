package com.mkyong.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class CustomerAnn {

	@Value("#{itemBean}")
	private Item item;

	@Value("#{itemBean.name}")
	private String itemName;

	//...

}
