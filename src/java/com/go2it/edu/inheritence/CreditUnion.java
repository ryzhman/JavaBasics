package com.go2it.edu.inheritence;

/**
 * @author Alex Ryzhkov
 */
public class CreditUnion extends FinancialInstitution {
	private int numberOfMembers;

	public CreditUnion() {
	}

	public CreditUnion(String title, String bankAccNumber) {
		super(title, bankAccNumber);
	}

	public int getNumberOfMembers() {
		return numberOfMembers;
	}

	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}
}
