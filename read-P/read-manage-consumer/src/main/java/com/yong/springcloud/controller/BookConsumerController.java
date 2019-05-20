package com.yong.springcloud.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yong.springcloud.entities.Author;
import com.yong.springcloud.entities.Book;
import com.yong.springcloud.service.AuthorClientService;
import com.yong.springcloud.service.BookClientService;

@Controller
public class BookConsumerController {

	@Autowired
	private BookClientService bookClientService;
	@Autowired
	private AuthorClientService authorClientService;
	
	@RequestMapping(value="/consumer/book/findBooklist")
	public String List(Model model)
	{
		 List<Book> books=bookClientService.findBooklist();
		 for(int i=0;i<books.size();i++)
		 {
			 Author author = authorClientService.findAuthorAsName(books.get(i).getBookauthor());
			 if(author!=null) {
			 System.out.println("auincom="+author.getAuthorincome());
			 System.out.println("bocount="+books.get(i).getBookcount());
			 BigDecimal bookincome = new BigDecimal(books.get(i).getBookcount()*0.01);
			 author.setAuthorincome(author.getAuthorincome().add(bookincome));
			 authorClientService.upAuthor(author);
			 }
		 }
		 model.addAttribute("books", books);
		 return "book/booklist";
	}
	
	@RequestMapping(value="/consumer/book/toadd")
	public String toadd()
	{
		return "book/bookAdd";
	}
	
	@RequestMapping(value="/consumer/book/add")
	public String add(Book book)
	{
		bookClientService.addBook(book);
		return "redirect:/consumer/book/findBooklist";
	}
	
	@RequestMapping(value="/consumer/book/toedit")
	public String toedit(Model model,Long bookid)
	{
		Book book=bookClientService.findBook(bookid);
		model.addAttribute("book", book);
		return "book/bookEdit";
	}
	
	@RequestMapping(value="/consumer/book/edit")
	public String edit(Book book) 
	{
		bookClientService.upBook(book);
		return "redirect:/consumer/book/findBooklist";
	}
	
	@RequestMapping(value="/consumer/book/delbook")
	public String delbook(Long bookid)
	{
		bookClientService.delBook(bookid);
		return "redirect:/consumer/book/findBooklist";
	}
}
