package com.example.demo.controller;

import com.example.demo.beans.SubOrder;
import com.example.demo.constants.SubOrderRespMsg;
import com.example.demo.net.Resp;
import com.example.demo.service.ISubOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: Fresher
 * @description: SubOrderController
 * @author: Lei Dong
 * @create: 2018-09-24 19:21
 **/
@RestController
@RequestMapping("/fresher/suborder")
public class SubOrderController implements ISubOrderController {
    @Autowired
    private ISubOrderService subOrderService;

    /**
     * 添加子订单
     *
     * @param subOrder
     * @return
     */
    @Override
    @RequestMapping(value = "/addSubOrder", method = RequestMethod.POST)
    @ResponseBody
    public Resp addSubOrder(SubOrder subOrder) {
        subOrderService.addSubOrder(subOrder);
        return new Resp(Resp.RESPCODE_SUCCESS, SubOrderRespMsg.SUCCESS_ADD_SUBORDER);
    }

    /**
     * 删除子订单
     *
     * @param subOrder
     * @return
     */
    @Override
    @RequestMapping(value = "/deleteSubOrder", method = RequestMethod.POST)
    @ResponseBody
    public Resp deleteSubOrder(SubOrder subOrder) {
        subOrderService.deleteSubOrder(subOrder);
        return new Resp(Resp.RESPCODE_SUCCESS, SubOrderRespMsg.SUCCESS_DELETE_SUBORDER);
    }

    /**
     * 修改子订单
     *
     * @param subOrder
     * @return
     */
    @Override
    @RequestMapping(value = "/updateSubOrder", method = RequestMethod.POST)
    @ResponseBody
    public Resp updateSubOrder(SubOrder subOrder) {
        subOrderService.updateSubOrder(subOrder);
        return new Resp(Resp.RESPCODE_SUCCESS, SubOrderRespMsg.SUCCESS_UPDATE_SUBORDER);
    }

    /**
     * 根据id查找子订单
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/querySubOrder", method = RequestMethod.POST)
    @ResponseBody
    public SubOrder querySubOrder(String id) {
        return subOrderService.querySubOrder(id);
    }

    /**
     * 查找全部的子订单
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/querySubOrders", method = RequestMethod.POST)
    @ResponseBody
    public List<SubOrder> querySubOrders() {
        return subOrderService.querySubOrders();
    }
}
