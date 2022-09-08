package com.example.gccoffee.repository;

import com.example.gccoffee.model.Category;
import com.example.gccoffee.model.Product;
import java.util.*;

public interface ProductRepository {
    List<Product> findAll();
    Product insert(Product product);
    Product update(Product product);

    Optional<Product> findById(UUID productId);
    Optional<Product> findByName(String productName);

    List<Product> findByCategory(Category category);

    void deleteAll();
}
