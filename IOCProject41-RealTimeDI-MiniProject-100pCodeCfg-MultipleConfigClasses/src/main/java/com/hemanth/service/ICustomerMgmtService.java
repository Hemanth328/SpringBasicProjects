package com.hemanth.service;

import com.hemanth.dto.CustomerDTO;

public interface ICustomerMgmtService {

	public String registerCustomer(CustomerDTO dto)throws Exception;
}
