package com.example.demo.business;

import com.example.demo.beans.SubOrder;
import com.example.demo.service.ISubOrderService;

import java.util.List;

/**
 * @program: Fresher
 * @description: SubOrderBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:19
 **/
public class SubOrderBusiness implements ISubOrderBusiness {
    private ISubOrderService subOrderService;

    /**
     * 添加子订单
     *
     * @param subOrder
     */
    @Override
    public void addSubOrder(SubOrder subOrder) {
        subOrderService.addSubOrder(subOrder);
    }

    /**
     * 删除子订单
     *
     * @param subOrder
     */
    @Override
    public void deleteSubOrder(SubOrder subOrder) {
        subOrderService.deleteSubOrder(subOrder);
    }

    /**
     * 更新子订单
     *
     * @param subOrder
     */
    @Override
    public void updateSubOrder(SubOrder subOrder) {
        subOrderService.updateSubOrder(subOrder);
    }

    /**
     * 根据id查找子订单
     *
     * @param id
     * @return
     */
    @Override
    public SubOrder querySubOrder(String id) {
        return subOrderService.querySubOrder(id);
    }

    /**
     * 查找全部的子订单
     *
     * @return
     */
    @Override
    public List<SubOrder> querySubOrders() {
        return subOrderService.querySubOrders();
    }
}
