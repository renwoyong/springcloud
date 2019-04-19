package com.yong.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yong.springcloud.entities.Book;
import com.yong.springcloud.service.NewBookService;

@RestController
public class NewBookController {
	
	@Autowired
	private NewBookService newBookService;
	
	@RequestMapping(value="/book/findNewBooklist",method=RequestMethod.GET)
	public List<Book> findNewBooklist()
	{
		return newBookService.findNewBooklist();
	}
	
	@RequestMapping(value="/book/upPlan/{bookid}",method=RequestMethod.POST)
	public boolean upPlan(@PathVariable("bookid") long bookid)
	{
		return newBookService.upPlan(bookid);
	}
	
	@RequestMapping(value="/book/unupPlan/{bookid}",method=RequestMethod.POST)
	public boolean unupPlan(@PathVariable("bookid") long bookid)
	{
		return newBookService.unupPlan(bookid);
	}

}
