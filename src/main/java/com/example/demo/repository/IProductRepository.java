package com.example.demo.repository;

import com.example.demo.beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: Fresher
 * @description: IProductRepository
 * @author: Lei Dong
 * @create: 2018-09-24 19:49
 **/
public interface IProductRepository extends JpaRepository<Product, String> {
}
