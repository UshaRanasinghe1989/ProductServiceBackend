package com.icetteam.crm.product_service.controller;

import com.icetteam.crm.product_service.model.Product;
import com.icetteam.crm.product_service.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;
    @PostMapping()
    Product persist(@RequestBody Product product){
        return null;
    }

}
