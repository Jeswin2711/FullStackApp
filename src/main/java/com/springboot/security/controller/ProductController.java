package com.springboot.security.controller;

import com.springboot.security.model.Product;
import com.springboot.security.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController
{
    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public void save(@RequestBody Product product)
    {
        productService.addProduct(product);
    }

    @GetMapping("/get/{id}")
    public void getProductById(@PathVariable int id)
    {
        productService.getProduct(id);
    }

    @GetMapping("/getall")
    public List<Product> getAll()
    {
        return productService.getAllProducts();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(int id)
    {
        productService.deleteProduct(id);
    }
}
