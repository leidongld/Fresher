package com.example.demo.service;

import com.example.demo.beans.SubOrder;

import java.util.List;

/**
 * @program: Fresher
 * @description: ISubOrderService
 * @author: Lei Dong
 * @create: 2018-09-24 19:27
 **/
public interface ISubOrderService {
    /**
     * 添加子订单
     *
     * @param subOrder
     * @return
     */
    void addSubOrder(SubOrder subOrder);

    /**
     * 删除子订单
     *
     * @param subOrder
     * @return
     */
    void deleteSubOrder(SubOrder subOrder);

    /**
     * 更改子订单
     *
     * @param subOrder
     * @return
     */
    void updateSubOrder(SubOrder subOrder);

    /**
     * 根据id查找
     *
     * @param id
     * @return
     */
    SubOrder querySubOrder(String id);

    /**
     * 查找全部的子订单
     *
     * @return
     */
    List<SubOrder> querySubOrders();

}
