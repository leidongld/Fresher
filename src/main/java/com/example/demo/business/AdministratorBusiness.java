package com.example.demo.business;

import com.example.demo.beans.Administrator;
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
    public void createAdministrator(Administrator administrator) {
        administratorService.createAdministrator(administrator);
    }

    /**
     * 查找全部的管理员
     *
     * @return
     */
    @Override
    public List<Administrator> queryAdministrators() {
        return administratorService.queryAdministrators();
    }

    /**
     * 根据id删除管理员
     *
     * @param administrator
     * @return
     */
    @Override
    public void deleteAdministrator(Administrator administrator) {
        administratorService.deleteAdministrator(administrator);
    }

    @Override
    public Administrator queryAdministrator(String id) {
        return administratorService.queryAdministrator(id);
    }

    /**
     * 更新管理员信息
     *
     * @param administrator
     * @return
     */
    @Override
    public void updateAdministrator(Administrator administrator) {
        administratorService.updateAdministrator(administrator);
    }
}
