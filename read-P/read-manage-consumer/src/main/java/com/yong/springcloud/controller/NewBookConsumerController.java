package com.yong.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yong.springcloud.entities.Book;
import com.yong.springcloud.service.NewBookClientService;

@Controller
public class NewBookConsumerController {
	
	@Autowired
	private NewBookClientService newBookClientService;
	
	@RequestMapping(value="/consumer/book/findNewBooklist")
	public String findNewBooklist(Model model)
	{
		List<Book> books= newBookClientService.findNewBooklist();
		model.addAttribute("books", books);
		return "newbook/newbooklist";
	}
	
	@RequestMapping(value="/consumer/book/upPlan")
	public String upPlan(Long bookid) 
	{
		newBookClientService.upPlan(bookid);
		return "redirect:/consumer/book/findNewBooklist";
	}
	@RequestMapping(value="/consumer/book/unupPlan")
	public String unupPlan(Long bookid)
	{
		newBookClientService.unupPlan(bookid);
		return "redirect:/consumer/book/findNewBooklist";
	}

}
