package com.gittestdemo;

import lombok.Data;


public class Order{
	private String userame;
	private String productname;
	private double amount;
	public Order() {
	
	}
	public Order(String userame, String productname, double amount) {
		super();
		this.userame = userame;
		this.productname = productname;
		this.amount = amount;
	}
	public String getUserame() {
		return userame;
	}
	public void setUserame(String userame) {
		this.userame = userame;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order [userame=" + userame + ", productname=" + productname + ", amount=" + amount + "]";
	}
	
	
	
		
	}
	