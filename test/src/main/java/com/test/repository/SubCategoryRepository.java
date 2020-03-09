package com.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.entities.SubCategory;
@Repository
public interface SubCategoryRepository extends CrudRepository<SubCategory,Integer>{

}
