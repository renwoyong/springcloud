package com.yong.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yong.springcloud.entities.Book;
@Mapper
public interface BookDao {

	//图书列表未分页
	public List<Book> findBooklist();
	//查找一本书
	public Book findBook(Long bookid);
	//添加书籍
	public boolean addBook(Book book);
	//修改书籍
	public boolean upBook(Book book);
	//删除书籍
	public boolean delBook(Long bookid);
	//书籍列表分页
	public List<Book> findSubBookList(Integer pagenum);
	//书籍列表总书籍数
	public Integer findSubBookCount();
	//穿越小说
	public List<Book> findSubBookList1(Integer pagenum);
	
	public Integer findSubBookCount1();
	//历史架空
	public List<Book> findSubBookList2(Integer pagenum);
	
	public Integer findSubBookCount2();
	//总裁豪门
	public List<Book> findSubBookList3(Integer pagenum);
	
	public Integer findSubBookCount3();
	//言情小说
	public List<Book> findSubBookList4(Integer pagenum);
	
	public Integer findSubBookCount4();
	//玄幻魔法
	public List<Book> findSubBookList5(Integer pagenum);
	
	public Integer findSubBookCount5();
	//都市异能
	public List<Book> findSubBookList6(Integer pagenum);
	
	public Integer findSubBookCount6();
	//历史军事
	public List<Book> findSubBookList7(Integer pagenum);
	
	public Integer findSubBookCount7();
	//网游小说
	public List<Book> findSubBookList8(Integer pagenum);
	
	public Integer findSubBookCount8();
	//主页查询
	public  List<Book> findsomeBooks(String thekey,Integer pagenum);
	
	public Integer findsomeBooksCount(String thekey);
	
	public List<Book> findweekBookList();
	
	public List<Book> findmonthBookList();
	
	public List<Book> findyearBookList();
	
}
