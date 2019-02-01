package com.example.demo.controller;

import com.example.demo.repository.IMerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Fresher
 * @description: MerchantCpntroller
 * @author: Lei Dong
 * @create: 2018-09-24 19:19
 **/
@RestController
public class MerchantCpntroller implements IMerchantCpntroller {
    @Autowired
    private IMerchantRepository repository;



}
