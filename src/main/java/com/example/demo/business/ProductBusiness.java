package com.example.demo.business;

import com.example.demo.beans.Product;
import com.example.demo.net.Resp;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: Fresher
 * @description: ProductBusiness
 * @author: Lei Dong
 * @create: 2018-12-08 18:18
 **/
public class ProductBusiness implements IProductBusiness {
    @Autowired
    private IProductService productService;

    /**
     * 添加商品
     *
     * @param product
     * @return
     */
    @Override
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    /**
     * 根据id删除商品
     *
     * @param product
     * @return
     */
    @Override
    public void deleteProduct(Product product) {
        productService.deleteProduct(product);
    }

    /**
     * 更改商品信息
     *
     * @param product
     * @return
     */
    @Override
    public void updateProduct(Product product) {
        productService.updateProduct(product);
    }

    /**
     * 根据id查找商品
     *
     * @param id
     * @return
     */
    @Override
    public Product queryProduct(String id) {
        return productService.queryProduct(id);
    }

    /**
     * 查找全部的商品
     *
     * @return
     */
    @Override
    public List<Product> queryProducts() {
        return productService.queryProducts();
    }
}
