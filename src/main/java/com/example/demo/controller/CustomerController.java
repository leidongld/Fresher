package com.example.demo.controller;

import com.example.demo.beans.Customer;
import com.example.demo.net.Resp;
import com.example.demo.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: Fresher
 * @description: CustomerController
 * @author: Lei Dong
 * @create: 2018-09-24 19:17
 **/
@RestController
public class CustomerController implements ICustomerController {
    @Autowired
    private ICustomerRepository repository;

    /**
     * 添加消费者
     *
     * @param customer
     * @return
     */
    @Override
    @RequestMapping(value = "/customer/addCustomer", method = RequestMethod.POST)
    public Resp addCustomer(Customer customer) {
        return null;
    }

    /**
     * 删除消费者
     *
     * @param customer
     * @return
     */
    @Override
    @RequestMapping(value = "/customer/deleteCustomer", method = RequestMethod.POST)
    public Resp deleteCustomer(Customer customer) {
        return null;
    }

    /**
     * 更新消费者
     *
     * @param customer
     * @return
     */
    @Override
    @RequestMapping(value = "/customer/updateCustomer", method = RequestMethod.POST)
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
    @RequestMapping(value = "/customer/queryCustomer", method = RequestMethod.POST)
    public Customer queryCustomer(String id) {
        return null;
    }

    /**
     * 查找全部的消费者
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/customer/queryCustomers", method = RequestMethod.POST)
    public List<Customer> queryCustomers() {
        return null;
    }
}
