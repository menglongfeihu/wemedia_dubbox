/**
 * Copyright (c) 2012 Sohu. All Rights Reserved
 */
package com.sohu.wemedia.broadcast.service.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import com.sohu.wemedia.broadcast.model.Comment;
import com.sohu.wemedia.broadcast.model.ResponseResult;
import com.sohu.wemedia.broadcast.service.CommentRestService;
import com.sohu.wemedia.broadcast.service.CommentService;

@Path("comments")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class CommentRestServiceImpl implements CommentRestService {

    private final Logger logger = LoggerFactory.getLogger(CommentRestServiceImpl.class);

    private CommentService commentService;

    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    @GET
    @Path("{id: \\d+}")
    @Override
    public Comment getCommentById(@PathParam("id") Long id) {
        return this.commentService.getCommentById(id);
    }

    @Override
    @POST
    @Path("add")
    public ResponseResult addComment(Comment comment) {
        logger.info("content = " + comment.getConent());
        logger.info("id = " + comment.getId());

        Comment newComment = new Comment();
        newComment.setConent(comment.getConent());
        newComment.setId(12345L);
        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(newComment);
        responseResult.setStatus(200);
        responseResult.setMessage("Success");
        return responseResult;
    }

}
