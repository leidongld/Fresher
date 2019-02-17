package com.example.demo.controller;

import com.example.demo.beans.Merchant;
import com.example.demo.business.IMerchantBusiness;
import com.example.demo.constants.MerchantRespMsg;
import com.example.demo.net.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: Fresher
 * @description: MerchantCpntroller
 * @author: Lei Dong
 * @create: 2018-09-24 19:19
 **/
@RestController
public class MerchantController implements IMerchantController {
    @Autowired
    private IMerchantBusiness merchantBusiness;

    /**
     * 添加商家
     *
     * @param merchant
     * @return
     */
    @Override
    @RequestMapping(value = "/merchant/addMerchant", method = RequestMethod.POST)
    public Resp createMerchant(Merchant merchant) {
        merchantBusiness.createMerchant(merchant);
        return new Resp(Resp.RESPCODE_SUCCESS, MerchantRespMsg.SUCCESS_ADD_MERCHANT);
    }

    /**
     * 删除商家
     *
     * @param merchant
     * @return
     */
    @Override
    @RequestMapping(value = "/merchant/deleteMerchant", method = RequestMethod.POST)
    public Resp deleteMerchant(Merchant merchant) {
        merchantBusiness.deleteMerchant(merchant);
        return new Resp(Resp.RESPCODE_SUCCESS, MerchantRespMsg.SUCCESS_DELETE_MERCHANT);
    }

    /**
     * 更新商家
     *
     * @param merchant
     * @return
     */
    @Override
    @RequestMapping(value = "/merchant/updateMerchant", method = RequestMethod.POST)
    public Resp updateMerchant(Merchant merchant) {
        merchantBusiness.updateMerchant(merchant);
        return new Resp(Resp.RESPCODE_SUCCESS, MerchantRespMsg.SUCCESS_UPDATE_MERCHANT);
    }

    /**
     * 根据id查找商家
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/merchant/queryMerchant", method = RequestMethod.POST)
    public Merchant queryMerchant(String id) {
        return merchantBusiness.queryMerchant(id);
    }

    /**
     * 查找全部商家
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/merchant/queryMerchants", method = RequestMethod.POST)
    public List<Merchant> queryMerchants() {
        return merchantBusiness.queryMerchants();
    }
}
