package com.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.SubCategory;

import com.test.repository.SubCategoryRepository;

@Service
public class SubCategoryService {
	
	@Autowired
	SubCategoryRepository repo;	
	
	public void addSUbCategory(SubCategory subCategory) {
		repo.save(subCategory);
		
	}

	public void deleteItem(int id) {
		repo.deleteById(id);
		
	}

	public void updateSubCategory(SubCategory subCategory) {
		repo.save(subCategory);
		
	}

	public Optional<SubCategory> getItemById(int itemId) {
		return repo.findById(itemId);
	}

}
