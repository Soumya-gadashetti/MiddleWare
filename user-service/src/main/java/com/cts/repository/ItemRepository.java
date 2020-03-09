package com.cts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entities.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

}
