package com.yong.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yong.springcloud.dao.CommentDao;
import com.yong.springcloud.entities.Comment;
import com.yong.springcloud.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentDao commentDao;

	@Override
	public List<Comment> findCommentlist() {
		return commentDao.findCommentlist();
	}

	@Override
	public List<Comment> findComments(String bookname) {
		return commentDao.findComments(bookname);
	}

	@Override
	public boolean delComment(Long commentid) {
		return commentDao.delComment(commentid);
	}

	@Override
	public boolean addComment(Comment comment) {
		return commentDao.addComment(comment);
	}

	@Override
	public List<Comment> findshowComments(Long bookid) {
		return commentDao.findshowComments(bookid);
	}

	@Override
	public boolean upComment(Comment comment) {
		return commentDao.upComment(comment);
	}
	
	
}
