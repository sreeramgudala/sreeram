package com.capgemini.lpu.Passbook.service;
import java.time.LocalDate;
import java.util.List;

import com.capgemini.lpu.Exceptions.AccountIdException;
import com.capgemini.lpu.Exceptions.AccountIdFormatException;
import com.capgemini.lpu.Exceptions.AccountIdNullException;
import com.capgemini.lpu.Exceptions.DateException;
import com.capgemini.lpu.Passbook.entity.*;


public interface PassbookService {
	public List<Transaction> getTxns(String accid,LocalDate frm ,LocalDate to ) throws AccountIdException, AccountIdNullException, DateException, AccountIdFormatException ;
	public List<Transaction> getTxns(String accid) throws AccountIdException, AccountIdNullException, AccountIdFormatException ;

}
