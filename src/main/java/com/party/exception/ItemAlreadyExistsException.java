package com.party.exception;

public class ItemAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ItemAlreadyExistsException(String msg) {
		super(msg);
	}
}
