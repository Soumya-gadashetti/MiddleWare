package com.cts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entities.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
