package com.example.demo.business;

import com.example.demo.beans.Administrator;
import com.example.demo.net.Resp;
import com.example.demo.service.IAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: Fresher
 * @description: AdministratorBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:15
 **/
public class AdministratorBusiness implements IAdministratorBusiness {
    @Autowired
    private IAdministratorService administratorService;

    /**
     * 创建管理员
     *
     * @param administrator
     * @return
     */
    @Override
    public Resp createAdministrator(Administrator administrator) {
        return administratorService.createAdministrator(administrator);
    }

    /**
     * 查找全部的管理员
     *
     * @return
     */
    @Override
    public List<Administrator> queryAdministrators() {
        return null;
    }

    /**
     * 根据id删除管理员
     *
     * @param id
     * @return
     */
    @Override
    public Resp deleteAdministrator(String id) {
        return null;
    }

    @Override
    public Administrator queryAdministrator(String id) {
        return null;
    }

    /**
     * 更新管理员信息
     *
     * @param administrator
     * @return
     */
    @Override
    public Resp updateAdministrator(Administrator administrator) {
        return null;
    }
}
