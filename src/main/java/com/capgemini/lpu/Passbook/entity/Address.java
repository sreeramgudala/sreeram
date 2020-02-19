package com.capgemini.lpu.Passbook.entity;

/**
 * @author: G.Siva Sreeram<br/>
 * @Description: This is an entity class which contains customer address
 */

public class Address {
	private String addressId;
	private String addressLine1;
	private String addressLine2;
	private String addressCity;
	private String addressState;
	private String addressCountry;
	private String addressZipcode;
	private Branch branch;
	public Address (){
		
	}
	public Address(String addressId, String addressLine1, String addressLine2, String addressCity, String addressState,
			String addressCountry, String addressZipcode, Branch branch) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressCountry = addressCountry;
		this.addressZipcode = addressZipcode;
		this.branch=branch;
	}
	public String getAddressId() {
		return addressId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public String getAddressState() {
		return addressState;
	}
	public String getAddressCountry() {
		return addressCountry;
	}
	public String getAddressZipcode() {
		return addressZipcode;
	}
	public Branch getBranch() {
		return branch;
	}
	
	

}
