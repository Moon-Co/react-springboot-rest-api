package com.example.gccoffee.controller;


import com.example.gccoffee.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    private final ProductService productService;

    //restcontroll이 아니라, 관리자가 webpage를 접속할 수 있게 만드는 view를 만든다.
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String productPage(Model model){
        var products = productService.getAllProduct();
        model.addAttribute("products",products);
        return "product-list";
    }
}
