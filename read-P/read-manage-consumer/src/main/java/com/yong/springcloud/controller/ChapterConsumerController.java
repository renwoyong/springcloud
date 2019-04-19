package com.yong.springcloud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yong.springcloud.entities.Chapter;
import com.yong.springcloud.service.ChapterClientService;

@Controller
public class ChapterConsumerController {

	@Autowired
	private ChapterClientService chapterClientService;
	
	@RequestMapping(value="/consumer/chapter/findChapterlist")
	public String List(Model model,Long bookid)
	{
		List <Chapter> chapters=chapterClientService.findChapterlist(bookid);
		model.addAttribute("chapters", chapters);
		return "chapter/chapterlist";
	}
	
	@RequestMapping(value="/consumer/chapter/toadd")
	public String toadd()
	{
		return "chapter/chapterAdd";
	}
	
	@RequestMapping(value="/consumer/chapter/add")
	public String add(Chapter chapter)
	{
		chapterClientService.addChapter(chapter);
		String url="redirect:/consumer/chapter/findChapterlist?bookid="+chapter.getBookid();
		return url;
	}
	
	@RequestMapping(value="/consumer/chapter/toedit")
	public String toedit(Model model,Long chapterid)
	{
		Chapter chapter = chapterClientService.findChapter(chapterid);
		model.addAttribute("chapter", chapter);
		return "chapter/chapterEdit";
	}
	
	@RequestMapping(value="/consumer/chapter/edit")
	public String edit(Chapter chapter)
	{
		chapterClientService.upChapter(chapter);
		String url="redirect:/consumer/chapter/findChapterlist?bookid="+chapter.getBookid();
		return url;
	}
	
	@RequestMapping(value="/consumer/chapter/delete")
	public String delete(Long chapterid)
	{
		Chapter chapter = chapterClientService.findChapter(chapterid);
		Long id = chapter.getBookid();
		chapterClientService.delChapter(chapterid);
		String url="redirect:/consumer/chapter/findChapterlist?bookid="+id;
		return url;
	}
}
