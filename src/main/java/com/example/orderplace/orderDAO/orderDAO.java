package com.example.orderplace.orderDAO;

import com.example.orderplace.entity.Account;
import com.example.orderplace.entity.User;

public class orderDAO {
	
	private String name;
	private double accId;
	private String bankName;
	private double amount;
	private String status;
	private Account acc;
	private User user;
	
	
	public orderDAO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public orderDAO(String name, double accId, String bankName, double amount, String status, Account acc, User user) {
		super();
		this.name = name;
		this.accId = accId;
		this.bankName = bankName;
		this.amount = amount;
		this.status = status;
		this.acc = acc;
		this.user = user;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public Account getAcc() {
		return acc;
	}


	public void setAcc(Account acc) {
		this.acc = acc;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "orderDAO [name=" + name + ", accId=" + accId + ", bankName=" + bankName + ", amount=" + amount
				+ ", status=" + status + ", acc=" + acc + ", user=" + user + "]";
	}
	
	
	

}
