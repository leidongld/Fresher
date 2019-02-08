package com.example.demo.controller;

import com.example.demo.beans.Product;
import com.example.demo.net.Resp;
import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: Fresher
 * @description: ProductController
 * @author: Lei Dong
 * @create: 2018-09-24 19:20
 **/
@RestController
public class ProductController implements IProductController {
    @Autowired
    private IProductRepository repository;

    /**
     * 添加商品
     *
     * @param product
     * @return
     */
    @Override
    @RequestMapping(value = "/product/addProduct", method = RequestMethod.POST)
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
    @RequestMapping(value = "/product/deleteProduct", method = RequestMethod.POST)
    public Resp deleteProduct(String id) {
        return null;
    }

    /**
     * 更新商品
     *
     * @param product
     * @return
     */
    @Override
    @RequestMapping(value = "/product/updateProduct", method = RequestMethod.POST)
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
    @RequestMapping(value = "/product/queryProduct", method = RequestMethod.POST)
    public Product queryProduct(String id) {
        return null;
    }

    /**
     * 查找全部的商品
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/product/queryProducts", method = RequestMethod.POST)
    public List<Product> queryProducts() {
        return null;
    }
}
