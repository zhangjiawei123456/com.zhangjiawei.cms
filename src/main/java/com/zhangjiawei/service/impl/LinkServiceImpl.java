package com.zhangjiawei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangjiawei.dao.LinkMapper;
import com.zhangjiawei.entity.Link;
import com.zhangjiawei.service.LinkService;
/**
 * 
 * @author zhangjiawei
 *
 */
@Service
public class LinkServiceImpl  implements LinkService{
	
	@Autowired
	LinkMapper linkMapper;

	@Override
	public int add(Link link) {
		// TODO Auto-generated method stub
		return linkMapper.add(link);
		
	}

	@Override
	public PageInfo list(int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,10);
		
		return new PageInfo<Link>(linkMapper.list());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return linkMapper.delete(id);
	}

	@Override
	public Link get(int id) {
		// TODO Auto-generated method stub
		return linkMapper.get(id);
	}

	@Override
	public int update(Link link) {
		// TODO Auto-generated method stub
		return linkMapper.update(link);
		
	}

}
