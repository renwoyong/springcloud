package com.yong.springcloud.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yong.springcloud.entities.Author;
import com.yong.springcloud.service.AuthorClientService;
import com.yong.springcloud.service.BookClientService;


@Controller
public class AuthorConsumerController {
	
	@Autowired
	private AuthorClientService authorClientService;
	@Autowired
	private BookClientService bookClientService;
	
	 //�û��б�
	  @RequestMapping(value = "/consumer/author/findAll")
	 public String List(Model model) {
		 List<Author> authors=authorClientService.findAll();
		 for(int i=0 ; i<authors.size() ; i++)
		 {
			 Integer bookcount = bookClientService.findbookcount(authors.get(i).getAuthorname());
			 if(bookcount!=null)
			 {
				 BigDecimal bookincome = new BigDecimal(bookcount*0.01);
				 authors.get(i).setAuthorincome(bookincome);
				 authorClientService.upAuthor(authors.get(i));
			 }
		 }
		 List<Author> authors1=authorClientService.findAll();
		 model.addAttribute("authors", authors1);
		 return "author/authorlist";
	 }
	  //�����û�
	  @RequestMapping(value = "/consumer/author/toadd")
	 public String toadd() {
		 return "author/authorAdd";
	 }
	  
	  @RequestMapping(value = "/consumer/author/add")
	  public String add(Model model,Author author)
	  {
		  Author author2 = authorClientService.findAuthorAsName(author.getAuthorname());
		  if(author2!=null)
		  {
			  model.addAttribute("msg", "错误：用户名已存在！");
			  return "author/authorAdd";
		  }
		  else {
			  authorClientService.addAuthor(author);
			  return "redirect:/consumer/author/findAll";
		}
	  }

	  //�޸��û�
	  @RequestMapping(value="/consumer/author/toedit")
	  public String toEdit(Model model,Long authorid) {
		  Author author=authorClientService.findAuthor(authorid);
		  model.addAttribute("author", author);
		  return "author/authorEdit";
	  }
	  
	  @RequestMapping(value="/consumer/author/edit")
	  public String edit(Author author) {
		  Author author2 = authorClientService.findAuthorAsName(author.getAuthorname());
		  if(author2!=null&&(author2.getAuthorid().equals(author.getAuthorid())==false))
		  {
			  return "redirect:/consumer/author/toedit?authorid="+author.getAuthorid()+"&error=1";
		  }
		  else {
			  authorClientService.upAuthor(author);
			  return "redirect:/consumer/author/findAll";
		}
	  }
	  
	  
	  //ɾ���û�
	  @RequestMapping(value="/consumer/author/delAuthor")
	  public String delete(Long authorid) {
		  authorClientService.delAuthor(authorid);
		  return "redirect:/consumer/author/findAll";
	  }

}
