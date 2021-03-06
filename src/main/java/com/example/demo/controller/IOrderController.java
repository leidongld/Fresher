package com.example.demo.controller;

import com.example.demo.beans.Arder;
import com.example.demo.net.Resp;

import java.util.List;

/**
 * @program: Fresher
 * @description: IOrderController
 * @author: Lei Dong
 * @create: 2018-09-24 19:19
 **/
public interface IOrderController {
    /**
     * 增加订单
     *
     * @param order
     * @return
     */
    Resp addOrder(Arder order);

    /**
     * 删除订单
     *
     * @param order
     * @return
     */
    Resp deleteOrder(Arder order);

    /**
     * 更新订单
     *
     * @param order
     * @return
     */
    Resp updateOrder(Arder order);

    /**
     * 查找订单
     *
     * @param id
     * @return
     */
    Arder queryOrder(String id);

    /**
     * 查找全部的订单
     *
     * @return
     */
    List<Arder> queryOrders();
}
