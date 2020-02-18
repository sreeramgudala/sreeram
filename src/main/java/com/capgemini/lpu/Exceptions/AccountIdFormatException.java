package com.capgemini.lpu.Exceptions;

public class AccountIdFormatException extends Exception {

	@Override
	public String toString() {
		return "Entered account format is wrong";
	}
}