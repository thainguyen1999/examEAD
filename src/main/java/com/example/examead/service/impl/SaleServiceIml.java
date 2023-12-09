package com.example.examead.service.impl;

import com.example.examead.entity.Sale;
import com.example.examead.repository.SaleRepository;
import com.example.examead.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceIml implements SaleService {
    @Autowired
    private SaleRepository saleRepository;
    @Override
    public List<Sale> getAllSale() {
        return saleRepository.findAll();
    }
}
