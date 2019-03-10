package com.example.demo.controller;

import com.example.demo.beans.Merchant;
import com.example.demo.constants.MerchantRespMsg;
import com.example.demo.net.Resp;
import com.example.demo.service.IMerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: Fresher
 * @description: MerchantCpntroller
 * @author: Lei Dong
 * @create: 2018-09-24 19:19
 **/
@RestController
@RequestMapping("/fresher/merchant")
public class MerchantController implements IMerchantController {
    @Autowired
    private IMerchantService merchantService;

    /**
     * 添加商家
     *
     * @param merchant
     * @return
     */
    @Override
    @RequestMapping(value = "/addMerchant", method = RequestMethod.POST)
    @ResponseBody
    public Resp createMerchant(Merchant merchant) {
        merchantService.createMerchant(merchant);
        return new Resp(Resp.RESPCODE_SUCCESS, MerchantRespMsg.SUCCESS_ADD_MERCHANT);
    }

    /**
     * 删除商家
     *
     * @param merchant
     * @return
     */
    @Override
    @RequestMapping(value = "/deleteMerchant", method = RequestMethod.POST)
    @ResponseBody
    public Resp deleteMerchant(Merchant merchant) {
        merchantService.deleteMerchant(merchant);
        return new Resp(Resp.RESPCODE_SUCCESS, MerchantRespMsg.SUCCESS_DELETE_MERCHANT);
    }

    /**
     * 更新商家
     *
     * @param merchant
     * @return
     */
    @Override
    @RequestMapping(value = "/updateMerchant", method = RequestMethod.POST)
    @ResponseBody
    public Resp updateMerchant(Merchant merchant) {
        merchantService.updateMerchant(merchant);
        return new Resp(Resp.RESPCODE_SUCCESS, MerchantRespMsg.SUCCESS_UPDATE_MERCHANT);
    }

    /**
     * 根据id查找商家
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/queryMerchant", method = RequestMethod.POST)
    @ResponseBody
    public Merchant queryMerchant(String id) {
        return merchantService.queryMerchant(id);
    }

    /**
     * 查找全部商家
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/queryMerchants", method = RequestMethod.POST)
    @ResponseBody
    public List<Merchant> queryMerchants() {
        return merchantService.queryMerchants();
    }
}
