package com.example.demo.business;

import com.example.demo.beans.Product;
import com.example.demo.net.Resp;

import java.util.List;

/**
 * @program: Fresher
 * @description: IProductBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:17
 **/
public interface IProductBusiness {
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
     * @param id
     * @return
     */
    Resp deleteProduct(String id);

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
