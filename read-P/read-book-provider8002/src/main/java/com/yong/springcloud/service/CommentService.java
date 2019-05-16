package com.yong.springcloud.service;

import java.util.List;

import com.yong.springcloud.entities.Comment;

public interface CommentService {

	public List<Comment> findCommentlist();
	
	public List<Comment> findComments(String bookname);
	
	public boolean delComment(Long commentid);
	
	//增加评论
	public boolean addComment(Comment comment);
	//前台评论列表
	public List<Comment> findshowComments(Long bookid);
	//修改评论
	public boolean upComment(Comment comment);
}
