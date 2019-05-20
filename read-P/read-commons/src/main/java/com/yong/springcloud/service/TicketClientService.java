package com.yong.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yong.springcloud.entities.Ticket;

@FeignClient(value = "read-book-provider8002")
public interface TicketClientService {
	
	@RequestMapping(value="/ticket/findTicket",method=RequestMethod.GET)
	public Ticket findTicket(@RequestParam("bookid") Long bookid,@RequestParam("userid") Long userid);
	
	@RequestMapping(value="/ticket/addweekticket",method=RequestMethod.POST)
	public boolean addweekticket(@RequestBody Ticket ticket);
	
	@RequestMapping(value="/ticket/addmonthticket",method=RequestMethod.POST)
	public boolean addmonthticket(@RequestBody Ticket ticket);
	
	@RequestMapping(value="/ticket/delticket/{ticketid}",method=RequestMethod.POST)
	public boolean delticket(@PathVariable("ticketid") Long ticketid);

}
