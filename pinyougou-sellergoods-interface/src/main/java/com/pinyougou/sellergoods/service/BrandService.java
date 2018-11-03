package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;

public interface BrandService {
	
	/**
	 * 查询列表所有
	 * @return
	 */
	List<TbBrand> findAll();
}
