package com.example.demo.controller;

import com.example.demo.beans.SubOrder;
import com.example.demo.net.Resp;

import java.util.List;

/**
 * @program: Fresher
 * @description: ISubOrderController
 * @author: Lei Dong
 * @create: 2018-09-24 19:20
 **/
public interface ISubOrderController {
    /**
     * 添加子订单
     *
     * @param subOrder
     * @return
     */
    Resp addSubOrder(SubOrder subOrder);

    /**
     * 删除子订单
     *
     * @param id
     * @return
     */
    Resp deleteSubOrder(String id);

    /**
     * 更改子订单
     *
     * @param subOrder
     * @return
     */
    Resp updateSubOrder(SubOrder subOrder);

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
