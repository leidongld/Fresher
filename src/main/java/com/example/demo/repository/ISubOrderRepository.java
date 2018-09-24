package com.example.demo.repository;

import com.example.demo.beans.SubOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: Fresher
 * @description: ISubOrderRepository
 * @author: Lei Dong
 * @create: 2018-09-24 19:50
 **/
public interface ISubOrderRepository extends JpaRepository<SubOrder, String> {
}
