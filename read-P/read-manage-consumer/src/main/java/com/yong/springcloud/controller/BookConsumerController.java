package com.yong.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yong.springcloud.entities.Book;
import com.yong.springcloud.service.BookClientService;

@Controller
public class BookConsumerController {

	@Autowired
	private BookClientService bookClientService;

	
	@RequestMapping(value="/consumer/book/findBooklist")
	public String List(Model model)
	{
		 List<Book> books=bookClientService.findBooklist();
		/*
		 * for(int i=0;i<books.size();i++) { Author author =
		 * authorClientService.findAuthorAsName(books.get(i).getBookauthor());
		 * if(author!=null) { System.out.println("auincom="+author.getAuthorincome());
		 * System.out.println("bocount="+books.get(i).getBookcount()); BigDecimal
		 * bookincome = new BigDecimal(books.get(i).getBookcount()*0.01);
		 * author.setAuthorincome(author.getAuthorincome().add(bookincome));
		 * authorClientService.upAuthor(author); } }
		 */
		 model.addAttribute("books", books);
		 return "book/booklist";
	}
	
	@RequestMapping(value="/consumer/book/toadd")
	public String toadd()
	{
		return "book/bookAdd";
	}
	
	@RequestMapping(value="/consumer/book/add")
	public String add(Model model,Book book)
	{
		Book book2 = bookClientService.findBookAsName(book.getBookname());
		if(book2!=null)
		{
			model.addAttribute("msg", "错误：书名已存在！");
			return "book/bookAdd";
		}
		else {
			bookClientService.addBook(book);
			return "redirect:/consumer/book/findBooklist";
		}
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
		Book book2 = bookClientService.findBookAsName(book.getBookname());
		if(book2!=null&&(book2.getBookid().equals(book.getBookid())==false))
		{
			return "redirect:/consumer/book/toedit?bookid="+book.getBookid()+"&error=1";
		}
		else {
			bookClientService.upBook(book);
			return "redirect:/consumer/book/findBooklist";
		}
	}
	
	@RequestMapping(value="/consumer/book/delbook")
	public String delbook(Long bookid)
	{
		bookClientService.delBook(bookid);
		return "redirect:/consumer/book/findBooklist";
	}
}
