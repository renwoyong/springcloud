package com.yong.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yong.springcloud.entities.Author;


@FeignClient(value = "read-user-provider8001")
public interface AuthorClientService {
	
	@RequestMapping(value = "/author/findAuthor/{authorid}",method=RequestMethod.GET)
	public Author findAuthor(@PathVariable("authorid") long authorid);
	
	@RequestMapping(value = "/author/findAll",method=RequestMethod.GET)
	public List<Author> findAll();
	
	@RequestMapping(value = "/author/addAuthor",method=RequestMethod.POST)
	public boolean addAuthor(Author author);
	
	@RequestMapping(value = "/author/upAuthor",method=RequestMethod.POST)
	public boolean upAuthor(Author author);
	
	@RequestMapping(value = "/author/delAuthor/{authorid}",method=RequestMethod.POST)
	public boolean delAuthor(@PathVariable("authorid") long authorid);
	
	@RequestMapping(value="/author/finddots",method=RequestMethod.GET)
	public Author finddots(@RequestParam("bookauthor") String bookauthor);
	
	@RequestMapping(value="/author/updots",method=RequestMethod.POST)
	public boolean updots(@RequestBody Author author);
	
	@RequestMapping(value="/author/findAuthorAsName/{authorname}",method=RequestMethod.GET)
	public Author findAuthorAsName(@PathVariable("authorname") String authorname);
}
