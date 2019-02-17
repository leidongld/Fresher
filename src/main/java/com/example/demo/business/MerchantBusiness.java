package com.example.demo.business;

import com.example.demo.beans.Merchant;
import com.example.demo.service.IMerchantService;
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
    private IMerchantService merchantService;

    /**
     * 创建商家
     *
     * @param merchant
     * @return
     */
    @Override
    public void createMerchant(Merchant merchant) {
        merchantService.createMerchant(merchant);
    }

    /**
     * 删除商家
     *
     * @param merchant
     * @return
     */
    @Override
    public void deleteMerchant(Merchant merchant) {
        merchantService.deleteMerchant(merchant);
    }

    /**
     * 更新商家
     *
     * @param merchant
     * @return
     */
    @Override
    public void updateMerchant(Merchant merchant) {
        merchantService.updateMerchant(merchant);
    }

    /**
     * 根据id查找商家
     *
     * @param id
     * @return
     */
    @Override
    public Merchant queryMerchant(String id) {
        return merchantService.queryMerchant(id);
    }

    /**
     * 查找全部商家
     *
     * @return
     */
    @Override
    public List<Merchant> queryMerchants() {
        return merchantService.queryMerchants();
    }
}
