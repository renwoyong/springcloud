package com.yong.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yong.springcloud.entities.Comment;
import com.yong.springcloud.service.CommentService;

@RestController
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value="/comment/findCommentlist",method=RequestMethod.GET)
	public List<Comment> findCommentlist()
	{
		return commentService.findCommentlist();
	}
	
	@RequestMapping(value="/comment/findComments/{bookname}",method=RequestMethod.GET)
	public List<Comment> findComments(@PathVariable("bookname") String bookname)
	{
		return commentService.findComments(bookname);
	}
	
	@RequestMapping(value="/comment/delComment/{commentid}",method=RequestMethod.POST)
	public boolean delComment(@PathVariable("commentid") long commentid)
	{
		return commentService.delComment(commentid);
	}
	
	@RequestMapping(value="/comment/addComment",method=RequestMethod.POST)
	public boolean addComment(@RequestBody Comment comment)
	{
		return commentService.addComment(comment);
	}
	
	@RequestMapping(value="/comment/findshowComments/{bookid}",method=RequestMethod.GET)
	public List<Comment> findshowComments(@PathVariable("bookid") Long bookid)
	{
		return commentService.findshowComments(bookid);
	}

	@RequestMapping(value="/comment/upComment",method=RequestMethod.POST)
	public boolean upComment(@RequestBody Comment comment)
	{
		return commentService.upComment(comment);
	}
}
