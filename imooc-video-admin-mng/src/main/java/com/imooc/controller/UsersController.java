package com.imooc.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imooc.bean.AdminUser;
import com.imooc.pojo.User;
import com.imooc.service.UsersService;
import com.imooc.utils.IMoocJSONResult;
import com.imooc.utils.PagedResult;

@Controller
@RequestMapping("users")
public class UsersController extends BaseController{

	@Autowired
	private UsersService usersService;
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	 @GetMapping("/showList")
	 public String showList() {
		 return "users/usersList";
	 }
	

	 @PostMapping("/list")
	 @ResponseBody
	 public PagedResult list(User user,Integer page) {
		 
		 PagedResult result = usersService.queryUsers(user, page==null?1:page, PAGE_SIZE);
		 return result;
	 }
	
	 
	@PostMapping("login")
	@ResponseBody
	public IMoocJSONResult userLogin(String username, String password,
			HttpServletRequest request, HttpServletResponse response) {
		//TODO 模拟登录
		if(StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
			return IMoocJSONResult.errorMap("用户名和密码不能为空");
		}else if(username.equals("lee")&&password.equals("lee")) {
			String usertoken = UUID.randomUUID().toString();
			AdminUser user = new AdminUser(username, password, usertoken);
			request.getSession().setAttribute(SESSION_USER, user);
			return IMoocJSONResult.ok();
		}
			
			
		return IMoocJSONResult.errorMsg("登陆失败，请重试...");
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest requset,HttpServletResponse respose) {
		
		requset.getSession().removeAttribute(SESSION_USER);
		return "login";
	}
}
