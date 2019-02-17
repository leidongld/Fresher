package com.example.demo.service;

import com.example.demo.beans.Product;

import java.util.List;

/**
 * @program: Fresher
 * @description: IProductService
 * @author: Lei Dong
 * @create: 2018-09-24 19:26
 **/
public interface IProductService {
    /**
     * 增加商品
     *
     * @param product
     * @return
     */
    void addProduct(Product product);

    /**
     * 根据id删除商品
     *
     * @param product
     * @return
     */
    void deleteProduct(Product product);

    /**
     * 更新商品
     *
     * @param product
     * @return
     */
    void updateProduct(Product product);

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
