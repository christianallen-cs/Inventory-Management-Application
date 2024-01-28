package com.example.demo.controllers;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BuyController {

    @Autowired
    private ProductService productService;

    @GetMapping("/mainscreen/{productId}")
    public String executeBuyButton(@PathVariable Long productId) {
        if (productService.totalInventory(productId) > 0) {
            productService.decrInventory(productId);
            return "succpurchase";
        } else {
            return "failpurchase";
        }
    }
}
