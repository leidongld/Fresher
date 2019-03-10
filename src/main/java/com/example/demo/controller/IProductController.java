package com.example.demo.controller;

import com.example.demo.beans.Product;
import com.example.demo.net.Resp;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: Fresher
 * @description: IProductController
 * @author: Lei Dong
 * @create: 2018-09-24 19:20
 **/
@RestController
public interface IProductController {
    /**
     * 增加商品
     *
     * @param product
     * @return
     */
    Resp addProduct(Product product);

    /**
     * 根据id删除商品
     *
     * @param product
     * @return
     */
    Resp deleteProduct(Product product);

    /**
     * 更新商品
     *
     * @param product
     * @return
     */
    Resp updateProduct(Product product);

    /**
     * 根据id查找商品
     *
     * @param id
     * @return
     */
    Product queryProduct(String id);

    /**
     * 查找全部的商品
     *
     * @return
     */
    List<Product> queryProducts();
}
