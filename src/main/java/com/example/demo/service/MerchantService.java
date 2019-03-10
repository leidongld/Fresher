package com.example.demo.service;

import com.example.demo.beans.Merchant;
import com.example.demo.repositories.IMerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public void createMerchant(Merchant merchant) {
        merchantRepository.saveAndFlush(merchant);
    }

    /**
     * 删除商家
     *
     * @param merchant
     * @return
     */
    @Override
    public void deleteMerchant(Merchant merchant) {
        List<Merchant> merchantList = new ArrayList<>();
        merchantList.add(merchant);
        Iterable<Merchant> iterable = (Iterable<Merchant>) merchantList.iterator();
        merchantRepository.deleteInBatch(iterable);
    }

    /**
     * 更新商家
     *
     * @param merchant
     * @return
     */
    @Override
    public void updateMerchant(Merchant merchant) {
        merchantRepository.saveAndFlush(merchant);
    }

    /**
     * 根据id查找商家
     *
     * @param id
     * @return
     */
    @Override
    public Merchant queryMerchant(String id) {
        return merchantRepository.getOne(id);
    }

    /**
     * 查找全部商家
     *
     * @return
     */
    @Override
    public List<Merchant> queryMerchants() {
        return merchantRepository.findAll();
    }
}
