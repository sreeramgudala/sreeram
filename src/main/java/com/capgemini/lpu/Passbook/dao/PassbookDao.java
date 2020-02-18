package com.capgemini.lpu.Passbook.dao;

import java.util.List;

import com.capgemini.lpu.Exceptions.AccountIdException;
import com.capgemini.lpu.Passbook.entity.AccountManagement;
import com.capgemini.lpu.Passbook.entity.Transaction;
/**
 * 
 * @author G.Siva Sreeram<br/>
 *         This is an interface.
 *         It contains abstract methods
 *
 */

public interface PassbookDao {
	
	public AccountManagement getAccount(String accid)throws AccountIdException ;
	public List<Transaction> getTxns(String accid) throws AccountIdException ;
	

}
