/**
 * Copyright (c) 2012 Sohu. All Rights Reserved
 */
package com.sohu.wemedia.broadcast.service.impl;

import com.sohu.wemedia.broadcast.model.Comment;
import com.sohu.wemedia.broadcast.service.CommentService;

public class CommentServiceImpl implements CommentService {

    @Override
    public Comment getCommentById(Long id) {
        Comment comment = new Comment();
        comment.setId(id);
        comment.setConent("Comment_" + String.valueOf(id));
        return comment;
    }

}
