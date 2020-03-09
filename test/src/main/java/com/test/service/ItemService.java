package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.Item;
import com.test.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository repo;

	public List<Item> getItems() {
		return (List<Item>) repo.findAll();
	}

	public Optional<Item> getItemById(Integer itemId) {
		return repo.findById(itemId);
	}

	public void addItem(Item item) {
		repo.save(item);
		
	}

	public void deleteItem(Integer itemId) {
		repo.deleteById(itemId);
		
	}

	public void updateItem(Item item) {
		repo.save(item);
		
	}


}
