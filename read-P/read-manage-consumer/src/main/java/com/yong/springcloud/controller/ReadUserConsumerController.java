package com.yong.springcloud.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yong.springcloud.entities.ReadUser;
import com.yong.springcloud.service.ReadUserClientService;


@Controller
public class ReadUserConsumerController {
	
	
	@Autowired
	  private ReadUserClientService service = null;
	 
	 
	  
	  @RequestMapping(value = "/consumer/readUser/list")
	 public String List(Model model) {
		 List<ReadUser> users=service.list();
		 model.addAttribute("users", users);
		 return "readuser/list";
	 }
	  
	  @RequestMapping(value = "/consumer/readUser/toadd")
	 public String toadd() {
		 return "readuser/userAdd";
	 }
	  
	  @RequestMapping(value = "/consumer/readUser/add")
	  public String add(Model model,ReadUser user)
	  {
		  ReadUser readUser = service.findUser(user.getUsername());
		  if(readUser!=null)
		  {
			  model.addAttribute("msg", "错误：用户名已存在！");
			  return "readuser/userAdd";
		  }
		  else {
			  service.add(user);
			  return "redirect:/consumer/readUser/list";
		}
	  }

	  
	  @RequestMapping(value="/consumer/readUser/toedit")
	  public String toEdit(Model model,Long userid) {
		  ReadUser user=service.get(userid);
		  model.addAttribute("user", user);
		  return "readuser/userEdit";
	  }
	  
	  @RequestMapping(value="/consumer/readUser/edit")
	  public String edit(Model model,ReadUser user) {
		  ReadUser readUser = service.findUser(user.getUsername());
		  if(readUser!=null&&(readUser.getUserid().equals(user.getUserid())==false))
		  {
			  return "redirect:/consumer/readUser/toedit?userid="+user.getUserid()+"&error=1";
		  }
		  else {
			  service.upuser(user);
			  return "redirect:/consumer/readUser/list";
		} 
	  }
	  
	  
	  
	  @RequestMapping(value="/consumer/readUser/delUser")
	  public String delete(Long userid) {
		  service.delUser(userid);
		  return "redirect:/consumer/readUser/list";
	  }
	  
	  @RequestMapping(value="/consumer/readUser/setvip")
	  public String setvip(Long userid)
	  {
		  service.setvip(userid);
		  return "redirect:/consumer/readUser/toedit?userid="+userid+"&success=1";
	  }
	  
	  @RequestMapping(value="/consumer/readUser/cancalvip")
	  public String cancalvip(Long userid)
	  {
		  service.cancalvip(userid);
		  return "redirect:/consumer/readUser/toedit?userid="+userid+"&fail=1";
	  }
	  
	  /**
	     * form���ύ Date�������ݰ�
	     * @param binder
	     */
	  @InitBinder  
	  public void initBinder(WebDataBinder binder) {  
	          SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	          dateFormat.setLenient(false);  
	          binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	  }

}
