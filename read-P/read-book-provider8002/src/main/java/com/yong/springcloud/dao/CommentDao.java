package com.yong.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yong.springcloud.entities.Comment;

@Mapper
public interface CommentDao {
	
	public List<Comment> findCommentlist();
	
	public List<Comment> findComments(String bookname);
	
	public boolean delComment(Long commentid);

}
