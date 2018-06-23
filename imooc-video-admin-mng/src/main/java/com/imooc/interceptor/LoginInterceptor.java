package com.imooc.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.imooc.controller.BaseController;

public class LoginInterceptor extends BaseController implements HandlerInterceptor {
    
	private List<String> unCheckUrls; 
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String requestUrl = request.getRequestURI();
		requestUrl = requestUrl.replaceAll(request.getContextPath(), "");
		//判断是否针对匿名路径需要拦截机，如果包含，则表示匿名路径，需要拦截，否则通过拦截器
		if(unCheckUrls.contains(requestUrl)) {
			//包含公开url，直接跳过
			System.out.println("放过拦截...");
			return true;
		}
		                                              
		if(null == request.getSession().getAttribute(SESSION_USER)) {
			response.sendRedirect(request.getContextPath() + "/users/login.action");
		    System.out.println("拦截去登录...");
			return false;
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

	public List<String> getUnCheckUrls() {
		return unCheckUrls;
	}

	public void setUnCheckUrls(List<String> unCheckUrls) {
		this.unCheckUrls = unCheckUrls;
	}

	
	
}
