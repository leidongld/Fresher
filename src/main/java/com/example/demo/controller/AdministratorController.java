package com.example.demo.controller;

import com.example.demo.beans.Administrator;
import com.example.demo.business.AdministratorBusiness;
import com.example.demo.net.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.TextUI;

/**
 * @program: Fresher
 * @description: AdministratorController
 * @author: Lei Dong
 * @create: 2018-09-24 19:16
 **/
@RestController
public class AdministratorController implements IAdministratorController {
    private AdministratorBusiness administratorBusiness;

    @Override
    public Resp createAdministrator(
            @RequestParam String username,
            @RequestParam String password) {
        if (null == username || 0 == username.length()) {
            return new Resp(Resp.RESPCODE_LACK_PARAM, "username不能为空");
        } else if (null == password || 0 == password.length()) {
            return new Resp(Resp.RESPCODE_LACK_PARAM, "password不能为空");
        } else {
            administratorBusiness.createAdministrator(username, password);
            return new Resp(Resp.RESPCODE_SUCCESS, "添加管理员成功");
        }
    }

    @Override
    public Administrator queryAdministrator() {
        return null;
    }
}
