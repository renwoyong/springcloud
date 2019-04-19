package com.yong.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yong.springcloud.entities.Book;
import com.yong.springcloud.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

	@RequestMapping(value="/book/findBook/{bookid}",method=RequestMethod.GET)
	public Book findBook(@PathVariable("bookid") Long bookid) 
	{
		return bookService.findBook(bookid);
	}
	
	@RequestMapping(value="/book/findBooklist",method=RequestMethod.GET)
	public List<Book> findBooklist()
	{
		return bookService.findBooklist();
	}
	
	@RequestMapping(value="/book/addBook",method=RequestMethod.POST)
	public boolean addBook(@RequestBody Book book)
	{
		return bookService.addBook(book);
	}
	
	@RequestMapping(value="/book/upBook",method=RequestMethod.POST)
	public boolean upBook(@RequestBody Book book)
	{
		return bookService.upBook(book);
	}
	
	@RequestMapping(value="/book/delBook/{bookid}",method=RequestMethod.POST)
	public boolean delBook(@PathVariable("bookid") Long bookid)
	{
		return bookService.delBook(bookid);
	}
}
