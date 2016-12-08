/**
 * Copyright (c) 2012 Sohu. All Rights Reserved
 */
package com.sohu.wemedia.broadcast.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartService {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }

}
