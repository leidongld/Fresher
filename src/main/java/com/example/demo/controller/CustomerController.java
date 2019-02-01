package com.example.demo.controller;

import com.example.demo.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Fresher
 * @description: CustomerController
 * @author: Lei Dong
 * @create: 2018-09-24 19:17
 **/
@RestController
public class CustomerController implements ICustomerController {
    @Autowired
    private ICustomerRepository repository;


}
