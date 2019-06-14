package com.yong.springcloud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yong.springcloud.entities.Book;
import com.yong.springcloud.entities.Chapter;
import com.yong.springcloud.service.BookClientService;
import com.yong.springcloud.service.ChapterClientService;

@Controller
public class ChapterConsumerController {

	@Autowired
	private ChapterClientService chapterClientService;
	@Autowired
	private BookClientService bookClientService;
	
	@RequestMapping(value="/consumer/chapter/findChapterlist")
	public String List(Model model,Long bookid)
	{
		int sum = 0;
		List <Chapter> chapters=chapterClientService.findChapterlist(bookid);
		Book book = bookClientService.findBook(bookid);
		for(int i=0;i<chapters.size();i++)
		{
			sum=sum+chapters.get(i).getChaptercount();
		}
		book.setBookcount(sum);
		bookClientService.upBook(book);
		model.addAttribute("chapters", chapters);
		model.addAttribute("bookid", bookid);
		return "chapter/chapterlist";
	}
	
	@RequestMapping(value="/consumer/chapter/toadd")
	public String toadd(Model model, Long bookid)
	{
		model.addAttribute("bookid", bookid);
		return "chapter/chapterAdd";
	}
	
	@RequestMapping(value="/consumer/chapter/add")
	public String add(Chapter chapter,String chaptercontent)
	{
		chapter.setChaptercount(chaptercontent.length());
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
		chapter.setChaptercount(chapter.getChaptercontent().length());
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
