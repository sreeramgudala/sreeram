package com.capgemini.lpu.Exceptions;

/**
 * @author: G.Siva Sreeram <br/>
 * @Description: This is an exception for request invalid Date 
 */

public class DateException extends Exception {

	@Override
	public String toString() {
		return "Date is invalid";
	}
}