package com.kec.eb.exception;

@SuppressWarnings("serial")

public class InvalidConnectionException extends Exception{
	
	public InvalidConnectionException() {
		super("Invalid ConnectionTypen");
	}
	
	public String toString() {
		return "Invalid ConnectionType";
	}
}