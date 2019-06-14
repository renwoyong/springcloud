package com.yong.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.yong.springcloud.entities.Author;
import com.yong.springcloud.entities.Book;
import com.yong.springcloud.entities.Chapter;
import com.yong.springcloud.entities.ReadUser;
import com.yong.springcloud.entities.Ticket;
import com.yong.springcloud.service.AuthorClientService;
import com.yong.springcloud.service.BookClientService;
import com.yong.springcloud.service.ChapterClientService;
import com.yong.springcloud.service.NewBookClientService;
import com.yong.springcloud.service.ReadUserClientService;
import com.yong.springcloud.service.TicketClientService;


@Controller
public class ReadBookConsumerController {

	@Autowired
	private BookClientService bookClientService;
	@Autowired
	private ChapterClientService chapterClientService;
	@Autowired
	private NewBookClientService newBookClientService;
	@Autowired
	private ReadUserClientService readUserClientService;
	@Autowired
	private AuthorClientService authorClientService;
	@Autowired
	private TicketClientService ticketClientService;
	
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
		//新书推广
		List<Book> newbooks = newBookClientService.findShowNewBooklist();
		model.addAttribute("newbooks", newbooks);
		
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
	public String findbookshow(Model model, long bookid,HttpServletRequest request)
	{
		
		Book book = bookClientService.findBook(bookid);
		List<Chapter> chapters = chapterClientService.findChapterlist(bookid);
		Chapter chapter1=chapters.get(0);
		
		ReadUser readUser = (ReadUser) request.getSession().getAttribute("findreadUser");

		if(readUser!=null) {
			request.getSession().removeAttribute("ticket");
			Ticket ticket = ticketClientService.findTicket(bookid, readUser.getUserid());
			if(ticket!=null)
			{
				Date currentTime = new Date();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				if(ticket.getWeekticket().equals("1"))
				{
					Date datestart = null;
					Date dateend=null;
					try {
						datestart=format.parse(ticket.getWeekstart());
						dateend=format.parse(ticket.getWeekend());
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(currentTime.getTime()>=datestart.getTime()&&currentTime.getTime()<=dateend.getTime())
					{
						request.getSession().setAttribute("ticket",ticket);
					}
					else {
						ticketClientService.delticket(ticket.getTicketid());
					}
				}
				
				if(ticket.getMonthticket().equals("1"))
				{
					Date datestart = null;
					Date dateend=null;
					try {
						datestart=format.parse(ticket.getMonthstart());
						dateend=format.parse(ticket.getMonthend());
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(currentTime.getTime()>=datestart.getTime()&&currentTime.getTime()<=dateend.getTime())
					{
						request.getSession().setAttribute("ticket",ticket);
					}
					else {
						ticketClientService.delticket(ticket.getTicketid());
					}
				}
			}
			if(readUser.getVipset().equals("1"))
			{
				model.addAttribute("vip", readUser.getVipset());
			}
		}
		
		model.addAttribute("chapter1", chapter1);
		model.addAttribute("chapters", chapters);
		model.addAttribute("book", book);
		return "bookshow";
	}
	
	@RequestMapping(value="/consumer/chapter/findChapter")
	public String findchaptershow(Model model,long chapterid,HttpServletRequest request)
	{
		Chapter chapter = chapterClientService.findChapter(chapterid);
		if(chapter.getFree().equals("0"))
		{
			Chapter chapterpre=null;
			Chapter chapternext=null;
			int mark=0;
			
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
						if(chapters.size()>1) {
							chapterpre=chapters.get(i);
							chapternext=chapters.get(i+1);
							break;
						}
						else {
							chapterpre=chapters.get(i);
							chapternext=chapters.get(i);
							break;
						}
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
			if(request.getSession().getAttribute("findreadUser")!=null)
			{
				book.setTicket(book.getTicket()+1);
				bookClientService.upBook(book);
				
				ReadUser findshowUser = (ReadUser) request.getSession().getAttribute("findreadUser");
				System.out.println("name:"+findshowUser.getUsername());
				System.out.println("count:"+findshowUser.getReadcount());
				findshowUser.setReadcount(findshowUser.getReadcount()+1);
				readUserClientService.upuser(findshowUser);
			}
			
			return"chaptershow";
		}
		else {
			if(request.getSession().getAttribute("findreadUser")!=null) {
				
				ReadUser findshowUser = (ReadUser) request.getSession().getAttribute("findreadUser");
				
				Ticket ticket=ticketClientService.findTicket(chapter.getBookid(),findshowUser.getUserid());
				
				if(ticket!=null)
				{
					Chapter chapterpre=null;
					Chapter chapternext=null;
					int mark=0;
					
					List<Chapter> chapters=chapterClientService.findChapterlist(chapter.getBookid());
					Book book = bookClientService.findBook(chapter.getBookid());
					
					for(int i=0;i<chapters.size();i++)
					{
						if(chapters.get(i).equals(chapter))
						{
							mark=i+1;
							if(i==0)
							{
								if(chapters.size()>1) {
									chapterpre=chapters.get(i);
									chapternext=chapters.get(i+1);
									break;
								}
								else {
									chapterpre=chapters.get(i);
									chapternext=chapters.get(i);
									break;
								}
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
					
					model.addAttribute("bookname", book.getBookname());
					model.addAttribute("mark", mark);
					model.addAttribute("chapterpre", chapterpre);
					model.addAttribute("chapternext", chapternext);
					model.addAttribute("chapter", chapter);
					
					book.setTicket(book.getTicket()+1);
					bookClientService.upBook(book);
					
					findshowUser.setReadcount(findshowUser.getReadcount()+1);
					readUserClientService.upuser(findshowUser);
					
					return"chaptershow";
				}
				else {
					if(findshowUser.getVipset().equals("1"))
					{
						//vip
						String vipyes ="vip";
						model.addAttribute("vipyes", vipyes);
						model.addAttribute("chapterid", chapterid);
						model.addAttribute("bookid", chapter.getBookid());
						return "paysheet";
					}
					else {
						//novip
						String vipno = "novip";
						model.addAttribute("vipno", vipno);
						model.addAttribute("chapterid", chapterid);
						model.addAttribute("bookid", chapter.getBookid());
						return "paysheet";
					}
				}
			}
			else {
				return "login";
			}
		}
	}
	
	@RequestMapping(value="/consumer/chapter/findvipChapter")
	public String findvipChapter(Model model,Long chapterid,HttpServletRequest request)
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
					if(chapters.size()>1) {
						chapterpre=chapters.get(i);
						chapternext=chapters.get(i+1);
						break;
					}
					else {
						chapterpre=chapters.get(i);
						chapternext=chapters.get(i);
						break;
					}
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
		if(request.getSession().getAttribute("findreadUser")!=null)
		{
			book.setTicket(book.getTicket()+1);
			bookClientService.upBook(book);
			
			ReadUser findshowUser = (ReadUser) request.getSession().getAttribute("findreadUser");
			ReadUser readUser = readUserClientService.get(findshowUser.getUserid());
			System.out.println("name:"+readUser.getUsername());
			System.out.println("count:"+readUser.getReadcount());
			readUser.setReadcount(readUser.getReadcount()+1);
			readUserClientService.upuser(readUser);
			
			readpay(readUser.getUserid(), 4);
		}
		
		return"chaptershow";
	}
	
	@RequestMapping(value="/consumer/chapter/findnovipChapter")
	public String findnovipChapter(Model model,Long chapterid,HttpServletRequest request)
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
					if(chapters.size()>1) {
						chapterpre=chapters.get(i);
						chapternext=chapters.get(i+1);
						break;
					}
					else {
						chapterpre=chapters.get(i);
						chapternext=chapters.get(i);
						break;
					}
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
		if(request.getSession().getAttribute("findreadUser")!=null)
		{
			book.setTicket(book.getTicket()+1);
			bookClientService.upBook(book);
			
			ReadUser findshowUser = (ReadUser) request.getSession().getAttribute("findreadUser");
			ReadUser readUser = readUserClientService.get(findshowUser.getUserid());
			System.out.println("name:"+readUser.getUsername());
			System.out.println("count:"+readUser.getReadcount());
			readUser.setReadcount(readUser.getReadcount()+1);
			readUserClientService.upuser(readUser);
			
			readpay(readUser.getUserid(), 5);
		}
		
		return"chaptershow";
	}
	
	@RequestMapping(value="/consumer/book/findsomeBooks")
	public String FindSomeBooks(Model model, String thekey,@RequestParam(required = false,defaultValue = "1")Integer pagenum)
	{
		System.out.println("thekey="+thekey);
		Integer pagesize=10;
		Integer pagesum=bookClientService.findsomeBooksCount(thekey);
		System.out.println("pagesum="+pagesum);
		Integer pagecount=(pagesum-1)/pagesize+1;
		List<Book> books = bookClientService.findsomeBooks(thekey,(pagenum - 1) * 10);
		model.addAttribute("books", books);
		model.addAttribute("pagenum", pagenum);
		model.addAttribute("pagecount", pagecount);
		return "firstshow";
	}
	
	@RequestMapping(value="/show/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(value="/consumer/readUser/findUser")
	public String findUser(Model model,String username,String password,HttpServletRequest request)
	{
		System.out.println("username="+username);
		System.out.println("password="+password);
		ReadUser findreadUser= readUserClientService.findUser(username);
		if(findreadUser==null)
		{
			model.addAttribute("msg", "错误：用户名不存在！");
			return "login";
		}
		else {
			if(password.equals(findreadUser.getUserpwd()))
			{
				request.getSession().setAttribute("findreadUser", findreadUser);
				if(findreadUser.getVipset().equals("1"))
				{
					Date currentTime = new Date();
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					
					Date datestart = null;
					Date dateend=null;
					try {
						datestart = format.parse(findreadUser.getStarttime());
						dateend=format.parse(findreadUser.getEndtime());
					} catch (ParseException e) {
						e.printStackTrace();
					}
					
					if((currentTime.getTime() >= datestart.getTime() && currentTime.getTime() <= dateend.getTime())==false)
					{
						readUserClientService.cancalvip(findreadUser.getUserid());
						ReadUser findreadUser1= readUserClientService.get(findreadUser.getUserid());
						request.getSession().setAttribute("findreadUser", findreadUser1);
					}
				}
				
				return "redirect:/consumer/book/findSubBook";
			}
			else {
				model.addAttribute("msg", "错误：密码错误！");
				return "login";
			}
		}
	}
	@RequestMapping(value="/show/signup")
	public String signup()
	{
		return "signup";
	}
	
	@RequestMapping(value="/consumer/readUser/addUser")
	public String signupUser(Model model,String username,String password,String useremail,String usersex)
	{
		ReadUser user= new ReadUser();
		
		System.out.println("username="+username);
		System.out.println("password="+password);
		ReadUser findReadUser = readUserClientService.findUser(username);
		if(findReadUser!=null)
		{
			model.addAttribute("msg", "错误：用户名已存在！");
			return "signup";
		}
		
		user.setUsername(username);
		user.setUserpwd(password);
		user.setUseremail(useremail);
		user.setUsersex(usersex);
		System.out.println("user"+user);
		readUserClientService.add(user);
		model.addAttribute("msg", "成功：恭喜用户注册成功！");
		return "signup";
	}
	
	@RequestMapping(value="/show/logout")
	public String logout(HttpServletRequest request)
	{
		request.getSession().removeAttribute("findreadUser");
		return "redirect:/consumer/book/findSubBook";
	}
	
	@RequestMapping(value="/show/readuserinfo")
	public String readuserinfo(Model model, HttpServletRequest request)
	{
		ReadUser readuser= new ReadUser();
		if(request.getSession().getAttribute("findreadUser")!=null)
		{
			ReadUser findshowreadUser = (ReadUser) request.getSession().getAttribute("findreadUser");
			readuser= readUserClientService.get(findshowreadUser.getUserid());
		}
		else {
			model.addAttribute("msg", "用户未登陆，请先登陆！");
		}
		model.addAttribute("readuser", readuser);
		return "readuserinfo";
	}
	
	@RequestMapping(value="/show/readuserinfotoedit")
	public String toeditreaduserinfo(Model model,Long userid)
	{
		ReadUser readUser = readUserClientService.get(userid);
		model.addAttribute("readUser", readUser);
		return "readuserinfoedit";
	}
	
	@RequestMapping(value="/show/readuserinfoedit")
	public String editreaduserinfo(Model model,ReadUser readUser,HttpServletRequest request)
	{		
		ReadUser readUser2 = readUserClientService.findUser(readUser.getUsername());
		if(readUser2!=null&&(readUser2.getUserid().equals(readUser.getUserid())==false))
		{
			return "redirect:/show/readuserinfotoedit?userid="+readUser.getUserid()+"&error=1";
		}
		else {
			readUserClientService.upuser(readUser);
			ReadUser readUser3 = readUserClientService.get(readUser.getUserid());
			request.getSession().setAttribute("findreadUser", readUser3);
			return "redirect:/show/readuserinfo";
		}
	}
	
	@RequestMapping(value="/show/dots")
	public String dots(Long bookid)
	{
		Book book = bookClientService.findBook(bookid);	
		Author author = authorClientService.finddots(book.getBookauthor());
		author.setAuthordots(author.getAuthordots()+1);
		System.out.println("dots="+author.getAuthordots());
		boolean flg=authorClientService.updots(author);
		System.out.println("flg="+flg);
		return "redirect:/consumer/findbookshow/?bookid="+bookid;
	}
	
	@RequestMapping(value="/show/rankinglist")
	public String rankinglist(Model model)
	{
		List<Book> weekbooks = bookClientService.findweekBookList();
		List<Book> monthbooks = bookClientService.findmonthBookList();
		List<Book> yearbooks = bookClientService.findyearBookList();
		
		model.addAttribute("weekbooks", weekbooks);
		model.addAttribute("monthbooks", monthbooks);
		model.addAttribute("yearbooks", yearbooks);
		return "rankinglist";
	}
	
	@RequestMapping(value="/show/download")
	public String download(long bookid,HttpServletRequest request)
	{
		ReadUser readUser = (ReadUser) request.getSession().getAttribute("findreadUser");
		if(readUser!=null&&readUser.getVipset().equals("1"))
		{
			String bookname = bookClientService.findBook(bookid).getBookname();
			List <Chapter> chapters = chapterClientService.findChapterlist(bookid);
			String pathname = "D:\\"+bookname+".txt";
			File writename = new File(pathname);
			try {
				writename.createNewFile();
				BufferedWriter out = new BufferedWriter(new FileWriter(writename));
				for(int i = 0 ; i < chapters.size() ; i++)
				{
					int j=i+1;
					out.write("第"+j+"章"+chapters.get(i).getChaptername());
					out.write("\r\n");
					out.write(chapters.get(i).getChaptercontent());
					out.write("\r\n");
				}
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return"redirect:/consumer/findbookshow?bookid="+bookid+"&flag=1";
		}
		else {
			return"redirect:/consumer/findbookshow?bookid="+bookid+"&error=1";
		}
	}
	
	@RequestMapping(value="/show/vippay")
	public String vippay(Model model,Long userid)
	{
		String vipflag = "vip";
		model.addAttribute("userid", userid);
		model.addAttribute("vipflag", vipflag);
		return "paysheet";
	}
	
	@RequestMapping(value="/show/setvip")
	public String setvip(Long userid,HttpServletRequest request)
	{
		readpay(userid, 1);
		readUserClientService.setvip(userid);
		ReadUser readUser = readUserClientService.get(userid);
		if(readUser!=null)
		{
			request.getSession().setAttribute("findreadUser", readUser);
		}
		return "redirect:/show/readuserinfo";
	}
	
	@RequestMapping(value="/show/weekticket")
	public String weekticket(Long bookid,String bookname,HttpServletRequest request)
	{
		
		ReadUser readUser = (ReadUser) request.getSession().getAttribute("findreadUser");
		if(readUser!=null){
			
			readpay(readUser.getUserid(), 2);
			
			Ticket ticket = new Ticket();
			ticket.setBookid(bookid);
			ticket.setBookname(bookname);
			ticket.setUserid(readUser.getUserid());
			ticket.setUsername(readUser.getUsername());
			ticketClientService.addweekticket(ticket);
		}
		return"redirect:/consumer/findbookshow?bookid="+bookid;
	}
	
	@RequestMapping(value="/show/monthticket")
	public String monthticket(Long bookid,String bookname,HttpServletRequest request)
	{
		ReadUser readUser = (ReadUser) request.getSession().getAttribute("findreadUser");
		if(readUser!=null){
			
			readpay(readUser.getUserid(), 3);
			
			Ticket ticket = new Ticket();
			ticket.setBookid(bookid);
			ticket.setBookname(bookname);
			ticket.setUserid(readUser.getUserid());
			ticket.setUsername(readUser.getUsername());
			ticketClientService.addmonthticket(ticket);
		}
		return"redirect:/consumer/findbookshow?bookid="+bookid;
	}
	
	@RequestMapping(value="/show/weekticketpay")
	public String weekticketpay(Model model,Long bookid,String bookname)
	{
		String weekflag="week";
		model.addAttribute("bookid", bookid);
		model.addAttribute("bookname", bookname);
		model.addAttribute("weekflag", weekflag);
		return "paysheet";
	}
	
	@RequestMapping(value="/show/monthticketpay")
	public String monthticketpay(Model model,Long bookid,String bookname)
	{
		String monthflag="month";
		model.addAttribute("bookid", bookid);
		model.addAttribute("bookname", bookname);
		model.addAttribute("monthflag", monthflag);
		return"paysheet";
	}
	
	public void readpay(Long userid,int type)
	{
		ReadUser readUser = new ReadUser();
		readUser = readUserClientService.get(userid);
		if(readUser!=null)
		{
			switch (type) {
			case 1://vip
				readUser.setReadpay(readUser.getReadpay()+20);
				readUserClientService.upuser(readUser);
				break;
			case 2://weekticket
				readUser.setReadpay(readUser.getReadpay()+5);
				readUserClientService.upuser(readUser);
				break;
			case 3://monthticket
				readUser.setReadpay(readUser.getReadpay()+10);
				readUserClientService.upuser(readUser);
				break;
			case 4://vipchapter
				readUser.setReadpay(readUser.getReadpay()+1);
				readUserClientService.upuser(readUser);
				break;
			case 5://nomarlchapter
				readUser.setReadpay(readUser.getReadpay()+2);
				readUserClientService.upuser(readUser);
				break;
			}
		}
	}
}
