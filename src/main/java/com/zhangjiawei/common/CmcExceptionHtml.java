/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: CmcExceptionHtml.java 
 * @Prject: zhangjiawei-cms
 * @Package: com.zhangjiawei.common 
 * @Description: TODO
 * @author: zhangjiawei
 * @date: 2019年11月19日 上午10:50:58 
 * @version: V1.0   
 */
package com.zhangjiawei.common;

/** 
 *  抛出异常  异常在html页面显示
 * @ClassName: CmcExceptionHtml 
 * @Description: TODO
 * @author:zhangjiawei  
 * @date: 2019年11月19日 上午10:50:58  
 */
public class CmcExceptionHtml extends RuntimeException {
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = -6762629250308786819L;

	/**
	 * 
	 */
	public CmcExceptionHtml(String msg) {
		super(msg);
	}

}
