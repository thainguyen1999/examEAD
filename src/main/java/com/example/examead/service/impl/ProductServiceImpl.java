package com.example.examead.service.impl;

import com.example.examead.entity.Product;
import com.example.examead.repository.ProductRepository;
import com.example.examead.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
