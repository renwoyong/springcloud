package com.yong.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Ticket implements Serializable{
	
	private Long ticketid;
	private Long bookid;
	private String bookname;
	private Long userid;
	private String username;
	private String weekticket;
	private String weekstart;
	private String weekend;
	private String monthticket;
	private String monthstart;
	private String monthend;
}
