package com.zhangjiawei.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhangjiawei.entity.Article;

public interface ArticleService {

	/**
	 * 获取最新文章
	 * @param i  获取的个数
	 * @return
	 */
	List<Article> getNewArticles(int i);

	/**
	 * 获取最新文章
	 * @param i  获取的个数
	 * @return
	 */
	PageInfo<Article> hotList(int page);

	/**
	 * 根据文章id 获取文章的内容
	 * @param id
	 * @return
	 */
	Article getById(Integer id);

	/**
	 * 根据频道或者分类获取文章
	 * @param chnId
	 * @param categoryId
	 * @param page
	 * @return
	 */
	PageInfo<Article> listByCat(int chnId, int categoryId, int page);

	/**
	 * 
	 * @param id
	 * @return
	 */
	
	PageInfo<Article> listByUser(int page,Integer userId);

	/**
	 *删除文章
	 * @param id
	 * @return
	 */
	int delete(int id);

	/** 
	 * 判断文章是否存在
	 * @Title: checkExist 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @return: Article
	 */
	Article checkExist(int id);

	/**  根据状态查询文章
	 * @Title: getPageList 
	 * @Description: TODO
	 * @param status
	 * @param page
	 * @return
	 * @return: PageInfo<Article>
	 */
	PageInfo<Article> getPageList(int status, Integer page);

	/**
	 * 获取文章详情  不考虑文章的状态
	 * @param id
	 * @return
	 */
	Article getDetailById(int id);

	/**
	 * 审核文章
	 * @param id
	 * @param status
	 * @return
	 */
	int apply(int id, int status);

	/**
	 * 设置热门与否
	 * @param id
	 * @param status
	 * @return
	 */
	int setHot(int id, int status);

	/**
	 * 添加文章
	 * @param article
	 * @return
	 */
	int add(Article article);

	/**
	 * 
	 * @param article
	 * @return
	 */
	int update(Article article);

	/***
	 * 收藏
	 * @param id
	 * @param id2
	 * @return
	 */
	int faverite(Integer id, int id2);
	

}
