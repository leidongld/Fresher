package com.example.demo.business;

import com.example.demo.beans.Arder;
import com.example.demo.net.Resp;

import java.util.List;

/**
 * @program: Fresher
 * @description: OrderBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:17
 **/
public class OrderBusiness implements IOrderBusiness {
    /**
     * 添加订单
     *
     * @param order
     * @return
     */
    @Override
    public Resp addOrder(Arder order) {
        return null;
    }

    /**
     * 根据id删除订单
     *
     * @param id
     * @return
     */
    @Override
    public Resp deleteOrder(String id) {
        return null;
    }

    /**
     * 更新订单
     *
     * @param order
     * @return
     */
    @Override
    public Resp updateOrder(Arder order) {
        return null;
    }

    /**
     * 根据id查找订单
     *
     * @param id
     * @return
     */
    @Override
    public Arder queryArder(String id) {
        return null;
    }

    /**
     * 查找全部的订单
     *
     * @return
     */
    @Override
    public List<Arder> queryOrders() {
        return null;
    }
}
