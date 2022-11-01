package com.hemanth.service;

import com.hemanth.bo.CustomerBO;
import com.hemanth.dao.ICustomerDAO;
import com.hemanth.dto.CustomerDTO;

public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
     //HAS-A Property
	private ICustomerDAO dao;
	
	
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl: 1 param constructor");
		this.dao = dao;
	}



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
