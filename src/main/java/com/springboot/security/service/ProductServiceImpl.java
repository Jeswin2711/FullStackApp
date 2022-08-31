package com.springboot.security.service;

import com.springboot.security.model.Product;
import com.springboot.security.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Integer productId) {
        return productRepository.getById(productId);
    }

    @Override
    public void deleteProduct(Integer productId) {
        productRepository.deleteById(productId);
        System.out.println("Deleted Successfully");
    }
}
