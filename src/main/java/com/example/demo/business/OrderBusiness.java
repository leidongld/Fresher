package com.example.demo.business;

import com.example.demo.beans.Arder;
import com.example.demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: Fresher
 * @description: OrderBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:17
 **/
public class OrderBusiness implements IOrderBusiness {
    @Autowired
    private IOrderService orderService;

    /**
     * 添加订单
     *
     * @param order
     * @return
     */
    @Override
    public void addOrder(Arder order) {
        orderService.addOrder(order);
    }

    /**
     * 根据id删除订单
     *
     * @param order
     * @return
     */
    @Override
    public void deleteOrder(Arder order) {
        orderService.deleteOrder(order);
    }

    /**
     * 更新订单
     *
     * @param order
     * @return
     */
    @Override
    public void updateOrder(Arder order) {
        orderService.updateOrder(order);
    }

    /**
     * 根据id查找订单
     *
     * @param id
     * @return
     */
    @Override
    public Arder queryOrder(String id) {
        return orderService.queryArder(id);
    }

    /**
     * 查找全部的订单
     *
     * @return
     */
    @Override
    public List<Arder> queryOrders() {
        return orderService.queryOrders();
    }
}
