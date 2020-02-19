package com.capgemini.lpu.Exceptions;
/**
 * @author: G.Siva Sreeram<br/>
 * @Description: This is an exception for request wrong format Id 
 */

public class AccountIdFormatException extends Exception {

	@Override
	public String toString() {
		return "Entered account format is wrong";
	}
}