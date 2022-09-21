package com.example.gccoffee.service;

import com.example.gccoffee.model.Category;
import com.example.gccoffee.model.Product;
import java.util.*;

public interface ProductService {
    List<Product> getProductByCategory(Category category);
    List<Product> getAllProduct();

    Product createProduct(String productName,Category category, long price);
    Product createProduct(String productName,Category category, long price,String description);
}
