package com.example.demo.repository;

import com.example.demo.beans.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: Fresher
 * @description: IMerchantRepository
 * @author: Lei Dong
 * @create: 2018-09-24 19:45
 **/
public interface IMerchantRepository extends JpaRepository<Merchant, String> {
}
