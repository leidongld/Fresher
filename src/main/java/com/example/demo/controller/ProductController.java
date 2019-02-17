package com.example.demo.controller;

import com.example.demo.beans.Product;
import com.example.demo.business.IProductBusiness;
import com.example.demo.constants.ProductRespMsg;
import com.example.demo.net.Resp;
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
    private IProductBusiness productBusiness;

    /**
     * 添加商品
     *
     * @param product
     * @return
     */
    @Override
    @RequestMapping(value = "/product/addProduct", method = RequestMethod.POST)
    public Resp addProduct(Product product) {
        productBusiness.addProduct(product);
        return new Resp(Resp.RESPCODE_SUCCESS, ProductRespMsg.SUCCESS_ADD_PRODUCT);
    }

    /**
     * 根据id删除商品
     *
     * @param product
     * @return
     */
    @Override
    @RequestMapping(value = "/product/deleteProduct", method = RequestMethod.POST)
    public Resp deleteProduct(Product product) {
        productBusiness.deleteProduct(product);
        return new Resp(Resp.RESPCODE_SUCCESS, ProductRespMsg.SUCCESS_DELETE_PRODUCT);
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
        productBusiness.updateProduct(product);
        return new Resp(Resp.RESPCODE_SUCCESS, ProductRespMsg.SUCCESS_UPDATE_PRODUCT);
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
        return productBusiness.queryProduct(id);
    }

    /**
     * 查找全部的商品
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/product/queryProducts", method = RequestMethod.POST)
    public List<Product> queryProducts() {
        return productBusiness.queryProducts();
    }
}
