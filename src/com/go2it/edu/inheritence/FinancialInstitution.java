package com.go2it.edu.inheritence;

import java.util.Objects;

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

	@Override
	public String toString() {
		return "FinancialInstitution{" + "title='" + title + '\'' + ", bankAccNumber='" + bankAccNumber + '\''
				+ ", yearOfCreation=" + yearOfCreation + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		FinancialInstitution that = (FinancialInstitution) o;
		return Objects.equals(title, that.title) && Objects.equals(bankAccNumber, that.bankAccNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, bankAccNumber);
	}
}
