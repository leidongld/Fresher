package com.example.demo.service;

import com.example.demo.beans.Customer;

import java.util.List;

/**
 * @program: Fresher
 * @description: ICustomerService
 * @author: Lei Dong
 * @create: 2018-09-24 19:22
 **/
public interface ICustomerService {
    /**
     * 创建买家
     *
     * @param customer
     * @return
     */
    void createCustomer(Customer customer);

    /**
     * 根据id删除买家
     *
     * @param customer
     * @return
     */
    void deleteCustomer(Customer customer);

    /**
     * 更新买家信息
     *
     * @param customer
     * @return
     */
    void updateCustomer(Customer customer);

    /**
     * 根据id查找买家
     *
     * @param id
     * @return
     */
    Customer queryCustomer(String id);

    /**
     * 查找全部的买家
     *
     * @return
     */
    List<Customer> queryCustomers();
}
