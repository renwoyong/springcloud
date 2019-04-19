package com.yong.springcloud.entities;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Book implements Serializable{
	
	private Long bookid;
	private String bookname;
	private String bookauthor;
	private String bookintroduction;
	private String booktype;
	private int bookcount;
	private String state;
	private Date ctime;
	private int weeklyticket;
	private int monthlyticket;
	private int ticket;
	private String plan;
}
