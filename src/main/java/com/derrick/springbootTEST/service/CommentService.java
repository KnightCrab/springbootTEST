package com.derrick.springbootTEST.service;

import com.derrick.springbootTEST.entitiy.Comment;

/**
 * #author coffice
 *
 * @create 2018-07-06-14:39
 **/
public interface CommentService {
    int deleteByPrimaryKey(Integer commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}
