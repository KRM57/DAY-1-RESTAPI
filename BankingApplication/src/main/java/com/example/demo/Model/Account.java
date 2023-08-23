package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
   private int accNo;
   private String name;
   private long  PhoneNo;
   private int balance;
   
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(int accNo, String name, int phoneNo, int balance) {
	super();
	this.accNo = accNo;
	this.name = name;
	PhoneNo = phoneNo;
	this.balance = balance;
}
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhoneNo() {
	return PhoneNo;
}
public void setPhoneNo(long  phoneNo) {
	PhoneNo = phoneNo;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
   
}
