package com.springboot.security.service;

import com.springboot.security.model.Product;

import java.util.List;

public interface ProductService
{
    Product addProduct(Product product);

    List<Product> getAllProducts();

    Product getProduct(Integer productId);

    void deleteProduct(Integer productId);

}
