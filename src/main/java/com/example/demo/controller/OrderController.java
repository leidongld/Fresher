package com.example.demo.controller;

import com.example.demo.beans.Arder;
import com.example.demo.business.IOrderBusiness;
import com.example.demo.constants.OrderRespMsg;
import com.example.demo.net.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: Fresher
 * @description: OrderController
 * @author: Lei Dong
 * @create: 2018-09-24 19:19
 **/
@RestController
public class OrderController implements IOrderController {
    @Autowired
    private IOrderBusiness orderBusiness;

    /**
     * 添加订单
     *
     * @param order
     * @return
     */
    @Override
    @RequestMapping(value = "/order/addOrder", method = RequestMethod.POST)
    public Resp addOrder(Arder order) {
        orderBusiness.addOrder(order);
        return new Resp(Resp.RESPCODE_SUCCESS, OrderRespMsg.SUCCESS_ADD_ORDER);
    }

    /**
     * 根据id删除订单
     *
     * @param order
     * @return
     */
    @Override
    @RequestMapping(value = "/order/deleteOrder", method = RequestMethod.POST)
    public Resp deleteOrder(Arder order) {
        orderBusiness.deleteOrder(order);
        return new Resp(Resp.RESPCODE_SUCCESS, OrderRespMsg.SUCCESS_DELETE_ORDER);
    }

    /**
     * 更新订单
     *
     * @param order
     * @return
     */
    @Override
    @RequestMapping(value = "/order/updateOrder", method = RequestMethod.POST)
    public Resp updateOrder(Arder order) {
        orderBusiness.updateOrder(order);
        return new Resp(Resp.RESPCODE_SUCCESS, OrderRespMsg.SUCCESS_UPDATE_ORDER);
    }

    /**
     * 根据id查找订单
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/order/queryOrder", method = RequestMethod.POST)
    public Arder queryOrder(String id) {
        return orderBusiness.queryOrder(id);
    }

    /**
     * 查找全部订单
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/order/queryOrders", method = RequestMethod.POST)
    public List<Arder> queryOrders() {
        return orderBusiness.queryOrders();
    }
}
