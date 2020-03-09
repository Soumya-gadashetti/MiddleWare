package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.Item;

import com.test.service.ItemService;

@RestController
	@RequestMapping("/item")
	public class ItemController {

		@Autowired
		private ItemService service;

		@RequestMapping("/all")
		List<Item> getAll() {
			return service.getItems();
		}

		@RequestMapping("/{itemId}")
		Optional<Item> getById(@PathVariable Integer itemId) {
			return service.getItemById(itemId);
		}

		@RequestMapping(method=RequestMethod.POST,value="/add")
		void addItem(@RequestBody Item item) {
			service.addItem(item);
		}
		@RequestMapping(method = RequestMethod.DELETE, value = "/{itemId}")
		void deleteCategoryById(@PathVariable Integer itemId) {
			service.deleteItem(itemId);
		}

		@RequestMapping(method = RequestMethod.PUT)
		void updateItem(@RequestBody Item item) {
			service.updateItem(item);
		}
	}


