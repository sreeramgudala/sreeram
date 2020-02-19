package com.capgemini.lpu.Passook.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.lpu.Passbook.entity.AccountManagement;
import com.capgemini.lpu.Passbook.entity.Address;
import com.capgemini.lpu.Passbook.entity.Branch;
import com.capgemini.lpu.Passbook.entity.Customer;
import com.capgemini.lpu.Passbook.entity.Transaction;

public class PassbookRepository {
	
	public static Map<String, AccountManagement> accList=new HashMap<String, AccountManagement>();
	public static List<Transaction> transList=new ArrayList<Transaction>();
	public static List<Transaction> transList2=new ArrayList<Transaction>();
	public static List<Transaction> transList3=new ArrayList<Transaction>();
	public static List<Transaction> transList4=new ArrayList<Transaction>();
	public static List<Transaction> transList5=new ArrayList<Transaction>();

	
	static{
		
/**                       Branch(String  , String          , String      , String     )	
 */
		Branch brnch1=new Branch("br1001","KONDAREDDY BURG","PCNA0001001","KURNOOL"   );
		Branch brnch2=new Branch("br1002","TEKKALI"        ,"PCNA0001002","SRIKAKULAM");
		Branch brnch3=new Branch("br1003","NARASARAO PET"  ,"PCNA0001003","GUNTUR"    );
		Branch brnch4=new Branch("br1004","MR PALLI"       ,"PCNA0001001","TIRUPATHI" );

		
/**                      Address(String      , String   , String           , String     , String         ,String , String , Branch) 
*/	
		Address add1=new Address("H No.12/9" ,"2nd line","Amaravathi Nagar","KURNOOL"   ,"ANDHRA PRADESH","INDIA","523110",brnch1);
		Address add2=new Address("H No.14/6" ,"3rd line","Amar Nagar"      ,"SRIKAKULAM","ANDHRA PRADESH","INDIA","523101",brnch2);
		Address add3=new Address("H No.356/5","1st line","Jyothi market"   ,"GUNTUR"    ,"ANDHRA PRADESH","INDIA","510110",brnch3);
		Address add4=new Address("H No.23/1" ,"4th line","Maruthi Nagar"   ,"TIRUPATHI" ,"ANDHRA PRADESH","INDIA","532008",brnch4);
		
		
		
		LocalDate d1 = LocalDate.of(1995, 1, 12);
		LocalDate d2 = LocalDate.of(1996, 5, 26);
		LocalDate d3 = LocalDate.of(1997, 8, 24);
		LocalDate d4 = LocalDate.of(1998, 11, 11);
		LocalDate d5 = LocalDate.of(1999, 3, 13);


		/**                Customer(String     , String       , Address , String ,String customerPan, String , String , LocalDate )
		*/			
		Customer cust1=new Customer("ct0001001", "Rao Ramesh"  , add1 , "121156982034", "XVGY258945", "9638521472" , "MALE"   , d1);
		Customer cust2=new Customer("ct0001552", "Babu Suresh" , add2 , "125153315555", "FBTN651513", "9513563153" , "MALE"   , d1);
		Customer cust3=new Customer("ct0005133", "Amma Kumar"  , add3 , "121211112546", "KJJK321543", "8984653165" , "MALE"   , d1);
		Customer cust4=new Customer("ct0008946", "Manasa Reddy", add4 , "115511552165", "RTHF655588", "9865316645" , "FEMALE" , d1);
		Customer cust5=new Customer("ct0008946", "Manasa Reddy", add4 , "115511552165", "RTHF655588", "9865316645" , "FEMALE" , d1);
	
		
		/**        		      Transaction(String        , String , double , String ,LocalDate,String , String     ,String, double ) {
		 */			
		Transaction tran1=new Transaction("100000123456","Credit",5000.0  ,"slip"  ,  d5     ,  "-"  ,"Rao Ramesh","self",203065.26);
		Transaction tran5=new Transaction("100000123456","debit" ,4000.0  ,"slip"  ,  d4     ,  "-"  ,"Rao Ramesh","self",198065.26);
		Transaction tran6=new Transaction("100000123456","Credit",2000.0  ,"slip"  ,  d3     ,  "-"  ,"Rao Ramesh","self",202065.26);
		Transaction tran7=new Transaction("100000123456","debit" ,1515.0  ,"slip"  ,  d2     ,  "-"  ,"Rao Ramesh","self",200065.26);
		
		Transaction tran2=new Transaction("100000989565","Debit",89515.0,"slip",d5,"-","Babu Suresh","self",305067.86);
		Transaction tran3=new Transaction("100000989565","Debiit",95615.0,"slip",d5,"-","Amma Kumar","self",500895.59);
		Transaction tran4=new Transaction("100000989565","Credit",12500.0,"slip",d5,"-","Manasa Reddy","self",850065.69);
		
		Transaction tran8=new Transaction("100000123457","Debit",89515.0,"slip",d5,"-","Babu Suresh","self",305067.86);
		Transaction tran9=new Transaction("100000123457","Debiit",95615.0,"slip",d5,"-","Amma Kumar","self",500895.59);
		Transaction tran10=new Transaction("100000123457","Credit",12500.0,"slip",d5,"-","Manasa Reddy","self",850065.69);

		Transaction tran11=new Transaction("100000123458","Debit",89515.0,"slip",d5,"-","Babu Suresh","self",305067.86);
		Transaction tran12=new Transaction("100000123458","Debiit",95615.0,"slip",d5,"-","Amma Kumar","self",500895.59);
		Transaction tran13=new Transaction("100000123458","Credit",12500.0,"slip",d5,"-","Manasa Reddy","self",850065.69);
		
		Transaction tran14=new Transaction("100000123459","Debit",89515.0,"slip",d5,"-","Babu Suresh","self",305067.86);
		Transaction tran15=new Transaction("100000123459","Debiit",95615.0,"slip",d5,"-","Amma Kumar","self",500895.59);
		Transaction tran16=new Transaction("100000123459","Credit",12500.0,"slip",d5,"-","Manasa Reddy","self",850065.69);
		
		
	// Adding transaction into the List	
		transList.add(tran1);
		transList.add(tran5);
		transList.add(tran6);
		transList.add(tran7);
		
		transList2.add(tran2);
		transList2.add(tran3);
		transList2.add(tran4);
		
		transList3.add(tran8);
		transList3.add(tran9);
		transList3.add(tran10);
		
		transList4.add(tran11);
		transList4.add(tran12);
		transList4.add(tran13);
		
		transList5.add(tran14);
		transList5.add(tran15);
		transList5.add(tran16);
		
		
		AccountManagement acc1=new AccountManagement("100000123456", cust1, "br1001", "SAVINGS", "ACTIVE", 198550.26, 0.0, d5);
		acc1.setTxns(transList);
		
		AccountManagement acc2=new AccountManagement("100000989565", cust2, "br1002", "CURRENT", "ACTIVE", 305067.86, 0.0, d5);
		acc2.setTxns(transList2);
		
		AccountManagement acc3=new AccountManagement("100000123457", cust3, "br1003", "SAVINGS", "ACTIVE", 198550.26, 0.0, d5);
		acc3.setTxns(transList3);
		
		AccountManagement acc4=new AccountManagement("100000123458", cust4, "br1004", "CURRENT", "ACTIVE", 198550.26, 0.0, d5);
		acc4.setTxns(transList4);
		
		AccountManagement acc5=new AccountManagement("100000123459", cust5, "br1001", "SAVINGS", "ACTIVE", 198550.26, 0.0, d5);
		acc5.setTxns(transList5);
	
		accList.put(acc1.getAccountId(), acc1);
		accList.put(acc2.getAccountId(), acc2);
		accList.put(acc3.getAccountId(), acc3);
		accList.put(acc4.getAccountId(), acc4);
		accList.put(acc5.getAccountId(), acc5);


		

		
	}
}
