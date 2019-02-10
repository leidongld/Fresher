package com.example.demo.service;

import com.example.demo.beans.Merchant;
import com.example.demo.net.Resp;
import com.example.demo.repository.IMerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: Fresher
 * @description: MerchantService
 * @author: Lei Dong
 * @create: 2018-09-24 19:25
 **/
@Service
public class MerchantService implements IMerchantService {
    @Autowired
    private IMerchantRepository merchantRepository;

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
