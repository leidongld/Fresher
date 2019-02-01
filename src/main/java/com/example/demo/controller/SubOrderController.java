package com.example.demo.controller;

import com.example.demo.repository.ISubOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Fresher
 * @description: SubOrderController
 * @author: Lei Dong
 * @create: 2018-09-24 19:21
 **/
@RestController
public class SubOrderController implements ISubOrderController {
    @Autowired
    private ISubOrderRepository repository;


}
