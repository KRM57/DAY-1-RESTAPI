package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Account {
  @Id
  private int accountNo ;
  private String accountType;
  private float Balance;
  @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
  @JoinColumn(name="fk_accountNo")
  private List<Transaction> tr;
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(int accountNo, String accountType, float balance, List<Transaction> tr) {
	super();
	this.accountNo = accountNo;
	//this.customerID = customerID;
	this.accountType = accountType;
	Balance = balance;
	this.tr = tr;
}
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public float getBalance() {
	return Balance;
}
public void setBalance(float balance) {
	Balance = balance;
}
public List<Transaction> getTr() {
	return tr;
}
public void setTr(List<Transaction> tr) {
	this.tr = tr;
} 
  
 
}
