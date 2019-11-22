/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: ControllerInterceptor.java 
 * @Prject: zhangjiawei-cms
 * @Package: com.zhangjiawei.common 
 * @Description: TODO
 * @author: 张佳伟 
 * @date: 2019年11月19日 上午10:16:00 
 * @version: V1.0   
 */
package com.zhangjiawei.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/** 
 * @ClassName: ControllerInterceptor 
 * @Description: TODO
 * @author:张佳伟  
 * @date: 2019年11月19日 上午10:16:00  
 */
@ControllerAdvice
public class ControllerInterceptor {
	
	@ExceptionHandler(CmcException.class)
	@ResponseBody
	public MsgResult  interceptorException(CmcException excetion) {
		System.out.println(" 错误是 "  + excetion);
		return new MsgResult(100,excetion.getMessage(),null);
	}	
	
	@ExceptionHandler(CmcExceptionHtml.class)
	public ModelAndView  interceptorExceptionHtml(CmcExceptionHtml excetion) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error");// 跳转到jsp
		modelAndView.addObject("errorInfo", excetion.getMessage());
		return modelAndView;
		
		
	}	
	
	
	
}
