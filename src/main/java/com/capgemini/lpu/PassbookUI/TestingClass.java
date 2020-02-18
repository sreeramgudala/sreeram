package com.capgemini.lpu.PassbookUI;
import java.util.List;

import com.capgemini.lpu.Passbook.entity.Transaction;
import com.capgemini.lpu.Passbook.service.PassbookService;
import com.capgemini.lpu.Passbook.service.PassbookServiceImpl;

public class TestingClass {
	
	public static void main(String[] args) {
		
		PassbookService ser=new PassbookServiceImpl();
		try {
			List<Transaction> lst=ser.getTxns("100000123456");
			lst.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
