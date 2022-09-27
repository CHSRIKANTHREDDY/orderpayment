package com.example.orderplace.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	private String productName;
	private double amount;
	
	
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public product(Long productId, String productName, double amount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.amount = amount;
	}


	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "product [productId=" + productId + ", productName=" + productName + ", amount=" + amount + "]";
	}
	
	
	
	
	

}
