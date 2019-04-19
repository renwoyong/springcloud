package com.yong.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yong.springcloud.dao.BookDao;
import com.yong.springcloud.entities.Book;
import com.yong.springcloud.service.BookService;
@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;

	@Override
	public List<Book> findBooklist() {
		return bookDao.findBooklist();
	}

	@Override
	public Book findBook(Long bookid) {
		return bookDao.findBook(bookid);
	}

	@Override
	public boolean addBook(Book book) {
		return bookDao.addBook(book);
	}

	@Override
	public boolean upBook(Book book) {
		return bookDao.upBook(book);
	}

	@Override
	public boolean delBook(Long bookid) {
		return bookDao.delBook(bookid);
	}
	
}
