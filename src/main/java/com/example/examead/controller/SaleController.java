package com.example.examead.controller;

import com.example.examead.entity.Sale;
import com.example.examead.repository.SaleRepository;
import com.example.examead.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping("/getAll")
    public String getAllSales(ModelMap model) {
        String view = "sales";
        try {
            List<Sale> sales= saleService.getAllSale();
            model.addAttribute("sales", sales);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

        return view;
    }
}
