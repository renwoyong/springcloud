package com.yong.springcloud.service;

import java.util.List;

import com.yong.springcloud.entities.Author;

public interface AuthorService {

	public Author findAuthor(Long authorid);
	 
	  public List<Author> findAll();
	  
	  public boolean addAuthor(Author author);
	  
	  public boolean upAuthor(Author author);

	  public boolean delAuthor(Long authorid);
}
