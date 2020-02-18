package com.capgemini.lpu.Passbook.service;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.lpu.Exceptions.AccountIdException;
import com.capgemini.lpu.Exceptions.AccountIdFormatException;
import com.capgemini.lpu.Exceptions.AccountIdNullException;
import com.capgemini.lpu.Exceptions.DateException;
import com.capgemini.lpu.Passbook.dao.PassbookDao;
import com.capgemini.lpu.Passbook.dao.PassbookdaoImpl;
import com.capgemini.lpu.Passbook.entity.Transaction;

/**
 * 
 * @author G.Siva Sreeram <br/>
 *         Logic
 *
 */


public class PassbookServiceImpl implements PassbookService {
	
	public PassbookDao dao = new PassbookdaoImpl();
	
	/**
	 * This method generates randomly 5 questions from the question bank and add it into list
	 * @return List<Question> 
	 * @throws AccountIdNullException 
	 * @throws DateException 
	 * @throws AccountIdFormatException   
	 */

	public List<Transaction> getTxns(String accid,LocalDate frm ,LocalDate to ) throws AccountIdException, AccountIdNullException, DateException, AccountIdFormatException  {
		if(accid==null)
			throw new AccountIdNullException();
		if(!accid.matches("[1-9][0-9]{11}")) {
			throw new AccountIdFormatException(); }
		if(frm.isAfter(LocalDate.now()) || to.isAfter(LocalDate.now())) 
			throw new DateException();
		List<Transaction> listtrans=dao.getTxns(accid);
		List<Transaction> filteredTxns=listtrans.stream()
				.filter(tx->tx.getTransDate().compareTo(frm)>=0 && tx.getTransDate().compareTo(to)<=0)
				.collect(Collectors.toList());
		return filteredTxns;
	
	}
	

	/**
	 *
	 */
	public List<Transaction> getTxns(String accid) throws AccountIdException, AccountIdNullException, AccountIdFormatException {
		if(accid==null)
			throw new AccountIdNullException();
		if(!accid.matches("[1-9][0-9]{11}"))
			throw new AccountIdFormatException();
		List<Transaction> listtrans=dao.getTxns(accid);
		List<Transaction> limittrans=listtrans.stream().limit(4).collect(Collectors.toList());
	return limittrans;
	}
}
