package com.example.demo.business;

import com.example.demo.beans.Customer;
import com.example.demo.net.Resp;

import java.util.List;

/**
 * @program: Fresher
 * @description: ICustomerBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:15
 **/
public interface ICustomerBusiness {
    /**
     * 创建买家
     *
     * @param customer
     * @return
     */
    Resp createCustomer(Customer customer);

    /**
     * 根据id删除买家
     *
     * @param id
     * @return
     */
    Resp deleteCustomer(String id);

    /**
     * 更新买家信息
     *
     * @param customer
     * @return
     */
    Resp updateCustomer(Customer customer);

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
