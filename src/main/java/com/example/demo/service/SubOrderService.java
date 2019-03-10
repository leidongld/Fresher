package com.example.demo.service;

import com.example.demo.beans.SubOrder;
import com.example.demo.repositories.ISubOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Fresher
 * @description: SubOrderService
 * @author: Lei Dong
 * @create: 2018-09-24 19:27
 **/
@Service
public class SubOrderService implements ISubOrderService {
    @Autowired
    private ISubOrderRepository subOrderRepository;

    /**
     * 添加子订单
     *
     * @param subOrder
     * @return
     */
    @Override
    public void addSubOrder(SubOrder subOrder) {
        subOrderRepository.saveAndFlush(subOrder);
    }

    /**
     * 删除子订单
     *
     * @param subOrder
     * @return
     */
    @Override
    public void deleteSubOrder(SubOrder subOrder) {
        List<SubOrder> subOrderList = new ArrayList<>();
        subOrderList.add(subOrder);
        Iterable<SubOrder> iterable = (Iterable<SubOrder>) subOrderList.iterator();
        subOrderRepository.deleteInBatch(iterable);
    }

    /**
     * 升级子订单
     *
     * @param subOrder
     * @return
     */
    @Override
    public void updateSubOrder(SubOrder subOrder) {
        subOrderRepository.saveAndFlush(subOrder);
    }

    /**
     * 根据id查找子订单
     *
     * @param id
     * @return
     */
    @Override
    public SubOrder querySubOrder(String id) {
        return subOrderRepository.getOne(id);
    }

    /**
     * 查找全部的子订单
     *
     * @return
     */
    @Override
    public List<SubOrder> querySubOrders() {
        return subOrderRepository.findAll();
    }
}
