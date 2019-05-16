package com.yong.springcloud.service;

import java.util.List;

import com.yong.springcloud.entities.Book;

public interface NewBookService {

	public List<Book> findNewBooklist();
	
	public boolean upPlan(Long bookid);
	
	public boolean unupPlan(Long bookid);
	
	public List<Book> findShowNewBooklist();
}
