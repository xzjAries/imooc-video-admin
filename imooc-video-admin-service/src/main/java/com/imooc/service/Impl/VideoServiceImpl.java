package com.imooc.service.Impl;

import java.util.List;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imooc.mapper.BgmMapper;
import com.imooc.mapper.VideosMapper;
import com.imooc.pojo.Bgm;
import com.imooc.pojo.BgmExample;
import com.imooc.pojo.Videos;
import com.imooc.service.VideoService;
import com.imooc.utils.PagedResult;

@Service
public class VideoServiceImpl implements VideoService {
   @Autowired
   private BgmMapper bgmMapper;
	
   @Autowired
   private VideosMapper videosMapper;
   
   @Autowired
   private Sid sid;
   
	@Override
	public void addBgm(Bgm bgm) { 
       String bgmId = sid.nextShort();
       bgm.setId(bgmId);
		bgmMapper.insert(bgm);
	}

	@Override
	public PagedResult queryBgmList(Integer page, Integer pageSize) {
		
		PageHelper.startPage(page,pageSize);
		
		BgmExample example = new BgmExample();
		List<Bgm> list = bgmMapper.selectByExample(example);
		
		PageInfo<Bgm> pageList = new PageInfo<>(list);
		
		PagedResult result = new PagedResult();
		result.setTotal(pageList.getPages());
		result.setRows(list);
		result.setPage(page);
		result.setRecords(pageList.getTotal());
	
		
		return result;
	}

	@Override
	public void deteteBgm(String id) {
          bgmMapper.deleteByPrimaryKey(id);		
	}

	@Override
	public void updateVideoStatus(String vidieoId, Integer status) {
		Videos video = new Videos();
		video.setId(vidieoId);
		video.setStatus(status);
		videosMapper.updateByPrimaryKeySelective(video);
	}

}
