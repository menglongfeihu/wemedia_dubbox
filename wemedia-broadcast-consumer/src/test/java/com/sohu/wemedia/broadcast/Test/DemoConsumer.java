/**
 * Copyright (c) 2012 Sohu. All Rights Reserved
 */
package com.sohu.wemedia.broadcast.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sohu.wemedia.broadcast.service.CommentService;

public class DemoConsumer {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        final String port = "8888";

        // 测试Rest服务
        getComment("http://localhost:" + port + "/broadcast/comments/1.json");
        getComment("http://localhost:" + port + "/broadcast/comments/1.xml");

        // 测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:consumer.xml");
        context.start();
        CommentService commentService = context.getBean(CommentService.class);
        System.out.println(commentService.getCommentById(12L));

    }

    private static void getComment(String url) {
        System.out.println("url = " + url);
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url);

        Response response = target.request().get();
        try {
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed with HTTP error code : " + response.getStatus());
            }
            System.out.println("Successfully got result: " + response.readEntity(String.class));
        } finally {
            response.close();
            client.close();
        }
    }
}
