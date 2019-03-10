package com.example.demo.repositories;

import com.example.demo.beans.Arder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: Fresher
 * @description: IOrderRepository
 * @author: Lei Dong
 * @create: 2018-09-24 19:48
 **/
public interface IOrderRepository extends JpaRepository<Arder, String> {
}
