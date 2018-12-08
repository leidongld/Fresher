package com.example.demo.service;

/**
 * @program: Fresher
 * @description: IAdministratorService
 * @author: Lei Dong
 * @create: 2018-09-24 19:21
 **/
public interface IAdministratorService {
    /**
     * 新建管理员
     *
     * @param username
     * @param password
     */
    void createAdministrator(String username, String password);
}
