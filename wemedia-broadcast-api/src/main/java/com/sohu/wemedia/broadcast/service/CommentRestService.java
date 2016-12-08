/**
 * Copyright (c) 2012 Sohu. All Rights Reserved
 */
package com.sohu.wemedia.broadcast.service;

import javax.validation.constraints.Min;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import com.sohu.wemedia.broadcast.model.Comment;
import com.sohu.wemedia.broadcast.model.ResponseResult;

@Path("comments")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface CommentRestService {
    @GET
    @Path("{id: \\d+}")
    Comment getCommentById(@PathParam("id") @Min(value = 1L, message = "User ID must be greater than 1") Long id);

    @POST
    @Path("add")
    ResponseResult addComment(Comment comment);
}
