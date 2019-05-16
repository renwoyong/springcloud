package com.yong.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value="/book/findSubBookList",method=RequestMethod.GET)
	//public List<Book> findSubBookList(@RequestParam(value="pageutil") PageUtil pageutil)
	public List<Book> findSubBookList(@RequestParam(value="pagenum") Integer pagenum)
	{
		return bookService.findSubBookList(pagenum);
	}
	@RequestMapping(value="/book/findSubBookCount",method=RequestMethod.GET)
	public Integer findSubBookCount()
	{
		return bookService.findSubBookCount();
	}
	
	@RequestMapping(value="/book/findSubBookList1",method=RequestMethod.GET)
	//public List<Book> findSubBookList(@RequestParam(value="pageutil") PageUtil pageutil)
	public List<Book> findSubBookList1(@RequestParam(value="pagenum") Integer pagenum)
	{
		return bookService.findSubBookList1(pagenum);
	}
	@RequestMapping(value="/book/findSubBookCount1",method=RequestMethod.GET)
	public Integer findSubBookCount1()
	{
		return bookService.findSubBookCount1();
	}
	
	@RequestMapping(value="/book/findSubBookList2",method=RequestMethod.GET)
	//public List<Book> findSubBookList(@RequestParam(value="pageutil") PageUtil pageutil)
	public List<Book> findSubBookList2(@RequestParam(value="pagenum") Integer pagenum)
	{
		return bookService.findSubBookList2(pagenum);
	}
	@RequestMapping(value="/book/findSubBookCount2",method=RequestMethod.GET)
	public Integer findSubBookCount2()
	{
		return bookService.findSubBookCount2();
	}
	
	@RequestMapping(value="/book/findSubBookList3",method=RequestMethod.GET)
	//public List<Book> findSubBookList(@RequestParam(value="pageutil") PageUtil pageutil)
	public List<Book> findSubBookList3(@RequestParam(value="pagenum") Integer pagenum)
	{
		return bookService.findSubBookList3(pagenum);
	}
	@RequestMapping(value="/book/findSubBookCount3",method=RequestMethod.GET)
	public Integer findSubBookCount3()
	{
		return bookService.findSubBookCount3();
	}
	
	@RequestMapping(value="/book/findSubBookList4",method=RequestMethod.GET)
	//public List<Book> findSubBookList(@RequestParam(value="pageutil") PageUtil pageutil)
	public List<Book> findSubBookList4(@RequestParam(value="pagenum") Integer pagenum)
	{
		return bookService.findSubBookList4(pagenum);
	}
	@RequestMapping(value="/book/findSubBookCount4",method=RequestMethod.GET)
	public Integer findSubBookCount4()
	{
		return bookService.findSubBookCount4();
	}
	
	@RequestMapping(value="/book/findSubBookList5",method=RequestMethod.GET)
	//public List<Book> findSubBookList(@RequestParam(value="pageutil") PageUtil pageutil)
	public List<Book> findSubBookList5(@RequestParam(value="pagenum") Integer pagenum)
	{
		return bookService.findSubBookList5(pagenum);
	}
	@RequestMapping(value="/book/findSubBookCount5",method=RequestMethod.GET)
	public Integer findSubBookCount5()
	{
		return bookService.findSubBookCount5();
	}
	
	@RequestMapping(value="/book/findSubBookList6",method=RequestMethod.GET)
	//public List<Book> findSubBookList(@RequestParam(value="pageutil") PageUtil pageutil)
	public List<Book> findSubBookList6(@RequestParam(value="pagenum") Integer pagenum)
	{
		return bookService.findSubBookList6(pagenum);
	}
	@RequestMapping(value="/book/findSubBookCount6",method=RequestMethod.GET)
	public Integer findSubBookCount6()
	{
		return bookService.findSubBookCount6();
	}
	
	@RequestMapping(value="/book/findSubBookList7",method=RequestMethod.GET)
	//public List<Book> findSubBookList(@RequestParam(value="pageutil") PageUtil pageutil)
	public List<Book> findSubBookList7(@RequestParam(value="pagenum") Integer pagenum)
	{
		return bookService.findSubBookList7(pagenum);
	}
	@RequestMapping(value="/book/findSubBookCount7",method=RequestMethod.GET)
	public Integer findSubBookCount7()
	{
		return bookService.findSubBookCount7();
	}
	
	@RequestMapping(value="/book/findSubBookList8",method=RequestMethod.GET)
	//public List<Book> findSubBookList(@RequestParam(value="pageutil") PageUtil pageutil)
	public List<Book> findSubBookList8(@RequestParam(value="pagenum") Integer pagenum)
	{
		return bookService.findSubBookList8(pagenum);
	}
	@RequestMapping(value="/book/findSubBookCount8",method=RequestMethod.GET)
	public Integer findSubBookCount8()
	{
		return bookService.findSubBookCount8();
	}
	
	@RequestMapping(value="/book/findsomeBooks",method=RequestMethod.GET)
	public List<Book> findsomeBooks(@RequestParam(value="thekey") String thekey,@RequestParam(value="pagenum") Integer pagenum)
	{
		return bookService.findsomeBooks(thekey,pagenum);
	}
	
	@RequestMapping(value="/book/findsomeBooksCount",method=RequestMethod.GET)
	public Integer findsomeBooksCount(@RequestParam(value="thekey") String thekey)
	{
		return bookService.findsomeBooksCount(thekey);
	}
	
	@RequestMapping(value="/book/findweekBookList",method=RequestMethod.GET)
	public List<Book> findweekBookList()
	{
		return bookService.findweekBookList();
	}
	
	@RequestMapping(value="/book/findmonthBookList",method=RequestMethod.GET)
	public List<Book> findmonthBookList()
	{
		return bookService.findmonthBookList();
	}
	
	@RequestMapping(value="/book/findyearBookList",method=RequestMethod.GET)
	public List<Book> findyearBookList()
	{
		return bookService.findyearBookList();
	}
}
