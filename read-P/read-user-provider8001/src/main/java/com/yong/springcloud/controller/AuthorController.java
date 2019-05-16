package com.yong.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yong.springcloud.entities.Author;
import com.yong.springcloud.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
	@RequestMapping(value = "author/findAuthor/{authorid}",method=RequestMethod.GET)
	public Author findAuthor(@PathVariable("authorid") Long authorid)
	{
		return authorService.findAuthor(authorid);
	}
	
	@RequestMapping(value = "/author/findAll",method=RequestMethod.GET)
	public List<Author> findAll()
	{
		return authorService.findAll();
	}
	
	@RequestMapping(value = "/author/addAuthor",method=RequestMethod.POST)
	public boolean addAuthor(@RequestBody Author author)
	{
		return authorService.addAuthor(author);
	}
	
	@RequestMapping(value = "/author/upAuthor",method=RequestMethod.POST)
	public boolean upAuthor(@RequestBody Author author)
	{
		return authorService.upAuthor(author);
	}
	
	@RequestMapping(value = "/author/delAuthor/{authorid}",method=RequestMethod.POST)
	public boolean delAuthor(@PathVariable("authorid") Long authorid) 
	{
		return authorService.delAuthor(authorid);
	}

	@RequestMapping(value="/author/finddots",method=RequestMethod.GET)
	public Author finddots(@RequestParam("bookauthor") String bookauthor)
	{
		return authorService.finddots(bookauthor);
	}
	
	@RequestMapping(value="/author/updots",method=RequestMethod.POST)
	public boolean updots(@RequestBody Author author)
	{
		return authorService.updots(author);
	}
}
