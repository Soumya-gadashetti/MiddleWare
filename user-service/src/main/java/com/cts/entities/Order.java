//package com.cts.entities;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.ManyToMany;
//
//@Entity
//public class Order extends Transaction{
//
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long orderId;
//	@ManyToMany
//	private List<Item> items;
//
//	public List<Item> getItems() {
//		return items;
//	}
//
//	public void setItems(List<Item> items) {
//		this.items = items;
//	}
//
//	public Long getOrderId() {
//		return orderId;
//	}
//
//	public void setOrderId(Long orderId) {
//		this.orderId = orderId;
//	}
//
//	public Order(Long transactionId, String type, String dateTime, double amount, double balance, User user,
//			Long orderId, List<Item> items) {
//		super(transactionId, type, dateTime, amount, balance, user);
//		this.orderId = orderId;
//		this.items = items;
//	}
//
//
//	
//}
