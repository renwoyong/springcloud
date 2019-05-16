package com.yong.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yong.springcloud.entities.Book;

@FeignClient(value = "read-book-provider8002")
public interface NewBookClientService {

	@RequestMapping(value="/book/findNewBooklist",method=RequestMethod.GET)
	public List<Book> findNewBooklist();
	
	@RequestMapping(value="/book/upPlan/{bookid}",method=RequestMethod.POST)
	public boolean upPlan(@PathVariable("bookid") long bookid);
	
	@RequestMapping(value="/book/unupPlan/{bookid}",method=RequestMethod.POST)
	public boolean unupPlan(@PathVariable("bookid") long bookid);
	
	@RequestMapping(value="/book/findShowNewBooklist",method=RequestMethod.GET)
	public List<Book> findShowNewBooklist();
}
