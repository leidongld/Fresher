package com.example.demo.controller;

import com.example.demo.beans.Administrator;
import com.example.demo.net.Resp;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Fresher
 * @description: IAdministratorController
 * @author: Lei Dong
 * @create: 2018-09-24 19:16
 **/
public interface IAdministratorController {
    /**
     * 创建新的管理员
     *
     * @param username
     * @param password
     * @return
     */
    public Resp createAdministrator(String username, String password);

    /**
     * 获取管理员
     *
     * @return
     */
    public Administrator queryAdministrator();
}
