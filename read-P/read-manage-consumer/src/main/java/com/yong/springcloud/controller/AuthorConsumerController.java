package com.yong.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yong.springcloud.entities.Author;
import com.yong.springcloud.service.AuthorClientService;

@Controller
public class AuthorConsumerController {
	
	@Autowired
	private AuthorClientService authorClientService;
	
	 //用户列表
	  @RequestMapping(value = "/consumer/author/findAll")
	 public String List(Model model) {
		 List<Author> authors=authorClientService.findAll();
		 model.addAttribute("authors", authors);
		 return "author/authorlist";
	 }
	  //增加用户
	  @RequestMapping(value = "/consumer/author/toadd")
	 public String toadd() {
		 return "author/authorAdd";
	 }
	  
	  @RequestMapping(value = "/consumer/author/add")
	  public String add(Author author)
	  {
		  authorClientService.addAuthor(author);
		  return "redirect:/consumer/author/findAll";
	  }

	  //修改用户
	  @RequestMapping(value="/consumer/author/toedit")
	  public String toEdit(Model model,Long authorid) {
		  Author author=authorClientService.findAuthor(authorid);
		  model.addAttribute("author", author);
		  return "author/authorEdit";
	  }
	  
	  @RequestMapping(value="/consumer/author/edit")
	  public String edit(Author author) {
		  authorClientService.upAuthor(author);
		  return "redirect:/consumer/author/findAll";
	  }
	  
	  
	  //删除用户
	  @RequestMapping(value="/consumer/author/delAuthor")
	  public String delete(Long authorid) {
		  authorClientService.delAuthor(authorid);
		  return "redirect:/consumer/author/findAll";
	  }

}
