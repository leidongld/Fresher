package com.example.demo.service;

import com.example.demo.beans.Arder;

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
    void addOrder(Arder order);

    /**
     * 删除订单
     *
     * @param order
     * @return
     */
    void deleteOrder(Arder order);

    /**
     * 更新订单
     *
     * @param order
     * @return
     */
    void updateOrder(Arder order);

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
