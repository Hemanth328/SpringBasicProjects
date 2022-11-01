package com.hemanth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hemanth.bo.CustomerBO;
import com.hemanth.dao.ICustomerDAO;
import com.hemanth.dto.CustomerDTO;


@Service("custService")
public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
     //HAS-A Property
	@Autowired
	@Qualifier("dao")  // Always we take alias name
	private ICustomerDAO dao;
	


	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		System.out.println("CustomerMgmtServiceImpl.registerCustomer()");
		
		// writing business logic to calculate interest amount
		double intramt = (dto.getRate()*dto.getTime())/100.0;
		
		//prepare CustomerBo class obj having persistable data
		CustomerBO custBO = new CustomerBO();
		custBO.setCname(dto.getCname());
		custBO.setCadd(dto.getCadd());
		custBO.setPamt(dto.getPamt());
		custBO.setIntramt(intramt);
		 
		
		//use DAO
		int count = dao.insert(custBO);
		
		//process the result
		return count==0?"Registration failed":"Registration succeeded :: interest amount :: "+intramt;		
	}

}
