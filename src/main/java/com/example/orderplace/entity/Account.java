package com.example.orderplace.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Account {
	
	@Id
	private Long accountId;
	private String bankName;
	private double amount;
	
   

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Long accountId, String bankName, double amount) {
		super();
		this.accountId = accountId;
		this.bankName = bankName;
		this.amount = amount;
		
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
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

	

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", bankName=" + bankName + ", amount=" + amount + "]";
	}
	
	

}
