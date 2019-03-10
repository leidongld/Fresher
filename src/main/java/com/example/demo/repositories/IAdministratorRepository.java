package com.example.demo.repositories;

import com.example.demo.beans.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: Fresher
 * @description: IAdministratorRepository
 * @author: Lei Dong
 * @create: 2018-09-24 19:29
 **/
public interface IAdministratorRepository extends JpaRepository<Administrator, String> {
}
