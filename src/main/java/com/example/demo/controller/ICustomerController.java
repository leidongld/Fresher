package com.example.demo.controller;

import com.example.demo.beans.Customer;
import com.example.demo.net.Resp;

import java.util.List;

/**
 * @program: Fresher
 * @description: ICustomerController
 * @author: Lei Dong
 * @create: 2018-09-24 19:17
 **/
public interface ICustomerController {
    /**
     * 添加消费者
     *
     * @param customer
     * @return
     */
    Resp addCustomer(Customer customer);

    /**
     * 删除消费者
     *
     * @param customer
     * @return
     */
    Resp deleteCustomer(Customer customer);

    /**
     * 删除消费者
     *
     * @param customer
     * @return
     */
    Resp updateCustomer(Customer customer);

    /**
     * 根据id产找消费者
     *
     * @param id
     * @return
     */
    Customer queryCustomer(String id);

    /**
     * 查找全部的消费者
     *
     * @return
     */
    List<Customer> queryCustomers();
}
