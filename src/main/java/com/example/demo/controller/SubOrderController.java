package com.example.demo.controller;

import com.example.demo.beans.SubOrder;
import com.example.demo.business.ISubOrderBusiness;
import com.example.demo.constants.SubOrderRespMsg;
import com.example.demo.net.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: Fresher
 * @description: SubOrderController
 * @author: Lei Dong
 * @create: 2018-09-24 19:21
 **/
@RestController
public class SubOrderController implements ISubOrderController {
    @Autowired
    private ISubOrderBusiness subOrderBusiness;

    /**
     * 添加子订单
     *
     * @param subOrder
     * @return
     */
    @Override
    @RequestMapping(value = "/subOrder/addSubOrder", method = RequestMethod.POST)
    public Resp addSubOrder(SubOrder subOrder) {
        return new Resp(Resp.RESPCODE_SUCCESS, SubOrderRespMsg.SUCCESS_ADD_SUBORDER);
    }

    /**
     * 删除子订单
     *
     * @param subOrder
     * @return
     */
    @Override
    @RequestMapping(value = "/subOrder/deleteSubOrder", method = RequestMethod.POST)
    public Resp deleteSubOrder(SubOrder subOrder) {
        return null;
    }

    /**
     * 修改子订单
     *
     * @param subOrder
     * @return
     */
    @Override
    @RequestMapping(value = "/subOrder/updateSubOrder", method = RequestMethod.POST)
    public Resp updateSubOrder(SubOrder subOrder) {
        return null;
    }

    /**
     * 根据id查找子订单
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/subOrder/querySubOrder", method = RequestMethod.POST)
    public SubOrder querySubOrder(String id) {
        return null;
    }

    /**
     * 查找全部的子订单
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/subOrder/querySubOrders", method = RequestMethod.POST)
    public List<SubOrder> querySubOrders() {
        return null;
    }
}
