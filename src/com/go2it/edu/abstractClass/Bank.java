package com.go2it.edu.abstractClass;

/**
 * @author Alex Ryzhkov
 */
public class Bank extends FinancialInstitution {
	private String ownerName;
	private int numberOfBranches;
	private boolean isInternational;

	public Bank() {
		System.out.println("Creating new bank");
	}

	public Bank(String title, String bankAccNumber, String ownerName, boolean isInternational) {
		super(title, bankAccNumber);
		System.out.println("Creating new bank with params");
		this.ownerName = ownerName;
		this.isInternational = isInternational;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getNumberOfBranches() {
		return numberOfBranches;
	}

	public void setNumberOfBranches(int numberOfBranches) {
		this.numberOfBranches = numberOfBranches;
	}

	public boolean isInternational() {
		return isInternational;
	}

	public void setInternational(boolean international) {
		isInternational = international;
	}

	@Override
	public double investFunds(double fundsToInvest) {
		double result = fundsToInvest + fundsToInvest * 0.1;
		System.out.println("Result of investments is - " + result);
		return result;
	}
}
