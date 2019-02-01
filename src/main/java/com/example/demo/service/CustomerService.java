package com.example.demo.service;

import com.example.demo.beans.Customer;
import com.example.demo.net.Resp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: Fresher
 * @description: CustomerService
 * @author: Lei Dong
 * @create: 2018-09-24 19:22
 **/
@Service
public class CustomerService implements ICustomerService {
    /**
     * 创建买家
     *
     * @param customer
     * @return
     */
    @Override
    public Resp createCustomer(Customer customer) {
        return null;
    }

    /**
     * 删除买家
     *
     * @param id
     * @return
     */
    @Override
    public Resp deleteCustomer(String id) {
        return null;
    }

    /**
     * 更新买家
     *
     * @param customer
     * @return
     */
    @Override
    public Resp updateCustomer(Customer customer) {
        return null;
    }

    /**
     * 根据id查找买家
     *
     * @param id
     * @return
     */
    @Override
    public Customer queryCustomer(String id) {
        return null;
    }

    /**
     * 查找全部买家
     *
     * @return
     */
    @Override
    public List<Customer> queryCustomers() {
        return null;
    }
}
