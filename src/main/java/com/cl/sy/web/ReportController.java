package com.cl.sy.web;

import com.cl.sy.service.ICompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @描述：企业Controller
 * @作者：cl
 * @版本：V1.0
 * @创建时间：2019-03-18 下午11:07:29
 */
@Controller
public class ReportController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private ICompanyService companyService;
	
	/**
	 * 根据ID获取用户
	 * @param id
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/report/get/{id}", method = RequestMethod.GET)
	public String get(@PathVariable("id") Integer id, Model model,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println("###ID:" + id);
		// model.addAttribute(userService.getUserById(id));
		return "/test/show.jsp";
	}

	/**
	 * 进入报表页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/report/form")
	public String list(HttpServletRequest request, Model model) {
		return "report";
	}
	

	
	@ExceptionHandler(Exception.class)
	public String exception(Exception e, HttpServletRequest request) {
		request.setAttribute("exception", e);
		return "/pages/error/404.html";
	}
}