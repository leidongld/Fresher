package com.example.demo.service;

import com.example.demo.beans.Merchant;

import java.util.List;

/**
 * @program: Fresher
 * @description: IMerchantService
 * @author: Lei Dong
 * @create: 2018-09-24 19:23
 **/
public interface IMerchantService {
    /**
     * 创建商家
     *
     * @param merchant
     * @return
     */
    void createMerchant(Merchant merchant);

    /**
     * 删除商家
     *
     * @param merchant
     * @return
     */
    void deleteMerchant(Merchant merchant);

    /**
     * 更新商家
     *
     * @param merchant
     * @return
     */
    void updateMerchant(Merchant merchant);

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
