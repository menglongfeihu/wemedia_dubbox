/**
 * Copyright (c) 2012 Sohu. All Rights Reserved
 */
package com.sohu.wemedia.broadcast.extension;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.rpc.RpcContext;

public class CustomExceptionMapper implements ExceptionMapper<NotFoundException>{

    private final Logger logger = LoggerFactory.getLogger(CustomExceptionMapper.class);
    @Override
    public Response toResponse(NotFoundException e) {
        logger.info("Exception mapper successfully got an exception: " +  e.getMessage());
        logger.info("Client IP is " + RpcContext.getContext().getRemoteAddressString());
        return Response.status(Response.Status.NOT_FOUND).entity("Oops! the requested resource is not found!").type("text/plain").build();
    }

}
