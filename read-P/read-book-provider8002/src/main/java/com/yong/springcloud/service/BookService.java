package com.yong.springcloud.service;

import java.util.List;

import com.yong.springcloud.entities.Book;

public interface BookService {
	
	public List<Book> findBooklist();
	
	public Book findBook(Long bookid);
	
	public boolean addBook(Book book);
	
	public boolean upBook(Book book);
	
	public boolean delBook(Long bookid);

}
