package com.example.scottsmiracleagromvp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value ="/api/v1/products" ,produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    @GetMapping("/getProducts")
    public ResponseEntity<Map<String,String>> getProductDetails(){
        Map<String,String> productMap = new HashMap<>();
        productMap.put("test1Product","testValue");
        return ResponseEntity.ok(productMap);
    }
}
