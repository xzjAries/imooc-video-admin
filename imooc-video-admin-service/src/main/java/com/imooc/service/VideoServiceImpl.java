package com.imooc.service;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.mapper.BgmMapper;
import com.imooc.pojo.Bgm;

@Service
public class VideoServiceImpl implements VideoService {
   @Autowired
   private BgmMapper bgmMapper;
	
   @Autowired
   private Sid sid;
   
	@Override
	public void addBgm(Bgm bgm) { 
       String bgmId = sid.nextShort();
       bgm.setId(bgmId);
		bgmMapper.insert(bgm);
	}

}
