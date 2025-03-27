package com.example.cruddemo.service;

import com.example.cruddemo.models.Product;
import com.example.cruddemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById((long)id).orElse(null);
    }

    @Override
    public Product updateProduct(Integer id, Product product) {
        Product existing = productRepository.findById((long)id).orElse(null);
        if (existing != null) {
            existing.setProductName(product.getProductName());
            existing.setKeyword(product.getKeyword());
            existing.setBidAmount(product.getBidAmount());
            existing.setStatus(product.getStatus());
            existing.setCompany(product.getCompany());
            return productRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById((long)id);
    }
}