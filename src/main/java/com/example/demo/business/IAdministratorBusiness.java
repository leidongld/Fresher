package com.example.demo.business;

import com.example.demo.beans.Administrator;

import java.util.List;

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
