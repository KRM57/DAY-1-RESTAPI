package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transaction {
   @Id
   private int  transactionID ;
   private String date;
   private float amount;
   private String type;
public Transaction() {
	super();
	// TODO Auto-generated constructor stub
}
public Transaction(int transactionID, String date, float amount, String type) {
	super();
	this.transactionID = transactionID;
	this.date = date;
	this.amount = amount;
	this.type = type;
}
public int getTransactionID() {
	return transactionID;
}
public void setTransactionID(int transactionID) {
	this.transactionID = transactionID;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
   
   
}
