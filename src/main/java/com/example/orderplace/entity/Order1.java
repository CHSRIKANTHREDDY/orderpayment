package com.example.orderplace.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Order1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	private double accId;
	private String bankName;
	private double amount;
	private String status;
	
	
	public Order1() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Order1(Long orderId, double accId, String bankName, double amount, String status) {
		super();
		this.orderId = orderId;
		this.accId = accId;
		this.bankName = bankName;
		this.amount = amount;
		this.status = status;
	}


	public Long getOrderId() {
		return orderId;
	}


	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}


	public double getAccId() {
		return accId;
	}


	public void setAccId(double accId) {
		this.accId = accId;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", accId=" + accId + ", bankName=" + bankName + ", amount=" + amount
				+ ", status=" + status + "]";
	}
	
	
	
	

}
