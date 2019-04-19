package com.yong.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yong.springcloud.entities.Chapter;
import com.yong.springcloud.service.ChapterService;

@RestController
public class ChapterController {

	@Autowired
	private ChapterService chapterService;
	
	@RequestMapping(value="/chapter/findChapter/{chapterid}",method=RequestMethod.GET)
	public Chapter findChapter(@PathVariable("chapterid") long chapterid)
	{
		return chapterService.findChapter(chapterid);
	}
	
	@RequestMapping(value="/chapter/findChapterlist/{bookid}",method=RequestMethod.GET)
	public List<Chapter> findChapterlist(@PathVariable("bookid") long bookid)
	{
		return chapterService.findChapterlist(bookid);
	}
	
	@RequestMapping(value="/chapter/addChapter",method=RequestMethod.POST)
	public boolean addChapter(@RequestBody Chapter chapter)
	{
		return chapterService.addChapter(chapter);
	}
	
	@RequestMapping(value="/chapter/upChapter",method=RequestMethod.POST)
	public boolean upChapter(@RequestBody Chapter chapter)
	{
		return chapterService.upChapter(chapter);
	}
	
	@RequestMapping(value="/chapter/delChapter/{chapterid}",method=RequestMethod.POST)
	public boolean delChapter(@PathVariable Long chapterid)
	{
		return chapterService.delChapter(chapterid);
	}
}
