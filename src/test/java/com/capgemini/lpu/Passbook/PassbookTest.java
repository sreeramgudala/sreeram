package com.capgemini.lpu.Passbook;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

import com.capgemini.lpu.Exceptions.AccountIdException;
import com.capgemini.lpu.Exceptions.AccountIdFormatException;
import com.capgemini.lpu.Exceptions.AccountIdNullException;
import com.capgemini.lpu.Exceptions.DateException;
import com.capgemini.lpu.Passbook.entity.Transaction;
import com.capgemini.lpu.Passbook.service.PassbookService;
import com.capgemini.lpu.Passbook.service.PassbookServiceImpl;

public class PassbookTest {

	static PassbookService ser = new PassbookServiceImpl();

	@Test
	@DisplayName("Testing validation for account Id")
	public void PassbookTest1() {
		assertThrows(AccountIdFormatException.class, () -> ser.getTxns("hynhtgygr"));

	}

	@Test
	@DisplayName("Testing AccountIDException for  account Id not exists")
	public void PassbookTest2() {
		assertThrows(AccountIdException.class, () -> ser.getTxns("100000123455"));

	}

	@Test
	@DisplayName("Test3 for the Exist AccountID")
	public void PassbookTest3() throws AccountIdException, AccountIdNullException, AccountIdFormatException {
		assertTrue(ser.getTxns("100000123456").size() == 4);

	}

	@Test
	@DisplayName("Test 4")
	public void PassbookTest4() throws AccountIdException, AccountIdNullException, AccountIdFormatException  {
		assertEquals(4, ser.getTxns("100000123456").size());
	}

	@Test
	@DisplayName("Test 5")
	public void PassbookTest5() throws AccountIdException, AccountIdNullException, AccountIdFormatException {
		List<Transaction> expected = new ArrayList<>();
		LocalDate d2 = LocalDate.of(1996, 5, 26);
		LocalDate d3 = LocalDate.of(1997, 8, 24);
		LocalDate d4 = LocalDate.of(1998, 11, 11);
		LocalDate d5 = LocalDate.of(1999, 3, 13);
		Transaction tran1=new Transaction("100000123456","Credit",5000.0,"slip",d5,"-","Rao Ramesh","self",203065.26);
		Transaction tran5=new Transaction("100000123456","debit",4000.0,"slip",d4,"-","Rao Ramesh","self",198065.26);
		Transaction tran6=new Transaction("100000123456","Credit",2000.0,"slip",d3,"-","Rao Ramesh","self",202065.26);
		Transaction tran7=new Transaction("100000123456","debit",1515.0,"slip",d2,"-","Rao Ramesh","self",200065.26);
		expected.add(tran1);
		expected.add(tran5);
		expected.add(tran6);
		expected.add(tran7);
		assertEquals(expected.toString(), ser.getTxns("100000123456").toString());
	}
	
	@Test
	@DisplayName("Testing NULL for account Id")
	public void PassbookTest6() {
		assertThrows(AccountIdNullException.class, () -> ser.getTxns(null));

	}
	
	@Test
	@DisplayName("Testing date")
	public void PassbookTest7() {
		LocalDate d3 = LocalDate.of(2021, 8, 24);
		LocalDate d4 = LocalDate.of(2022, 11, 11);
		assertThrows(DateException.class, () -> ser.getTxns("100000123456",d3,d4));

	}

}
