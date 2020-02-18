package com.capgemini.lpu.Passbook.dao;

import java.util.List;

import com.capgemini.lpu.Exceptions.AccountIdException;
import com.capgemini.lpu.Passbook.entity.AccountManagement;
import com.capgemini.lpu.Passbook.entity.Transaction;
import com.capgemini.lpu.Passook.Repository.*;


public class PassbookdaoImpl implements PassbookDao {
	
	/**
	 * This class implements methods of dao interface 
	 * ques id will be the key and question will be the value maintained in the map
	 * @return map returns the map that loaded all the questions from the file
	 * @throws ExamException if error in reading/ file not found/ filenot having proper format
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