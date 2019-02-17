package com.example.demo.business;

import com.example.demo.beans.SubOrder;

import java.util.List;

/**
 * @program: Fresher
 * @description: ISubOrderBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:19
 **/
public interface ISubOrderBusiness {
    /**
     * 添加子订单
     *
     * @param subOrder
     */
    void addSubOrder(SubOrder subOrder);

    /**
     * 删除子订单
     *
     * @param subOrder
     */
    void deleteSubOrder(SubOrder subOrder);

    /**
     * 更改子订单
     *
     * @param subOrder
     */
    void updateSubOrder(SubOrder subOrder);

    /**
     * 根据id查找子订单
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
