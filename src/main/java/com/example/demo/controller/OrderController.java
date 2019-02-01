package com.example.demo.controller;

import com.example.demo.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Fresher
 * @description: OrderController
 * @author: Lei Dong
 * @create: 2018-09-24 19:19
 **/
@RestController
public class OrderController {
    @Autowired
    private IOrderRepository repository;
}
