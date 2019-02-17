package com.example.demo.service;

import com.example.demo.beans.Customer;
import com.example.demo.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private ICustomerRepository customerRepository;

    /**
     * 创建买家
     *
     * @param customer
     * @return
     */
    @Override
    public void createCustomer(Customer customer) {
        customerRepository.saveAndFlush(customer);
    }

    /**
     * 删除买家
     *
     * @param customer
     * @return
     */
    @Override
    public void deleteCustomer(Customer customer) {
        customerRepository.deleteInBatch(customer);
    }

    /**
     * 更新买家
     *
     * @param customer
     * @return
     */
    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.saveAndFlush(customer);
    }

    /**
     * 根据id查找买家
     *
     * @param id
     * @return
     */
    @Override
    public Customer queryCustomer(String id) {
        Customer customer = customerRepository.getOne(id);
        return customer;
    }

    /**
     * 查找全部买家
     *
     * @return
     */
    @Override
    public List<Customer> queryCustomers() {
        List<Customer> customerList = customerRepository.findAll();
        return customerList;
    }
}
