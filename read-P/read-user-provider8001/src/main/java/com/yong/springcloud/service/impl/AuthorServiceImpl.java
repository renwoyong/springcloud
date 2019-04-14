package com.yong.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yong.springcloud.dao.AuthorDao;
import com.yong.springcloud.entities.Author;
import com.yong.springcloud.service.AuthorService;
@Service
public class AuthorServiceImpl implements AuthorService{
	
	@Autowired
	private AuthorDao authorDao;

	@Override
	public Author findAuthor(Long authorid) {
		return authorDao.findAuthor(authorid);
	}

	@Override
	public List<Author> findAll() {
		return authorDao.findAll();
	}

	@Override
	public boolean addAuthor(Author author) {
		return authorDao.addAuthor(author);
	}

	@Override
	public boolean upAuthor(Author author) {
		return authorDao.upAuthor(author);
	}

	@Override
	public boolean delAuthor(Long authorid) {
		return authorDao.delAuthor(authorid);
	}
	
	

}
