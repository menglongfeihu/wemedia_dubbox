/**
 * Copyright (c) 2012 Sohu. All Rights Reserved
 */
package com.sohu.wemedia.broadcast.model;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Comment implements Serializable{

    private static final long serialVersionUID = -8361444260523693057L;


    @NotNull
    @Min(1L)
    @JsonProperty("commentId")
    @XmlElement(name = "commentId")
    private Long id;


    @JsonProperty("content")
    @XmlElement(name = "content")
    @NotNull
    @Size(min = 6, max = 50)
    private String conent;

    public Comment() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConent() {
        return conent;
    }

    public void setConent(String conent) {
        this.conent = conent;
    }

    @Override
    public String toString() {
        return "Comment [id=" + id + ", conent=" + conent + "]";
    }

}
