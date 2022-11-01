package com.hemanth.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hemanth.bo.CustomerBO;

@Repository("oraDAO")
public final class OracleCustomerDAOImpl implements ICustomerDAO {
	private static final String CUSTOMER_INSERT_QUERY = "INSERT INTO REALTIMEDI_CUSTOMER VALUES(CUST_NO_SEQ.NEXTVAL,?,?,?,?)";
	//HAS-A Property
	@Autowired
	private DataSource ds;
	
	
	
	@Override
	public int insert(CustomerBO custBO) throws Exception {
		System.out.println("Oracle CustomerDAOImpl.insert()  "+ds.getClass());
		
		int count = 0;
		
		//get pooled JDBC connection
		try(Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(CUSTOMER_INSERT_QUERY);
			) {
			// set values to query param by collecting the data from BO class obj
			if(ps!=null) {
				ps.setString(1, custBO.getCname());
				ps.setString(2, custBO.getCadd());
				ps.setDouble(3, custBO.getPamt());
				ps.setDouble(4, custBO.getIntramt());
				
				
				//execute the query
				count = ps.executeUpdate();
			}
			
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return count;
	}

}
