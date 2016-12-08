/**
 * Copyright (c) 2012 Sohu. All Rights Reserved
 */
package com.sohu.wemedia.broadcast.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseResult implements Serializable{

    private static final long serialVersionUID = -8967801809907714885L;

    @JsonProperty("status")
    @XmlElement(name = "status")
    private Integer status;

    @JsonProperty("message")
    @XmlElement(name = "message")
    private String message;

    @JsonProperty("data")
    @XmlElement(name = "data")
    private Object data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseResult [status=" + status + ", message=" + message + ", data=" + data + "]";
    }

}
