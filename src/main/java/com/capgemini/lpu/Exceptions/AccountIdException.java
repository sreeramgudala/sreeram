package com.capgemini.lpu.Exceptions;

public class AccountIdException extends Exception {

	@Override
	public String toString() {
		return "Entered account id is not valid";
	}
}
