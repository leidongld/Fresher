package com.example.demo.business;

import com.example.demo.beans.Customer;
import com.example.demo.net.Resp;
import com.example.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: Fresher
 * @description: CustomerBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:15
 **/
public class CustomerBusiness implements ICustomerBusiness {
    @Autowired
    private ICustomerService customerService;

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
