package com.eb.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	@ResponseBody
	@RequestMapping(value="/uploadimg")
	public Map<String,Object> upfile(@RequestParam("file") MultipartFile file,
			HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		String path = request.getServletContext().getRealPath("/resources/upimg/");
		try {
			file.transferTo(new File(path + file.getOriginalFilename()));
			map.put("imgurl", request.getContextPath()+"/resources/upimg/"+file.getOriginalFilename());
			map.put("msg", "上传成功！");
			map.put("filename", file.getOriginalFilename());
			//System.out.println(file.getOriginalFilename()+"=========================================");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return map;
		
	}
}
