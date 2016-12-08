/**
 * Copyright (c) 2012 Sohu. All Rights Reserved
 */
package com.sohu.wemedia.broadcast.rest;

import com.sohu.wemedia.broadcast.model.Comment;
import com.sohu.wemedia.broadcast.service.CommentRestService;
import com.sohu.wemedia.broadcast.service.CommentService;

public class RestDemo {

    private CommentRestService commentRestService;

    private CommentService commentService;


    public void setCommentRestService(CommentRestService commentRestService) {
        this.commentRestService = commentRestService;
    }


    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }


    public  void start() {
        System.out.println("commentService get= " + commentService.getCommentById(12L));
        System.out.println("commentRestService get= " + commentRestService.getCommentById(12L));

        Comment comment = new Comment();
        comment.setId(345678L);
        comment.setConent("tyujhyujue2qu");
        System.out.println("commentRestService add = " + commentRestService.addComment(comment));
    }

}
