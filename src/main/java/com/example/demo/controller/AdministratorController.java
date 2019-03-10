package com.example.demo.controller;

import com.example.demo.beans.Administrator;
import com.example.demo.constants.AdministratorRespMsg;
import com.example.demo.net.Resp;
import com.example.demo.service.IAdministratorService;
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
@RequestMapping("/fresher/administrator")
public class AdministratorController implements IAdministratorController {
    @Autowired
    private IAdministratorService administratorService;

    /**
     * 添加管理员
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    @RequestMapping(value = "/createAdministrator", method = RequestMethod.POST)
    @ResponseBody
    public Resp createAdministrator(
            @RequestParam String username,
            @RequestParam String password) {
        Administrator administrator = new Administrator();
        administrator.setId(IDUtils.genUUID());
        administrator.setUsername(username);
        administrator.setPassword(password);
        administratorService.createAdministrator(administrator);
        return new Resp(Resp.RESPCODE_SUCCESS, AdministratorRespMsg.SUCCESS_ADD_ADMINISTRATOR);
    }

    /**
     * 根据id查找管理员
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/queryAdministrator", method = RequestMethod.POST)
    @ResponseBody
    public Administrator queryAdministrator(@RequestParam String id) {
        return administratorService.queryAdministrator(id);
    }

    /**
     * 查找全部的管理员
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/queryAdministrators", method = RequestMethod.POST)
    @ResponseBody
    public List<Administrator> queryAdministrators() {
        return administratorService.queryAdministrators();
    }

    /**
     * 更新管理员信息
     *
     * @param administrator
     * @return
     */
    @Override
    @RequestMapping(value = "/updateAdministartor", method = RequestMethod.POST)
    @ResponseBody
    public Resp updateAdministrator(Administrator administrator) {
        administratorService.updateAdministrator(administrator);
        return new Resp(Resp.RESPCODE_SUCCESS, AdministratorRespMsg.SUCCESS_UPDATE_ADMINISTRATOR);
    }

    /**
     * 删除管理员
     *
     * @param administrator
     * @return
     */
    @Override
    @RequestMapping(value = "/deleteAdministrator")
    @ResponseBody
    public Resp deleteAdministrator(Administrator administrator) {
        administratorService.deleteAdministrator(administrator);
        return new Resp(Resp.RESPCODE_SUCCESS, AdministratorRespMsg.SUCCESS_DELETE_ADMINISTRATOR);
    }
}
