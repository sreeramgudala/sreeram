package com.capgemini.lpu.Passbook.entity;

/**
 * @author: G.Siva Sreeram<br/>
 * @Description: This is an entity class which contains transaction details
 */

import java.time.LocalDate;

public class Transaction {

	private String transaccountId;
	private String transType;
	private double transAmount;
	private String transOption;
	private LocalDate transDate;
	private String transCheckid;
	private String transFrom;
	private String transTo;
	private double Closingbalance;
	public Transaction() {
		
	}
	public Transaction(String transaccountId, String transType, double transAmount, String transOption, LocalDate transDate,
			String transCheckid, String transFrom, String transTo, double closingbalance) {
		super();
		this.transaccountId = transaccountId;
		this.transType = transType;
		this.transAmount = transAmount;
		this.transOption = transOption;
		this.transCheckid = transCheckid;
		this.transFrom = transFrom;
		this.transTo = transTo;
		Closingbalance = closingbalance;
		this.transDate = transDate;
	}
	public String getTransaccountId() {
		return transaccountId;
	}
	public String getTransType() {
		return transType;
	}
	public double getTransAmount() {
		return transAmount;
	}
	public String getTransOption() {
		return transOption;
	}
	public String getTransCheckid() {
		return transCheckid;
	}
	public String getTransFrom() {
		return transFrom;
	}
	public String getTransTo() {
		return transTo;
	}
	public double getClosingbalance() {
		return Closingbalance;
	}
	public LocalDate getTransDate() {
		return transDate;
	}
	@Override
	public String toString() {
		
		return "transaccountId : "+transaccountId + "  transType : " +transType +"  transAmount : " +transAmount;
	}
	
	

}
