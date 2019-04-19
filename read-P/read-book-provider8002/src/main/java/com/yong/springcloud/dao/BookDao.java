package com.yong.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yong.springcloud.entities.Book;
@Mapper
public interface BookDao {

	public List<Book> findBooklist();
	
	public Book findBook(Long bookid);
	
	public boolean addBook(Book book);
	
	public boolean upBook(Book book);
	
	public boolean delBook(Long bookid);
	
}
