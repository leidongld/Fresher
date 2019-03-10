package com.example.demo.controller;

import com.example.demo.beans.Product;
import com.example.demo.constants.ProductRespMsg;
import com.example.demo.net.Resp;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: Fresher
 * @description: ProductController
 * @author: Lei Dong
 * @create: 2018-09-24 19:20
 **/
@RestController
@RequestMapping("/fresher/product")
public class ProductController implements IProductController {
    @Autowired
    private IProductService productService;

    /**
     * 添加商品
     *
     * @param product
     * @return
     */
    @Override
    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    @ResponseBody
    public Resp addProduct(Product product) {
        productService.addProduct(product);
        return new Resp(Resp.RESPCODE_SUCCESS, ProductRespMsg.SUCCESS_ADD_PRODUCT);
    }

    /**
     * 根据id删除商品
     *
     * @param product
     * @return
     */
    @Override
    @RequestMapping(value = "/deleteProduct", method = RequestMethod.POST)
    @ResponseBody
    public Resp deleteProduct(Product product) {
        productService.deleteProduct(product);
        return new Resp(Resp.RESPCODE_SUCCESS, ProductRespMsg.SUCCESS_DELETE_PRODUCT);
    }

    /**
     * 更新商品
     *
     * @param product
     * @return
     */
    @Override
    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    @ResponseBody
    public Resp updateProduct(Product product) {
        productService.updateProduct(product);
        return new Resp(Resp.RESPCODE_SUCCESS, ProductRespMsg.SUCCESS_UPDATE_PRODUCT);
    }

    /**
     * 根据id查找商品
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/queryProduct", method = RequestMethod.POST)
    @ResponseBody
    public Product queryProduct(String id) {
        return productService.queryProduct(id);
    }

    /**
     * 查找全部的商品
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/queryProducts", method = RequestMethod.POST)
    @ResponseBody
    public List<Product> queryProducts() {
        return productService.queryProducts();
    }
}
