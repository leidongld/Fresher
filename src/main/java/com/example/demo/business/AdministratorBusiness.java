package com.example.demo.business;

import com.example.demo.service.AdministratorService;
import com.example.demo.service.IAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: Fresher
 * @description: AdministratorBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:15
 **/
public class AdministratorBusiness implements IAdministratorBusiness {
    @Autowired
    private IAdministratorService administratorService;

    @Override
    public void createAdministrator(String username, String password) {
        administratorService.createAdministrator(username, password);
    }
}
