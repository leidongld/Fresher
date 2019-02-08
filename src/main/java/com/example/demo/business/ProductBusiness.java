package com.example.demo.business;

import com.example.demo.beans.Product;
import com.example.demo.net.Resp;

import java.util.List;

/**
 * @program: Fresher
 * @description: ProductBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:18
 **/
public class ProductBusiness implements IProductBusiness {
    /**
     * 添加商品
     *
     * @param product
     * @return
     */
    @Override
    public Resp addProduct(Product product) {
        return null;
    }

    /**
     * 根据id删除商品
     *
     * @param id
     * @return
     */
    @Override
    public Resp deleteProduct(String id) {
        return null;
    }

    /**
     * 更改商品信息
     *
     * @param product
     * @return
     */
    @Override
    public Resp updateProduct(Product product) {
        return null;
    }

    /**
     * 根据id查找商品
     *
     * @param id
     * @return
     */
    @Override
    public Product queryProduct(String id) {
        return null;
    }

    /**
     * 查找全部的商品
     *
     * @return
     */
    @Override
    public List<Product> queryProducts() {
        return null;
    }
}
