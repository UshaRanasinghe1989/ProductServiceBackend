package com.icetteam.crm.product_service.controller;

import com.icetteam.crm.product_service.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @PostMapping()
    Product persist(@RequestBody Product product){
        return null;
    }

}
