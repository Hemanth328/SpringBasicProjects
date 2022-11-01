package com.hemanth.controller;

import com.hemanth.dto.CustomerDTO;
import com.hemanth.service.ICustomerMgmtService;
import com.hemanth.vo.CustomerVO;

public final class MainController {
	//HAS-A Property
	
	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController: 1-Partam constrcutor");
		this.service = service;
	}
	
	
	public String processCustomer(CustomerVO vo)throws Exception {
		
		// convert VO Class obj to DTO class object
		CustomerDTO custDTO = new CustomerDTO();
		
		custDTO.setCname(vo.getCname());
		custDTO.setCadd(vo.getCadd());
		custDTO.setPamt(Double.parseDouble(vo.getPamt()));
		custDTO.setTime(Double.parseDouble(vo.getTime()));
		custDTO.setRate(Double.parseDouble(vo.getRate()));
		
		// use Service
		String resultMsg = service.registerCustomer(custDTO);
		
		return resultMsg;
	}
	
	
}
