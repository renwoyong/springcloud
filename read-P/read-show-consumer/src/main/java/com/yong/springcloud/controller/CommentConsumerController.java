package com.yong.springcloud.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yong.springcloud.entities.Book;
import com.yong.springcloud.entities.Comment;
import com.yong.springcloud.entities.ReadUser;
import com.yong.springcloud.service.BookClientService;
import com.yong.springcloud.service.CommentClientService;

@Controller
public class CommentConsumerController {
	
	@Autowired
	private CommentClientService commentClientService;
	@Autowired
	private BookClientService bookClientService;
	
	@RequestMapping(value="/consumer/comment/findshowcomments")
	public String CommentList(Model model,Long bookid,String bookname)
	{
		List<Comment> comments =commentClientService.findshowComments(bookid);
		if(comments!=null)
		{
			model.addAttribute("bookname", bookname);
			model.addAttribute("bookid", bookid);
			model.addAttribute("comments", comments);
			return "comment";
		}
		else {
			model.addAttribute("bookname", bookname);
			model.addAttribute("bookid", bookid);
			return "comment";
		}
	}
	
	@RequestMapping(value="/consumer/comment/editcomment")
	public String commentedit(Model model,HttpServletRequest request,String comment_content,Long bookid,String bookname)
	{
		Comment comment = new Comment();
		ReadUser readUser = (ReadUser) request.getSession().getAttribute("findreadUser");
		if(readUser!=null) {
			
			comment.setUsername(readUser.getUsername());
			comment.setBookid(bookid);
			
			Book book = bookClientService.findBook(bookid);
			comment.setBookname(book.getBookname());
			if(comment_content.length()>=1&&comment_content.length()<=100)
			{
				comment.setContext(comment_content);
			}
			else {
				/*
				 * model.addAttribute("msg", "评论内容不能为空或多于100字"); return "comment";
				 */
				return "redirect:/consumer/comment/findshowcomments?bookid="+bookid+"&error1=1";
			}
			commentClientService.addComment(comment);
			return "redirect:/consumer/comment/findshowcomments?bookid="+bookid;
		}
		else {
			/*
			 * model.addAttribute("msg", "用户未登陆，请先登录再评论！"); return "comment";
			 */
			return "redirect:/consumer/comment/findshowcomments?bookid="+bookid+"&error2=1";
		}
	}

}
