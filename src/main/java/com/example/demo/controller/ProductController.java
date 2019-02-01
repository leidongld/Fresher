package com.example.demo.controller;

import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Fresher
 * @description: ProductController
 * @author: Lei Dong
 * @create: 2018-09-24 19:20
 **/
@RestController
public class ProductController implements IProductController {
    @Autowired
    private IProductRepository repository;


}
