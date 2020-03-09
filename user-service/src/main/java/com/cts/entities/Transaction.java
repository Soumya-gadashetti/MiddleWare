//package com.cts.entities;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//import javax.persistence.ManyToOne;
//
//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//public class Transaction {
//
//	@Id
//	private Long transactionId;
//	private String type;
//	private String dateTime;
//	private double amount;
//	private double balance;
//	@ManyToOne
//	private User user;
//
//	public Long getTransactionId() {
//		return transactionId;
//	}
//
//	public void setTransactionId(Long transactionId) {
//		this.transactionId = transactionId;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	public String getDateTime() {
//		return dateTime;
//	}
//
//	public void setDateTime(String dateTime) {
//		this.dateTime = dateTime;
//	}
//
//	public double getAmount() {
//		return amount;
//	}
//
//	public void setAmount(double amount) {
//		this.amount = amount;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public Transaction(Long transactionId, String type, String dateTime, double amount, double balance, User user) {
//		super();
//		this.transactionId = transactionId;
//		this.type = type;
//		this.dateTime = dateTime;
//		this.amount = amount;
//		this.balance = balance;
//		this.user = user;
//	}
//
//	public Transaction() {
//		super();
//	}
//
//}
