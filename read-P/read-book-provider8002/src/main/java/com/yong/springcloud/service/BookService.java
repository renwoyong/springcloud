package com.yong.springcloud.service;

import java.util.List;

import com.yong.springcloud.entities.Book;

public interface BookService {
	
	public List<Book> findBooklist();
	
	public Book findBook(Long bookid);
	
	public boolean addBook(Book book);
	
	public boolean upBook(Book book);
	
	public boolean delBook(Long bookid);
	
	public List<Book> findSubBookList(Integer pagenum);
	
	public Integer findSubBookCount();
	
	//穿越小说
	public List<Book> findSubBookList1(Integer pagenum);
	
	public Integer findSubBookCount1();
	//历史架空
	public List<Book> findSubBookList2(Integer pagenum);
	
	public Integer findSubBookCount2();
	//总裁豪门
	public List<Book> findSubBookList3(Integer pagenum);
	
	public Integer findSubBookCount3();
	//言情小说
	public List<Book> findSubBookList4(Integer pagenum);
	
	public Integer findSubBookCount4();
	//玄幻魔法
	public List<Book> findSubBookList5(Integer pagenum);
	
	public Integer findSubBookCount5();
	//都市异能
	public List<Book> findSubBookList6(Integer pagenum);
	
	public Integer findSubBookCount6();
	//历史军事
	public List<Book> findSubBookList7(Integer pagenum);
	
	public Integer findSubBookCount7();
	//网游小说
	public List<Book> findSubBookList8(Integer pagenum);
	
	public Integer findSubBookCount8();
	
	public  List<Book> findsomeBooks(String thekey,Integer pagenum);
	
	public Integer findsomeBooksCount(String thekey);

	public List<Book> findweekBookList();
	
	public List<Book> findmonthBookList();
	
	public List<Book> findyearBookList();
}
