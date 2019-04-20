package com.yong.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yong.springcloud.entities.Comment;

@FeignClient(value = "read-book-provider8002")
public interface CommentClientService {

	@RequestMapping(value="/comment/findCommentlist",method=RequestMethod.GET)
	public List<Comment> findCommentlist();
	
	@RequestMapping(value="/comment/findComments/{bookname}",method=RequestMethod.GET)
	public List<Comment> findComments(@PathVariable("bookname") String bookname);
	
	@RequestMapping(value="/comment/delComment/{commentid}",method=RequestMethod.POST)
	public boolean delComment(@PathVariable("commentid") long commentid);
}
