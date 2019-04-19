package com.yong.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yong.springcloud.entities.Book;


@FeignClient(value = "read-book-provider8002")
public interface BookClientService {

	@RequestMapping(value="/book/findBook/{bookid}",method=RequestMethod.GET)
	public Book findBook(@PathVariable("bookid") long bookid);
	
	@RequestMapping(value="/book/findBooklist",method=RequestMethod.GET)
	public List<Book> findBooklist();
	
	@RequestMapping(value="/book/addBook",method=RequestMethod.POST)
	public boolean addBook(Book book);
	
	@RequestMapping(value="/book/upBook",method=RequestMethod.POST)
	public boolean upBook(Book book);
	
	@RequestMapping(value="/book/delBook/{bookid}",method=RequestMethod.POST)
	public boolean delBook(@PathVariable("bookid") long bookid);
}
