package com.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name="subCategories")
public class SubCategory extends Category{
	@Column(unique = true)
	private int subCategoryId;
	private String subCategoryName;
	private String description;
	
	
	public SubCategory(int subCategoryId, String subCategoryName, String description) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.description = description;
	}
	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SubCategory(int categoryId, String categoryName, double gst) {
		super(categoryId, categoryName, gst);
		// TODO Auto-generated constructor stub
	}
	public int getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
