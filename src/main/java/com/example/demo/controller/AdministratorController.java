package com.example.demo.controller;

import com.example.demo.beans.Administrator;
import com.example.demo.business.IAdministratorBusiness;
import com.example.demo.net.Resp;
import com.example.demo.repository.IAdministratorRepository;
import com.example.demo.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: Fresher
 * @description: AdministratorController
 * @author: Lei Dong
 * @create: 2018-09-24 19:16
 **/
@RestController
public class AdministratorController implements IAdministratorController {
    private IAdministratorBusiness administratorBusiness;

    @Autowired
    private IAdministratorRepository repository;

    /**
     * 添加管理员
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    @RequestMapping(value = "/administrator/createAdministrator", method = RequestMethod.POST)
    public Resp createAdministrator(
            @RequestParam String username,
            @RequestParam String password) {
        Administrator administrator = new Administrator();
        administrator.setId(IDUtils.genUUID());
        administrator.setUsername(username);
        administrator.setPassword(password);
        administratorBusiness.createAdministrator(administrator);
        return new Resp(Resp.RESPCODE_SUCCESS, "添加管理员成功");
    }

    /**
     * 根据id查找管理员
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/administrator/queryAdministrator", method = RequestMethod.POST)
    public Administrator queryAdministrator(@RequestParam String id) {
        return null;
    }

    /**
     * 查找全部的管理员
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/administrator/queryAdministrators", method = RequestMethod.POST)
    public List<Administrator> queryAdministrators() {
        return null;
    }


    /**
     * 测试接口
     *
     * @return
     */
    @PostMapping(value = "/testPost")
    public Resp testPost() {
        return new Resp(Resp.RESPCODE_SUCCESS, "post success");
    }
}
