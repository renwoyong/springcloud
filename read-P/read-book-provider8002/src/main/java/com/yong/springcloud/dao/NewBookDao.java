package com.yong.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yong.springcloud.entities.Book;
@Mapper
public interface NewBookDao {
	
	public List<Book> findNewBooklist();
	
	public boolean upPlan(Long bookid);
	
	public boolean unupPlan(Long bookid);

}
