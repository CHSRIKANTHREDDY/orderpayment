package com.example.orderplace.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String name;
	private String address;
	
	 @OneToMany(targetEntity = Account.class ,cascade = CascadeType.ALL)
	 @JoinColumn(name="user_id",referencedColumnName = "userId")
	private List<Account> acc= new ArrayList<Account>();
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}






	public User(Long userId, String name, String address, List<Account> acc) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.acc = acc;
	}






	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}







	public List<Account> getAcc() {
		return acc;
	}



	public void setAcc(List<Account> acc) {
		this.acc = acc;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", address=" + address + ", acc=" + acc + "]";
	}

	
	
}
