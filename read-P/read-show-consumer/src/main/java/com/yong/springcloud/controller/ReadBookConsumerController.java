package com.yong.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yong.springcloud.entities.Book;
import com.yong.springcloud.entities.Chapter;
import com.yong.springcloud.service.BookClientService;
import com.yong.springcloud.service.ChapterClientService;

@Controller
public class ReadBookConsumerController {

	@Autowired
	private BookClientService bookClientService;
	@Autowired
	private ChapterClientService chapterClientService;
	
	@RequestMapping(value="/consumer/book/findSubBook")
	//public String List(Model model,@RequestParam(required = false,defaultValue = "1")int currentPage)
	public String List(Model model,@RequestParam(required = false,defaultValue = "1")Integer pagenum)
	{
		Integer pagesize=10;
		Integer pagesum=bookClientService.findSubBookCount();
		Integer pagecount=(pagesum-1)/pagesize+1;
		List<Book> books =bookClientService.findSubBookList((pagenum - 1) * 10);
		model.addAttribute("books", books);
		model.addAttribute("pagenum", pagenum);
		model.addAttribute("pagecount", pagecount);
		return "firstshow";
	}
	
	@RequestMapping(value="/consumer/book/findSubBook1")
	public String List1(Model model,@RequestParam(required = false,defaultValue = "1")Integer pagenum)
	{
		Integer pagesize=10;
		Integer pagesum=bookClientService.findSubBookCount1();
		Integer pagecount=(pagesum-1)/pagesize+1;
		List<Book> books =bookClientService.findSubBookList1((pagenum - 1) * 10);
		model.addAttribute("books", books);
		model.addAttribute("pagenum", pagenum);
		model.addAttribute("pagecount", pagecount);
		return "firstshow";
	}
	
	@RequestMapping(value="/consumer/book/findSubBook2")
	public String List2(Model model,@RequestParam(required = false,defaultValue = "1")Integer pagenum)
	{
		Integer pagesize=10;
		Integer pagesum=bookClientService.findSubBookCount2();
		Integer pagecount=(pagesum-1)/pagesize+1;
		List<Book> books =bookClientService.findSubBookList2((pagenum - 1) * 10);
		model.addAttribute("books", books);
		model.addAttribute("pagenum", pagenum);
		model.addAttribute("pagecount", pagecount);
		return "firstshow";
	}
	
	@RequestMapping(value="/consumer/book/findSubBook3")
	public String List3(Model model,@RequestParam(required = false,defaultValue = "1")Integer pagenum)
	{
		Integer pagesize=10;
		Integer pagesum=bookClientService.findSubBookCount3();
		Integer pagecount=(pagesum-1)/pagesize+1;
		List<Book> books =bookClientService.findSubBookList3((pagenum - 1) * 10);
		model.addAttribute("books", books);
		model.addAttribute("pagenum", pagenum);
		model.addAttribute("pagecount", pagecount);
		return "firstshow";
	}
	
	@RequestMapping(value="/consumer/book/findSubBook4")
	public String List4(Model model,@RequestParam(required = false,defaultValue = "1")Integer pagenum)
	{
		Integer pagesize=10;
		Integer pagesum=bookClientService.findSubBookCount4();
		Integer pagecount=(pagesum-1)/pagesize+1;
		List<Book> books =bookClientService.findSubBookList4((pagenum - 1) * 10);
		model.addAttribute("books", books);
		model.addAttribute("pagenum", pagenum);
		model.addAttribute("pagecount", pagecount);
		return "firstshow";
	}
	
	@RequestMapping(value="/consumer/book/findSubBook5")
	public String List5(Model model,@RequestParam(required = false,defaultValue = "1")Integer pagenum)
	{
		Integer pagesize=10;
		Integer pagesum=bookClientService.findSubBookCount5();
		Integer pagecount=(pagesum-1)/pagesize+1;
		List<Book> books =bookClientService.findSubBookList5((pagenum - 1) * 10);
		model.addAttribute("books", books);
		model.addAttribute("pagenum", pagenum);
		model.addAttribute("pagecount", pagecount);
		return "firstshow";
	}
	
	@RequestMapping(value="/consumer/book/findSubBook6")
	public String List6(Model model,@RequestParam(required = false,defaultValue = "1")Integer pagenum)
	{
		Integer pagesize=10;
		Integer pagesum=bookClientService.findSubBookCount6();
		Integer pagecount=(pagesum-1)/pagesize+1;
		List<Book> books =bookClientService.findSubBookList6((pagenum - 1) * 10);
		model.addAttribute("books", books);
		model.addAttribute("pagenum", pagenum);
		model.addAttribute("pagecount", pagecount);
		return "firstshow";
	}
	
	@RequestMapping(value="/consumer/book/findSubBook7")
	public String List7(Model model,@RequestParam(required = false,defaultValue = "1")Integer pagenum)
	{
		Integer pagesize=10;
		Integer pagesum=bookClientService.findSubBookCount7();
		Integer pagecount=(pagesum-1)/pagesize+1;
		List<Book> books =bookClientService.findSubBookList7((pagenum - 1) * 10);
		model.addAttribute("books", books);
		model.addAttribute("pagenum", pagenum);
		model.addAttribute("pagecount", pagecount);
		return "firstshow";
	}
	
	@RequestMapping(value="/consumer/book/findSubBook8")
	public String List8(Model model,@RequestParam(required = false,defaultValue = "1")Integer pagenum)
	{
		Integer pagesize=10;
		Integer pagesum=bookClientService.findSubBookCount8();
		Integer pagecount=(pagesum-1)/pagesize+1;
		List<Book> books =bookClientService.findSubBookList8((pagenum - 1) * 10);
		model.addAttribute("books", books);
		model.addAttribute("pagenum", pagenum);
		model.addAttribute("pagecount", pagecount);
		return "firstshow";
	}
	
	@RequestMapping(value="/consumer/findbookshow")
	public String findbookshow(Model model, long bookid)
	{
		
		Book book = bookClientService.findBook(bookid);
		List<Chapter> chapters = chapterClientService.findChapterlist(bookid);
		model.addAttribute("chapters", chapters);
		model.addAttribute("book", book);
		return "bookshow";
	}
	
	@RequestMapping(value="/consumer/chapter/findChapter")
	public String findchaptershow(Model model,long chapterid)
	{
		Chapter chapterpre=null;
		Chapter chapternext=null;
		int mark=0;
		Chapter chapter = chapterClientService.findChapter(chapterid);
		List<Chapter> chapters=chapterClientService.findChapterlist(chapter.getBookid());
		Book book = bookClientService.findBook(chapter.getBookid());
		/*
		 * Map<Integer,Long> chapteridmap = new HashMap<Integer,Long>(); for(int i
		 * =0;i<chapters.size();i++) { chapteridmap.put(i,
		 * chapters.get(i).getChapterid()); }
		 */
		for(int i=0;i<chapters.size();i++)
		{
			if(chapters.get(i).equals(chapter))
			{
				mark=i+1;
				if(i==0)
				{
					chapterpre=chapters.get(i);
					chapternext=chapters.get(i+1);
					break;
				}
				else if(i==(chapters.size()-1))
				{
					chapterpre=chapters.get(i-1);
					chapternext=chapters.get(i);
					break;
				}
				else 
				{
					chapterpre=chapters.get(i-1);
					chapternext=chapters.get(i+1);
					break;
				}
			}
		}
		System.out.println("preid:"+chapterpre.getChapterid());
		System.out.println("nowid:"+chapter.getChapterid());
		System.out.println("nextid:"+chapternext.getChapterid());
		model.addAttribute("bookname", book.getBookname());
		model.addAttribute("mark", mark);
		model.addAttribute("chapterpre", chapterpre);
		model.addAttribute("chapternext", chapternext);
		model.addAttribute("chapter", chapter);
		return"chaptershow";
	}
	
	@RequestMapping(value="/home")
	public String jj()
	{
		return "jj";
	}
	@RequestMapping(value="/ios")
	public String jj1()
	{
		return "bookshow";
	}
	
}
