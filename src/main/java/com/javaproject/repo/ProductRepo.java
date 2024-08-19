package com.javaproject.repo;

import org.springframework.data.repository.CrudRepository;

import com.javaproject.entity.Product;
import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long>{
    List<Product> findByNameContains(String keyword);
}