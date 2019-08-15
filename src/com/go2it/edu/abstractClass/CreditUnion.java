package com.go2it.edu.abstractClass;

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

	@Override
	public double investFunds(double fundsToInvest) {
		double result = fundsToInvest + fundsToInvest * 0.07;
		System.out.println("Result of investments is - " + result);
		return result;
	}
}
