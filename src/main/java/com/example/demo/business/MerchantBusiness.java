package com.example.demo.business;

import com.example.demo.beans.Merchant;
import com.example.demo.net.Resp;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: Fresher
 * @description: MerchantBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:16
 **/
public class MerchantBusiness implements IMerchantBusiness {
    @Autowired
    private IMerchantBusiness merchantBusiness;

    /**
     * 创建商家
     *
     * @param merchant
     * @return
     */
    @Override
    public Resp createMerchant(Merchant merchant) {
        return null;
    }

    /**
     * 删除商家
     *
     * @param id
     * @return
     */
    @Override
    public Resp deleteMerchant(String id) {
        return null;
    }

    /**
     * 更新商家
     *
     * @param merchant
     * @return
     */
    @Override
    public Resp updateMerchant(Merchant merchant) {
        return null;
    }

    /**
     * 根据id查找商家
     *
     * @param id
     * @return
     */
    @Override
    public Merchant queryMerchant(String id) {
        return null;
    }

    /**
     * 查找全部商家
     *
     * @return
     */
    @Override
    public List<Merchant> queryMerchants() {
        return null;
    }
}
