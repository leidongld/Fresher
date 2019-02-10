package com.example.demo.utils;

import java.util.UUID;

/**
 * @program: Fresher
 * @description: id相关工具类
 * @author: Lei Dong
 * @create: 2019-02-10 19:57
 **/
public class IDUtils {
    /**
     * 随机生成uuid,不带-
     *
     * @return
     */
    public static String genUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
