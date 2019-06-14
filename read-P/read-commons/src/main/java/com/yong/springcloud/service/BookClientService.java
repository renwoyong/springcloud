package com.yong.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yong.springcloud.entities.Book;



@FeignClient(value = "read-book-provider8002")
public interface BookClientService {

	@RequestMapping(value="/book/findBook/{bookid}",method=RequestMethod.GET)
	public Book findBook(@PathVariable("bookid") long bookid);
	
	@RequestMapping(value="book/findBookAsName/{bookname}",method=RequestMethod.GET)
	public Book findBookAsName(@PathVariable("bookname") String bookname);
	
	@RequestMapping(value="/book/findBooklist",method=RequestMethod.GET)
	public List<Book> findBooklist();
	
	@RequestMapping(value="/book/addBook",method=RequestMethod.POST)
	public boolean addBook(Book book);
	
	@RequestMapping(value="/book/upBook",method=RequestMethod.POST)
	public boolean upBook(Book book);
	
	@RequestMapping(value="/book/delBook/{bookid}",method=RequestMethod.POST)
	public boolean delBook(@PathVariable("bookid") long bookid);
	
	//@RequestMapping(value="/book/findSubBookList",method=RequestMethod.GET)
	//public List<Book> findSubBookList(@RequestParam(value="pageNo") int pageNo);
	
	@RequestMapping(value="/book/findSubBookList",method=RequestMethod.GET)
	//public List<Book> findSubBookList(@PathVariable("pageutil") PageUtil pageutil);
	public List<Book> findSubBookList(@RequestParam(value="pagenum") Integer pagenum);
	
	@RequestMapping(value="/book/findSubBookCount",method=RequestMethod.GET)
	public Integer findSubBookCount();
	
	@RequestMapping(value="/book/findSubBookList1",method=RequestMethod.GET)
	public List<Book> findSubBookList1(@RequestParam(value="pagenum") Integer pagenum);
	
	@RequestMapping(value="/book/findSubBookCount1",method=RequestMethod.GET)
	public Integer findSubBookCount1();
	
	@RequestMapping(value="/book/findSubBookList2",method=RequestMethod.GET)
	public List<Book> findSubBookList2(@RequestParam(value="pagenum") Integer pagenum);
	
	@RequestMapping(value="/book/findSubBookCount2",method=RequestMethod.GET)
	public Integer findSubBookCount2();
	
	@RequestMapping(value="/book/findSubBookList3",method=RequestMethod.GET)
	public List<Book> findSubBookList3(@RequestParam(value="pagenum") Integer pagenum);
	
	@RequestMapping(value="/book/findSubBookCount3",method=RequestMethod.GET)
	public Integer findSubBookCount3();
	
	@RequestMapping(value="/book/findSubBookList4",method=RequestMethod.GET)
	public List<Book> findSubBookList4(@RequestParam(value="pagenum") Integer pagenum);
	
	@RequestMapping(value="/book/findSubBookCount4",method=RequestMethod.GET)
	public Integer findSubBookCount4();
	
	@RequestMapping(value="/book/findSubBookList5",method=RequestMethod.GET)
	public List<Book> findSubBookList5(@RequestParam(value="pagenum") Integer pagenum);
	
	@RequestMapping(value="/book/findSubBookCount5",method=RequestMethod.GET)
	public Integer findSubBookCount5();
	
	@RequestMapping(value="/book/findSubBookList6",method=RequestMethod.GET)
	public List<Book> findSubBookList6(@RequestParam(value="pagenum") Integer pagenum);
	
	@RequestMapping(value="/book/findSubBookCount6",method=RequestMethod.GET)
	public Integer findSubBookCount6();
	
	@RequestMapping(value="/book/findSubBookList7",method=RequestMethod.GET)
	public List<Book> findSubBookList7(@RequestParam(value="pagenum") Integer pagenum);
	
	@RequestMapping(value="/book/findSubBookCount7",method=RequestMethod.GET)
	public Integer findSubBookCount7();
	
	@RequestMapping(value="/book/findSubBookList8",method=RequestMethod.GET)
	public List<Book> findSubBookList8(@RequestParam(value="pagenum") Integer pagenum);
	
	@RequestMapping(value="/book/findSubBookCount8",method=RequestMethod.GET)
	public Integer findSubBookCount8();
	
	@RequestMapping(value="/book/findsomeBooks",method=RequestMethod.GET)
	public List<Book> findsomeBooks(@RequestParam(value="thekey") String thekey,@RequestParam(value="pagenum") Integer pagenum);
	
	@RequestMapping(value="/book/findsomeBooksCount",method=RequestMethod.GET)
	public Integer findsomeBooksCount(@RequestParam(value="thekey") String thekey);
	
	@RequestMapping(value="/book/findweekBookList",method=RequestMethod.GET)
	public List<Book> findweekBookList();
	
	@RequestMapping(value="/book/findmonthBookList",method=RequestMethod.GET)
	public List<Book> findmonthBookList();
	
	@RequestMapping(value="/book/findyearBookList",method=RequestMethod.GET)
	public List<Book> findyearBookList();
	
	@RequestMapping(value="/book/findbookcount/{bookauthor}",method=RequestMethod.GET)
	public Integer findbookcount(@PathVariable("bookauthor") String bookauthor);
	
}
