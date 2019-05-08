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

	@Override
	public List<Book> findSubBookList(Integer pagenum) {
		
		return bookDao.findSubBookList(pagenum);
	}

	@Override
	public Integer findSubBookCount() {
		
		return bookDao.findSubBookCount();
	}

	@Override
	public List<Book> findSubBookList1(Integer pagenum) {
		
		return bookDao.findSubBookList1(pagenum);
	}

	@Override
	public Integer findSubBookCount1() {
		
		return bookDao.findSubBookCount1();
	}

	@Override
	public List<Book> findSubBookList2(Integer pagenum) {
		
		return bookDao.findSubBookList2(pagenum);
	}

	@Override
	public Integer findSubBookCount2() {
		
		return bookDao.findSubBookCount2();
	}

	@Override
	public List<Book> findSubBookList3(Integer pagenum) {
		
		return bookDao.findSubBookList3(pagenum);
	}

	@Override
	public Integer findSubBookCount3() {
		
		return bookDao.findSubBookCount3();
	}

	@Override
	public List<Book> findSubBookList4(Integer pagenum) {
		
		return bookDao.findSubBookList4(pagenum);
	}

	@Override
	public Integer findSubBookCount4() {
		
		return bookDao.findSubBookCount4();
	}

	@Override
	public List<Book> findSubBookList5(Integer pagenum) {
		
		return bookDao.findSubBookList5(pagenum);
	}

	@Override
	public Integer findSubBookCount5() {
		
		return bookDao.findSubBookCount5();
	}

	@Override
	public List<Book> findSubBookList6(Integer pagenum) {
		
		return bookDao.findSubBookList6(pagenum);
	}

	@Override
	public Integer findSubBookCount6() {
		
		return bookDao.findSubBookCount6();
	}

	@Override
	public List<Book> findSubBookList7(Integer pagenum) {
		
		return bookDao.findSubBookList7(pagenum);
	}

	@Override
	public Integer findSubBookCount7() {
		
		return bookDao.findSubBookCount7();
	}

	@Override
	public List<Book> findSubBookList8(Integer pagenum) {
		
		return bookDao.findSubBookList8(pagenum);
	}

	@Override
	public Integer findSubBookCount8() {
		
		return bookDao.findSubBookCount8();
	}
	
	
	
}
