package com.go2it.edu.inheritence;

/**
 * @author Alex Ryzhkov
 */
public class FinancialInstitution {
	private String title;
	private String bankAccNumber;
	private int yearOfCreation;

	public FinancialInstitution() {
		System.out.println("Creating financial institution");
	}

	public FinancialInstitution(String title, String bankAccNumber) {
		System.out.println("Creating financial institution with params");
		this.title = title;
		this.bankAccNumber = bankAccNumber;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public String getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(String bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}

	public int getYearOfCreation() {
		return yearOfCreation;
	}

	public void setYearOfCreation(int yearOfCreation) {
		this.yearOfCreation = yearOfCreation;
	}


}
