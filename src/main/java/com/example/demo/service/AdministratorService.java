package com.example.demo.service;

import com.example.demo.beans.Administrator;
import com.example.demo.repository.IAdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: Fresher
 * @description: AdministratorService
 * @author: Lei Dong
 * @create: 2018-09-24 19:22
 **/
@Service
public class AdministratorService implements IAdministratorService {
    @Autowired
    private IAdministratorRepository administratorRepository;

    /**
     * 新建管理员
     *
     * @param username
     * @param password
     */
    @Override
    public void createAdministrator(String username, String password) {
        administratorRepository.save(new Administrator(username, password, "雷栋", "13167199205", "13167099826", "394900130@qq.com"));
    }
}
