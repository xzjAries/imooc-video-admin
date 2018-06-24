package com.imooc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.imooc.enums.VideoStatusEnum;
import com.imooc.pojo.Bgm;
import com.imooc.pojo.User;
import com.imooc.service.UsersService;
import com.imooc.service.VideoService;
import com.imooc.utils.IMoocJSONResult;
import com.imooc.utils.PagedResult;

@Controller
@RequestMapping("video")
public class VideoController extends BaseController{

	@Autowired
	private VideoService videoService;
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/showReportList")
	public String showReportList() {
		return "video/reportList";
	}
	
	@GetMapping("/showBgmList")
	public String showAddList() {
		return "video/bgmList";
	}
	
	@GetMapping("/showAddBgm")
	public String login() {
		return "video/addBgm";
	}
	
	
	@PostMapping("/delBgm")
	@ResponseBody
	public IMoocJSONResult delBgm(String bgmId) {
		videoService.deteteBgm(bgmId);
		return IMoocJSONResult.ok();
	}
	
	@PostMapping("/forbidVideo")
	@ResponseBody
	public IMoocJSONResult forbidVideo(String videoId) {
		videoService.updateVideoStatus(videoId, VideoStatusEnum.FORBID.value);
		return IMoocJSONResult.ok();
	}
	
	@PostMapping("/queryBgmList")
	@ResponseBody
	public PagedResult queryBgmList(Integer page) {
		return videoService.queryBgmList(page, PAGE_SIZE);
	}
	
	@PostMapping("/addBgm")
	@ResponseBody
	public IMoocJSONResult addBgm(Bgm bgm) {
		System.out.println(bgm.toString());
		videoService.addBgm(bgm);
		return IMoocJSONResult.ok();
	}
    
	@PostMapping("/reportList")
	@ResponseBody
	public PagedResult reportList(Integer page, Integer pageSize){
		if(page == null) {
			page = 1;
		}
		
		if(pageSize == null) {
			pageSize = PAGE_SIZE;
		}
		PagedResult pagedResult = usersService.queryReportList(page, pageSize);
		return pagedResult;
	}
	
	@PostMapping("/bgmUpload")
	@ResponseBody
	public IMoocJSONResult bgmUpload(@RequestParam("file") MultipartFile[] files) throws Exception {
  
		//文件保存的命名空间
		//String fileSpace = "C:\imooc_videos_dev";
		//String fileSpace = File.separator + "imooc_videos_dev" + File.separator +"mvc_bgm";

		String fileSpace = "C:" + File.separator + FILE_SPACE + File.separator +BGM_SPACE;
		
		//保存到数据库中的相对路径
		String uploadPathDB =  File.separator + "bgm";
		
		FileOutputStream fileOutputStream = null;
		InputStream inputStream = null;
		try {
			if (files != null && files.length > 0) {
				String filename = files[0].getOriginalFilename();
				if (StringUtils.isNoneBlank(filename)) {
			       //文件上传的最终路径
					String finalPath = fileSpace+uploadPathDB+File.separator+filename;
					//设置数据库的保存路径
					uploadPathDB +=(File.separator+filename);
					
					File outFile = new File(finalPath);
					if(outFile.getParentFile() !=null || !outFile.getParentFile().isDirectory()) {
						//创建父文件夹
						outFile.getParentFile().mkdirs();
					}
					
					fileOutputStream = new FileOutputStream(outFile);
					inputStream = files[0].getInputStream();
					IOUtils.copy(inputStream, fileOutputStream);
				}else {
					return IMoocJSONResult.errorMap("上传出错...");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return IMoocJSONResult.errorMap("上传出错...");
		}finally {
			if(fileOutputStream!=null) {
				fileOutputStream.flush();
				fileOutputStream.close();
			}
		}

		return IMoocJSONResult.ok(uploadPathDB);

	}
	
}
