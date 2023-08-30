package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loan {
	@Id
  private int loanId;
  private String loanType;
  private String loanAmount;
  private int interest;
public Loan() {
	super();
	// TODO Auto-generated constructor stub
}
public Loan(int loanId, String loanType, String loanAmount, int interest) {
	super();
	this.loanId = loanId;
	this.loanType = loanType;
	this.loanAmount = loanAmount;
	this.interest = interest;
}
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public String getLoanType() {
	return loanType;
}
public void setLoanType(String loanType) {
	this.loanType = loanType;
}
public String getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(String loanAmount) {
	this.loanAmount = loanAmount;
}
public int getInterest() {
	return interest;
}
public void setInterest(int interest) {
	this.interest = interest;
}
  
}
