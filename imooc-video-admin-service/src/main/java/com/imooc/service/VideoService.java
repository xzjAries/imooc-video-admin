package com.imooc.service;

import com.imooc.pojo.Bgm;
import com.imooc.utils.PagedResult;

public interface VideoService {
 
	public void addBgm(Bgm bgm);
	
	public PagedResult queryBgmList(Integer page,Integer pageSize);

    public void deteteBgm(String id);
    
    public void updateVideoStatus(String vidieoId,Integer status);
}
