package com.yong.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yong.springcloud.entities.Ticket;
import com.yong.springcloud.service.TicketService;

@RestController
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
	@RequestMapping(value="/ticket/findTicket",method=RequestMethod.GET)
	public Ticket findTicket(@RequestParam("bookid") Long bookid,@RequestParam("userid") Long userid)
	{
		return ticketService.findticket(bookid, userid);
	}
	
	@RequestMapping(value="/ticket/addweekticket",method=RequestMethod.POST)
	public boolean addweekticket(@RequestBody Ticket ticket)
	{
		return ticketService.addweekticket(ticket);
	}
	
	@RequestMapping(value="/ticket/addmonthticket",method=RequestMethod.POST)
	public boolean addmonthticket(@RequestBody Ticket ticket)
	{
		return ticketService.addmonthticket(ticket);
	}
	
	@RequestMapping(value="/ticket/delticket/{ticketid}",method=RequestMethod.POST)
	public boolean delticket(@PathVariable("ticketid") Long ticketid)
	{
		return ticketService.delticket(ticketid);
	}

}
