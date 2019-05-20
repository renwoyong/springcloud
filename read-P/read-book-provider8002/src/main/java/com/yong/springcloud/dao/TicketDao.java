package com.yong.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yong.springcloud.entities.Ticket;

@Mapper
public interface TicketDao {
	
	public Ticket findticket(Long bookid,Long userid);
	
	public boolean addweekticket(Ticket ticket);
	
	public boolean addmonthticket(Ticket ticket);
	
	public boolean delticket(Long ticketid);

}
