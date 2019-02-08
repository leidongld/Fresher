package com.example.demo.service;

import com.example.demo.beans.Arder;
import com.example.demo.net.Resp;

import java.util.List;

/**
 * @program: Fresher
 * @description: IOrderService
 * @author: Lei Dong
 * @create: 2018-09-24 19:25
 **/
public interface IOrderService {
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
     * @param id
     * @return
     */
    Resp deleteOrder(String id);

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
    Arder queryArder(String id);

    /**
     * 查找全部的订单
     *
     * @return
     */
    List<Arder> queryOrders();
}
