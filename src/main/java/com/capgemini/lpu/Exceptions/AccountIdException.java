package com.capgemini.lpu.Exceptions;

/**
 * @author: G.Siva Sreeram<br/>
 * @Description: This is an exception for request invalid Id 
 */

public class AccountIdException extends Exception {

	@Override
	public String toString() {
		return "Entered account id is not valid";
	}
}
