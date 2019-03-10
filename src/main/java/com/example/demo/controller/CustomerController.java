package com.example.demo.controller;

import com.example.demo.beans.Customer;
import com.example.demo.constants.CustomerRespMsg;
import com.example.demo.net.Resp;
import com.example.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: Fresher
 * @description: CustomerController
 * @author: Lei Dong
 * @create: 2018-09-24 19:17
 **/
@RestController
@RequestMapping("/fresher/customer")
public class CustomerController implements ICustomerController {
    @Autowired
    private ICustomerService customerService;

    /**
     * 添加消费者
     *
     * @param customer
     * @return
     */
    @Override
    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    @ResponseBody
    public Resp addCustomer(Customer customer) {
        customerService.createCustomer(customer);
        return new Resp(Resp.RESPCODE_SUCCESS, CustomerRespMsg.SUCCESS_ADD_CUSTOMER);
    }

    /**
     * 删除消费者
     *
     * @param customer
     * @return
     */
    @Override
    @RequestMapping(value = "/deleteCustomer", method = RequestMethod.POST)
    @ResponseBody
    public Resp deleteCustomer(Customer customer) {
        customerService.deleteCustomer(customer);
        return new Resp(Resp.RESPCODE_SUCCESS, CustomerRespMsg.SUCCESS_DELETE_CUSTOMER);
    }

    /**
     * 更新消费者
     *
     * @param customer
     * @return
     */
    @Override
    @RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
    @ResponseBody
    public Resp updateCustomer(Customer customer) {
        return null;
    }

    /**
     * 根据id查找消费者
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/queryCustomer", method = RequestMethod.POST)
    @ResponseBody
    public Customer queryCustomer(String id) {
        return null;
    }

    /**
     * 查找全部的消费者
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/queryCustomers", method = RequestMethod.POST)
    @ResponseBody
    public List<Customer> queryCustomers() {
        return null;
    }
}
