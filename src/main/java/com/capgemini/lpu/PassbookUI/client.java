package com.capgemini.lpu.PassbookUI;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.lpu.Passbook.entity.Transaction;
import com.capgemini.lpu.Passbook.service.PassbookService;
import com.capgemini.lpu.Passbook.service.PassbookServiceImpl;

public class client {
	
	public static void main(String[] args) {
		
		PassbookService ser=new PassbookServiceImpl();
		LocalDate d1=LocalDate.of(1900, 1, 1);
		LocalDate d2=LocalDate.of(2000, 12, 30);
		try {
			List<Transaction> lst=ser.getTxns("100000123456",d1,d2);
			lst.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
