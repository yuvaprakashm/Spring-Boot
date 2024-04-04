package com.javatpoint.model;

public class Account {
	private String accountNumber;
	private String accountType;

	public Account(String accountNumber, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}
@Override
public String toString() {
	return "Account [accountNumber=" + accountNumber+ ", accountType=" + accountType + "]"; 
}
}
