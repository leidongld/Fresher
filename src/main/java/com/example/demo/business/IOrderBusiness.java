package com.example.demo.business;

import com.example.demo.beans.Arder;

import java.util.List;

/**
 * @program: Fresher
 * @description: IOrderBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:17
 **/
public interface IOrderBusiness {
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
