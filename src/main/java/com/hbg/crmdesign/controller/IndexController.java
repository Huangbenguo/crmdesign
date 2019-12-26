package com.hbg.crmdesign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hbg
 * @date 2019/12/24 13:39
 * 实现功能：打通前后端页面
 */
@Controller
public class IndexController {
	@RequestMapping("/index")
	public String Index(){
		return "index";
	}
}
