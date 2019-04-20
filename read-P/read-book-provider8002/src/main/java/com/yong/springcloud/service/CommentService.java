package com.yong.springcloud.service;

import java.util.List;

import com.yong.springcloud.entities.Comment;

public interface CommentService {

	public List<Comment> findCommentlist();
	
	public List<Comment> findComments(String bookname);
	
	public boolean delComment(Long commentid);
}
