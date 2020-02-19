package com.capgemini.lpu.Passbook.dao;

import java.util.List;

import com.capgemini.lpu.Exceptions.AccountIdException;
import com.capgemini.lpu.Passbook.entity.AccountManagement;
import com.capgemini.lpu.Passbook.entity.Transaction;
import com.capgemini.lpu.Passook.Repository.*;


public class PassbookdaoImpl implements PassbookDao {
	
	/**
	 * This class implements methods of dao interface 
	 */
	
	@Override
	public AccountManagement getAccount(String accid) throws AccountIdException  {
		if(PassbookRepository.accList.containsKey(accid)) {
			AccountManagement acc=PassbookRepository.accList.get(accid);
			return acc;
		}
		else
			throw new AccountIdException();
		
	}

	@Override
	public List<Transaction> getTxns(String accid) throws AccountIdException  {
		if(PassbookRepository.accList.containsKey(accid)) {
			List<Transaction> txn=PassbookRepository.accList.get(accid).getTxns();
			return txn;
		}
		else {
			throw new AccountIdException();
		}

	}

}