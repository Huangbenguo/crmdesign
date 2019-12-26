package com.hbg.crmdesign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hbg
 * @date 2019/12/26 17:52
 * 实现功能：
 */
@Controller
@RequestMapping("/courseorder")
public class CourseOrder{
	@RequestMapping("/list")
	public String list(){
		return "/courseorder/list";
	}
}
