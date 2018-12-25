package com.derrick.springbootTEST.service.impl;


import com.derrick.springbootTEST.dao.CommentMapper;
import com.derrick.springbootTEST.entitiy.Comment;
import com.derrick.springbootTEST.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * #author coffice
 *
 * @create 2018-07-06-14:40
 **/
@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int deleteByPrimaryKey(Integer commentId) {
        return commentMapper.deleteByPrimaryKey(commentId);
    }

    @Override
    public int insert(Comment record) {
        return commentMapper.insert(record);
    }

    @Override
    public int insertSelective(Comment record) {
        return commentMapper.insertSelective(record);
    }

    @Override
    public Comment selectByPrimaryKey(Integer commentId) {
        return commentMapper.selectByPrimaryKey(commentId);
    }

    @Override
    public int updateByPrimaryKeySelective(Comment record) {
        return commentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Comment record) {
        return commentMapper.updateByPrimaryKey(record);
    }
}
