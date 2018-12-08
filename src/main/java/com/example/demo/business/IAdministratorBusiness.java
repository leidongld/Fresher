package com.example.demo.business;

/**
 * @program: Fresher
 * @description: IAdministratorBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:14
 **/
public interface IAdministratorBusiness {
    /**
     * 新建管理员
     *
     * @param username
     * @param password
     */
    void createAdministrator(String username, String password);
}
