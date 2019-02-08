package com.example.demo.controller;

import com.example.demo.beans.Merchant;
import com.example.demo.net.Resp;

import java.util.List;

/**
 * @program: Fresher
 * @description: IMerchantController
 * @author: Lei Dong
 * @create: 2018-09-24 19:18
 **/
public interface IMerchantController {
    /**
     * 创建商家
     *
     * @param merchant
     * @return
     */
    Resp createMerchant(Merchant merchant);

    /**
     * 删除商家
     *
     * @param id
     * @return
     */
    Resp deleteMerchant(String id);

    /**
     * 更新商家
     *
     * @param merchant
     * @return
     */
    Resp updateMerchant(Merchant merchant);

    /**
     * 查找商家
     *
     * @param id
     * @return
     */
    Merchant queryMerchant(String id);

    /**
     * 查找全部的商家
     *
     * @return
     */
    List<Merchant> queryMerchants();
}
