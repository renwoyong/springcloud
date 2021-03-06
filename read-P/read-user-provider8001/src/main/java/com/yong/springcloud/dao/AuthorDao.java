package com.yong.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yong.springcloud.entities.Author;

@Mapper

public interface AuthorDao {
	
	  public Author findAuthor(Long authorid);
	 
	  public List<Author> findAll();
	  
	  public boolean addAuthor(Author author);
	  
	  public boolean upAuthor(Author author);

	  public boolean delAuthor(Long authorid);
	  
	  public Author finddots(String bookauthor);
	  
	  public boolean updots(Author author);
	  
	  public Author findAuthorAsName(String authorname);

}
