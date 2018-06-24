package com.imooc.service.Impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imooc.mapper.UserMapper;
import com.imooc.mapper.UsersReportMapperCustom;
import com.imooc.pojo.User;
import com.imooc.pojo.UserExample;
import com.imooc.pojo.UserExample.Criteria;
import com.imooc.pojo.vo.Reports;
import com.imooc.service.UsersService;
import com.imooc.utils.PagedResult;
@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UsersReportMapperCustom usersReportMapperCustom;
	
	@Override
	public PagedResult queryUsers(User user, Integer page, Integer pageSize) {
		String username = "";
		String nickname = "";
		if(user != null) {
			username = user.getUsername();
			nickname = user.getNickname();
		}
		
		PageHelper.startPage(page, pageSize);
		
		UserExample userExample = new UserExample();
        Criteria userCriteria = userExample.createCriteria();
		if(StringUtils.isNotBlank(username)) {
			userCriteria.andUsernameLike(username);
		}
		
		if(StringUtils.isNotBlank(nickname)) {
			userCriteria.andNicknameLike(nickname);
		}
		
		List<User> userList = userMapper.selectByExample(userExample);
		
		PageInfo<User> pageList = new PageInfo<>(userList);
		
		PagedResult grid = new PagedResult();
		grid.setTotal(pageList.getPages());
		grid.setRows(userList);
		grid.setPage(page);
		grid.setRecords(pageList.getTotal());
		 
		
		return grid;
	}

	@Override
	public PagedResult queryReportList(Integer page, Integer pageSize) {
	     PageHelper.startPage(page, pageSize);
	      
	      List<Reports> reportsList = usersReportMapperCustom.selectAllVideoReport();
		  
	      PageInfo<Reports> pageList = new PageInfo<>(reportsList);
	      
	      PagedResult grid = new PagedResult();
	      grid.setTotal(pageList.getPages());	
	      grid.setRows(reportsList);
	      grid.setPage(page);
	      grid.setRecords(grid.getTotal());
	     
	      return grid;
	}

}
