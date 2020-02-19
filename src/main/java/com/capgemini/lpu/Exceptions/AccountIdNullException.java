package com.capgemini.lpu.Exceptions;
/**
 * @author: G.Siva Sreeram<br/>
 * @Description: This is an exception for request if null 
 */

public class AccountIdNullException extends Exception {

	@Override
	public String toString() {
		return "Entered account id is NULL";
	}
}