package com.cl.sy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @描述：WebController
 * @作者：cl
 * @版本：V1.0
 * @创建时间：2019-03-20 下午3:13:16
 */
@Controller
public class WebController {

	@RequestMapping("/")
	public String index(){ 
		return "login";
	}
	
}
