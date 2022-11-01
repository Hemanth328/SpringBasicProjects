package com.hemanth.dao;

import com.hemanth.bo.CustomerBO;

public interface ICustomerDAO {
	public int insert(CustomerBO custBo) throws Exception;
}
