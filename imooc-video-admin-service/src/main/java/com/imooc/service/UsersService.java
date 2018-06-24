package com.imooc.service;

import com.imooc.pojo.User;
import com.imooc.utils.PagedResult;

public interface UsersService {

	public PagedResult queryUsers(User user,Integer page,Integer pageSize);
	
	public PagedResult queryReportList(Integer page,Integer pageSize);
	
}
