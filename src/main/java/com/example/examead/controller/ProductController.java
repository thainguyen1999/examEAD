package com.example.examead.controller;

import ch.qos.logback.core.model.Model;
import com.example.examead.entity.Product;
import com.example.examead.repository.ProductRepository;
import com.example.examead.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;


     @GetMapping("/getAll")
    public String getAllProduct(ModelMap model){
         String view = "products";
         try {
             List<Product> products = productService.getAllProduct();
             model.addAttribute("products", products);

         }catch (Exception e){
             System.err.println(e.getMessage());;
         }

         return view;
     }
}
