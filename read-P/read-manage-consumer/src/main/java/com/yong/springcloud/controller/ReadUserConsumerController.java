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
	 
	 
	  //用户列表
	  @RequestMapping(value = "/consumer/readUser/list")
	 public String List(Model model) {
		 List<ReadUser> users=service.list();
		 model.addAttribute("users", users);
		 return "readuser/list";
	 }
	  //增加用户
	  @RequestMapping(value = "/consumer/readUser/toadd")
	 public String toadd() {
		 return "readuser/userAdd";
	 }
	  
	  @RequestMapping(value = "/consumer/readUser/add")
	  public String add(ReadUser user)
	  {
		  service.add(user);
		  return "redirect:/consumer/readUser/list";
	  }

	  //修改用户
	  @RequestMapping(value="/consumer/readUser/toedit")
	  public String toEdit(Model model,Long userid) {
		  ReadUser user=service.get(userid);
		  model.addAttribute("user", user);
		  return "readuser/userEdit";
	  }
	  
	  @RequestMapping(value="/consumer/readUser/edit")
	  public String edit(ReadUser user) {
		  service.upuser(user);
		  return "redirect:/consumer/readUser/list";
	  }
	  
	  
	  //删除用户
	  @RequestMapping(value="/consumer/readUser/delUser")
	  public String delete(Long userid) {
		  service.delUser(userid);
		  return "redirect:/consumer/readUser/list";
	  }
	  
	  
	  /**
	     * form表单提交 Date类型数据绑定
	     * @param binder
	     */
	  @InitBinder  
	  public void initBinder(WebDataBinder binder) {  
	          SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	          dateFormat.setLenient(false);  
	          binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	  }

}
