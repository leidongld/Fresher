package com.example.demo.business;

import com.example.demo.beans.Merchant;
import com.example.demo.net.Resp;

import java.util.List;

/**
 * @program: Fresher
 * @description: IMerchantBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:16
 **/
public interface IMerchantBusiness {
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
