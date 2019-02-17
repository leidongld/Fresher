package com.example.demo.service;

import com.example.demo.beans.Administrator;
import com.example.demo.repository.IAdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
     * 创建管理员
     *
     * @param administrator
     * @return
     */
    @Override
    public void createAdministrator(Administrator administrator) {
        administratorRepository.saveAndFlush(administrator);
    }

    /**
     * 查找全部的管理员
     *
     * @return
     */
    @Override
    public List<Administrator> queryAdministrators() {
        List<Administrator> administratorList = administratorRepository.findAll();
        return administratorList;
    }

    /**
     * 删除管理员
     *
     * @param administrator
     * @return
     */
    @Override
    public void deleteAdministrator(Administrator administrator) {
        administratorRepository.deleteInBatch(administrator);
    }

    /**
     * 根据id查找管理员
     *
     * @param id
     * @return
     */
    @Override
    public Administrator queryAdministrator(String id) {
        Administrator administrator = administratorRepository.getOne(id);
        return administrator;
    }

    /**
     * 更新管理员
     *
     * @param administrator
     * @return
     */
    @Override
    public void updateAdministrator(Administrator administrator) {
        administratorRepository.saveAndFlush(administrator);
    }
}
