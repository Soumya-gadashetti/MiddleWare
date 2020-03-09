package com.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.entities.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item,Integer>{

}
