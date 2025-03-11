package com.mph.exception;

public class UserNotFoundException extends Exception {
	public UserNotFoundException() {
		System.out.println("UNF Constr...");
	}
	public UserNotFoundException(String message) {
		super(message);
		System.out.println("UNF :"+message);
	}
	@Override
	public String toString() {
		return "UserNotFoundException [toString()=" + super.toString() + "]";
	}
}
