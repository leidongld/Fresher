package com.example.demo.controller;

import com.example.demo.beans.Arder;
import com.example.demo.constants.OrderRespMsg;
import com.example.demo.net.Resp;
import com.example.demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: Fresher
 * @description: OrderController
 * @author: Lei Dong
 * @create: 2018-09-24 19:19
 **/
@RestController
@RequestMapping("/fresher/order")
public class OrderController implements IOrderController {
    @Autowired
    private IOrderService orderService;

    /**
     * 添加订单
     *
     * @param order
     * @return
     */
    @Override
    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    @ResponseBody
    public Resp addOrder(Arder order) {
        orderService.addOrder(order);
        return new Resp(Resp.RESPCODE_SUCCESS, OrderRespMsg.SUCCESS_ADD_ORDER);
    }

    /**
     * 根据id删除订单
     *
     * @param order
     * @return
     */
    @Override
    @RequestMapping(value = "/deleteOrder", method = RequestMethod.POST)
    @ResponseBody
    public Resp deleteOrder(Arder order) {
        orderService.deleteOrder(order);
        return new Resp(Resp.RESPCODE_SUCCESS, OrderRespMsg.SUCCESS_DELETE_ORDER);
    }

    /**
     * 更新订单
     *
     * @param order
     * @return
     */
    @Override
    @RequestMapping(value = "/updateOrder", method = RequestMethod.POST)
    @ResponseBody
    public Resp updateOrder(Arder order) {
        orderService.updateOrder(order);
        return new Resp(Resp.RESPCODE_SUCCESS, OrderRespMsg.SUCCESS_UPDATE_ORDER);
    }

    /**
     * 根据id查找订单
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/queryOrder", method = RequestMethod.POST)
    @ResponseBody
    public Arder queryOrder(String id) {
        return orderService.queryOrder(id);
    }

    /**
     * 查找全部订单
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/queryOrders", method = RequestMethod.POST)
    @ResponseBody
    public List<Arder> queryOrders() {
        return orderService.queryOrders();
    }
}
