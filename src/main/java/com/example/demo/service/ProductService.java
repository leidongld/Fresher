package com.example.demo.service;

import com.example.demo.beans.Product;
import com.example.demo.net.Resp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: Fresher
 * @description: ProductService
 * @author: Lei Dong
 * @create: 2018-09-24 19:26
 **/
@Service
public class ProductService implements IProductService {
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
     * 查找全部商品
     *
     * @return
     */
    @Override
    public List<Product> queryProducts() {
        return null;
    }
}
