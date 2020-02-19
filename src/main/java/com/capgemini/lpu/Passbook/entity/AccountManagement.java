package com.capgemini.lpu.Passbook.entity;

/**
 * @author: G.Siva Sreeram<br/>
 * @Description: This is an entity class which contains respective account id details
 */

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class AccountManagement {
	private String accountId;
	private Customer accountholderId = new Customer();
	private String accountbranchId;
	private String accountType;
	private String accountStatus;
	private double accountBalance;
	private double accountInterest;
	private LocalDate lastUpdated;
	private List<Transaction> txns = new ArrayList<>();
	public AccountManagement (){
		
	}
	public AccountManagement(String accountId, Customer accountholderId, String accountbranchId,
			String accountType, String accountStatus, double accountBalance, double accountInterest, LocalDate lastUpdated) {
		super();
		this.accountId = accountId;
		this.accountholderId = accountholderId;
		this.accountbranchId = accountbranchId;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountBalance = accountBalance;
		this.accountInterest = accountInterest;
		this.lastUpdated = lastUpdated;
	}

	
	public String getAccountId() {
		return accountId;
	}
	public Customer getAccountholderId() {
		return accountholderId;
	}
	public String getAccountbranchId() {
		return accountbranchId;
	}

	public String getAccountType() {
		return accountType;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public double getAccountInterest() {
		return accountInterest;
	}
	public LocalDate getLastUpdated() {
		return lastUpdated;
	}


	public List<Transaction> getTxns() {
		return txns;
	}


	public void setTxns(List<Transaction> txns) {
		this.txns = txns;
	}
	

}
