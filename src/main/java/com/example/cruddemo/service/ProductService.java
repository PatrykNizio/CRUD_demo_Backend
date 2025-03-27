package com.example.cruddemo.service;

import com.example.cruddemo.models.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Integer id);
    Product updateProduct(Integer id, Product product);
    void deleteProduct(Integer id);
}