package com.yong.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yong.springcloud.dao.NewBookDao;
import com.yong.springcloud.entities.Book;
import com.yong.springcloud.service.NewBookService;

@Service
public class NewBookServiceImpl implements NewBookService{

	@Autowired
	private NewBookDao newBookDao;

	@Override
	public List<Book> findNewBooklist() {
		
		return newBookDao.findNewBooklist();
	}

	@Override
	public boolean upPlan(Long bookid) {
		
		return newBookDao.upPlan(bookid);
	}

	@Override
	public boolean unupPlan(Long bookid) {
		
		return newBookDao.unupPlan(bookid);
	}

	@Override
	public List<Book> findShowNewBooklist() {
		return newBookDao.findShowNewBooklist();
	}
	
	
}
