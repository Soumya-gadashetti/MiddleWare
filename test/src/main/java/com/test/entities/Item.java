package com.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item extends SubCategory{
	@Column(unique=true)
	private int itemId;
	private String itemName;
	private String price;
	private String itemDescription;
	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int categoryId, String categoryName, double gst) {
		super(categoryId, categoryName, gst);
		// TODO Auto-generated constructor stub
	}
	public Item(int subCategoryId, String subCategoryName, String description) {
		super(subCategoryId, subCategoryName, description);
		// TODO Auto-generated constructor stub
	}
	public Item(int subCategoryId, String subCategoryName, String description, int itemId, String itemName,
			String price, String itemDescription) {
		super(subCategoryId, subCategoryName, description);
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.itemDescription = itemDescription;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
}
