package com.yong.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yong.springcloud.dao.TicketDao;
import com.yong.springcloud.entities.Ticket;
import com.yong.springcloud.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{
	
	@Autowired
	private TicketDao ticketDao;

	@Override
	public Ticket findticket(Long bookid, Long userid) {
		
		return ticketDao.findticket(bookid, userid);
	}

	@Override
	public boolean addweekticket(Ticket ticket) {
		
		return ticketDao.addweekticket(ticket);
	}

	@Override
	public boolean addmonthticket(Ticket ticket) {
		
		return ticketDao.addmonthticket(ticket);
	}

	@Override
	public boolean delticket(Long ticketid) {
		
		return ticketDao.delticket(ticketid);
	}
}
