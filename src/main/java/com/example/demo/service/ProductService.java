package com.example.demo.service;

import com.example.demo.beans.Product;
import com.example.demo.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Fresher
 * @description: ProductService
 * @author: Lei Dong
 * @create: 2018-09-24 19:26
 **/
@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    /**
     * 添加商品
     *
     * @param product
     * @return
     */
    @Override
    public void addProduct(Product product) {
        productRepository.saveAndFlush(product);
    }

    /**
     * 根据id删除商品
     *
     * @param product
     * @return
     */
    @Override
    public void deleteProduct(Product product) {
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        Iterable<Product> iterable = (Iterable<Product>) productList.iterator();
        productRepository.deleteInBatch(iterable);
    }

    /**
     * 更改商品信息
     *
     * @param product
     * @return
     */
    @Override
    public void updateProduct(Product product) {
        productRepository.saveAndFlush(product);
    }

    /**
     * 根据id查找商品
     *
     * @param id
     * @return
     */
    @Override
    public Product queryProduct(String id) {
        return productRepository.getOne(id);
    }

    /**
     * 查找全部商品
     *
     * @return
     */
    @Override
    public List<Product> queryProducts() {
        return productRepository.findAll();
    }
}
