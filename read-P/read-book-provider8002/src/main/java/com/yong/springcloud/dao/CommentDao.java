package com.yong.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yong.springcloud.entities.Comment;

@Mapper
public interface CommentDao {
	
	//后台管理评论列表
	public List<Comment> findCommentlist();
	//后台管理评论按书名查询
	public List<Comment> findComments(String bookname);
	//删除评论
	public boolean delComment(Long commentid);
	//增加评论
	public boolean addComment(Comment comment);
	//前台评论列表
	public List<Comment> findshowComments(Long bookid);
	//修改评论
	public boolean upComment(Comment comment);
}
