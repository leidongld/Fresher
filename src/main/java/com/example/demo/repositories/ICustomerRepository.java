package com.example.demo.repositories;

import com.example.demo.beans.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @program: Fresher
 * @description: ICustomerRespository
 * @author: Lei Dong
 * @create: 2018-09-24 19:42
 **/
public interface ICustomerRepository extends JpaRepository<Customer, String> {
}
