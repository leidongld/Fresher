package com.example.demo.service;

import com.example.demo.beans.Arder;
import com.example.demo.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: Fresher
 * @description: OrderService
 * @author: Lei Dong
 * @create: 2018-09-24 19:26
 **/
@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOrderRepository orderRepository;

    /**
     * 添加订单
     *
     * @param order
     * @return
     */
    @Override
    public void addOrder(Arder order) {
        orderRepository.saveAndFlush(order);
    }

    /**
     * 根据id删除订单
     *
     * @param order
     * @return
     */
    @Override
    public void deleteOrder(Arder order) {
        orderRepository.deleteInBatch(order);
    }

    /**
     * 更新订单
     *
     * @param order
     * @return
     */
    @Override
    public void updateOrder(Arder order) {
        orderRepository.saveAndFlush(order);
    }

    /**
     * 根据id查找订单
     *
     * @param id
     * @return
     */
    @Override
    public Arder queryOrder(String id) {
        return orderRepository.getOne(id);
    }

    /**
     * 查找全部订单
     *
     * @return
     */
    @Override
    public List<Arder> queryOrders() {
        return orderRepository.findAll();
    }
}
