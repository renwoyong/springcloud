package com.yong.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yong.springcloud.entities.Chapter;

@FeignClient(value = "read-book-provider8002")
public interface ChapterClientService {

	
	@RequestMapping(value="/chapter/findChapter/{chapterid}",method=RequestMethod.GET)
	public Chapter findChapter(@PathVariable("chapterid") long chapterid);
	
	@RequestMapping(value="/chapter/findChapterlist/{bookid}",method=RequestMethod.GET)
	public List<Chapter> findChapterlist(@PathVariable("bookid") long bookid);
	
	@RequestMapping(value="/chapter/addChapter",method=RequestMethod.POST)
	public boolean addChapter(@RequestBody Chapter chapter);
	
	@RequestMapping(value="/chapter/upChapter",method=RequestMethod.POST)
	public boolean upChapter(@RequestBody Chapter chapter);
	
	@RequestMapping(value="/chapter/delChapter/{chapterid}",method=RequestMethod.POST)
	public boolean delChapter(@PathVariable("chapterid") long chapterid);
	
}
