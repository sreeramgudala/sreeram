package com.capgemini.lpu.Exceptions;

public class AccountIdNullException extends Exception {

	@Override
	public String toString() {
		return "Entered account id is NULL";
	}
}