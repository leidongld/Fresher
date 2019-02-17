package com.example.demo.service;

import com.example.demo.beans.Administrator;

import java.util.List;

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
     * @param administrator
     */
    void createAdministrator(Administrator administrator);

    /**
     * 查找全部的管理员
     *
     * @return
     */
    List<Administrator> queryAdministrators();

    /**
     * 根据id删除管理员
     *
     * @param administrator
     * @return
     */
    void deleteAdministrator(Administrator administrator);

    /**
     * 根据id查找管理员
     *
     * @param id
     * @return
     */
    Administrator queryAdministrator(String id);

    /**
     * 更新管理员信息
     *
     * @param administrator
     * @return
     */
    void updateAdministrator(Administrator administrator);


}
