package com.yong.springcloud.service;

import com.yong.springcloud.entities.Ticket;

public interface TicketService {

	public Ticket findticket(Long bookid,Long userid);
	
	public boolean addweekticket(Ticket ticket);
	
	public boolean addmonthticket(Ticket ticket);
	
	public boolean delticket(Long ticketid);
}
