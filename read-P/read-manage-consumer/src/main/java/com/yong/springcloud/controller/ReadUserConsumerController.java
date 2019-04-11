package com.yong.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yong.springcloud.entities.ReadUser;
import com.yong.springcloud.service.ReadUserClientService;
@Controller
public class ReadUserConsumerController {
	//private static final String REST_URL_PREFIX = "http://localhost:8001";
	/*private static final String REST_URL_PREFIX = "http://read-user-provider8001";
    
    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping(value="/consumer/readUser/add")
    public boolean add(ReadUser user)
    {
         return restTemplate.postForObject(REST_URL_PREFIX+"/readUser/add", user, Boolean.class);
    }
    
    @RequestMapping(value="/consumer/readUser/get/{id}")
    public ReadUser get(@PathVariable("id") Long id)
    {
         return restTemplate.getForObject(REST_URL_PREFIX+"/readUser/get/"+id, ReadUser.class);
    }
    
    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/readUser/list")
    public List<ReadUser> list()
    {
         return restTemplate.getForObject(REST_URL_PREFIX+"/readUser/list", List.class);
    }  */
	
	@Autowired
	  private ReadUserClientService service = null;
	 
	  @RequestMapping(value = "/consumer/readUser/get/{userid}")
	  public ReadUser get(@PathVariable("userid") Long userid)
	  {
	   return this.service.get(userid);
	  }
	 /*
	  * @RequestMapping("/list")
    public String list(Model model) {
        List<User> users=userService.getUserList();
        model.addAttribute("users", users);
        return "user/list";
    }
	  */
	  /*@RequestMapping(value = "/consumer/readUser/list")
	  public List<ReadUser> list()
	  {
	   return this.service.list();
	  }
	  */
	  //用户列表
	  @RequestMapping(value = "/consumer/readUser/list")
	 public String List(Model model) {
		 List<ReadUser> users=service.list();
		 model.addAttribute("users", users);
		 return "list";
	 }
	  //增加用户
	  @RequestMapping(value = "/consumer/readUser/toadd")
	 public String toadd() {
		 return "userAdd";
	 }
	  
	  @RequestMapping(value = "/consumer/readUser/add")
	  public String add(ReadUser user)
	  {
		  service.add(user);
		  return "redirect:/consumer/readUser/list";
	  }
/*@RequestMapping("/toEdit")
    public String toEdit(Model model,Long id) {
        User user=userService.findUserById(id);
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(User user) {
        userService.edit(user);
        return "redirect:/list";
    }
 * */
	  @RequestMapping(value="/consumer/readUser/toedit")
	  public String toEdit(Model model,Long userid) {
		  ReadUser user=service.get(userid);
		  model.addAttribute("user", user);
		  return "userEdit";
	  }
	  
	  @RequestMapping(value="/consumer/readUser/edit")
	  public String edit(ReadUser user) {
		  service.upuser(user);
		  return "redirect:/consumer/readUser/list";
	  }
	  
	  /*@RequestMapping("/delete")
    public String delete(Long id) {
        userService.delete(id);
        return "redirect:/list";
    }
	    */
	  @RequestMapping(value="/consumer/readUser/delUser")
	  public String delete(Long userid) {
		  service.delUser(userid);
		  return "redirect:/consumer/readUser/list";
	  }

}
