package com.yong.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yong.springcloud.entities.Comment;
import com.yong.springcloud.service.CommentClientService;

@Controller
public class CommentConsumerController {
	
	@Autowired
	private CommentClientService commentClientService;
	
	@RequestMapping(value="/consumer/comment/findCommentlist")
	public String CommentList(Model model)
	{
		List<Comment> comments = commentClientService.findCommentlist();
		model.addAttribute("comments", comments);
		return "comment/commentlist";
	}
	
	@RequestMapping(value="/consumer/comment/delComment")
	public String delComment(Long commentid)
	{
		commentClientService.delComment(commentid);
		return "redirect:/consumer/comment/findCommentlist";
	}
	
	@RequestMapping(value="/consumer/comment/findComments")
	public String findComments(Model model,String bookname)
	{
		List<Comment> comments = commentClientService.findComments(bookname);
		model.addAttribute("comments", comments);
		return "comment/commentlist";
	}

}
