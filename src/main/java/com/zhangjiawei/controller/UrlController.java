package com.zhangjiawei.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangjiawei.entity.Url;


@RequestMapping("url")
@Controller
public class UrlController {

	@GetMapping("add")
	public String add(HttpServletRequest request ) {
		request.setAttribute("url",new Url());
		return "url/add";
	}
	
	@PostMapping("add")
	public String add(HttpServletRequest request, 
			@Validated @ModelAttribute("url") Url url,
			BindingResult result) {
		if(result.hasErrors()) {
			return "url/add";
		}
		
		return "url/list";
	}
}
