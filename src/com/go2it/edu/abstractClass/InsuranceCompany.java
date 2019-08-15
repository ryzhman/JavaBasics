package com.go2it.edu.abstractClass;

/**
 * @author Alex Ryzhkov
 */
public class InsuranceCompany extends FinancialInstitution {
	private int numberOfInsuredCustomers;
	private double totalSumOfInsurancePayments;

	public InsuranceCompany() {
	}

	public InsuranceCompany(String title, String bankAccNumber){
		super(title, bankAccNumber);

//		this.setTitle(title);
//		this.setBankAccNumber(bankAccNumber);
	}

	public int getNumberOfInsuredCustomers() {
		return numberOfInsuredCustomers;
	}

	public void setNumberOfInsuredCustomers(int numberOfInsuredCustomers) {
		this.numberOfInsuredCustomers = numberOfInsuredCustomers;
	}

	public double getTotalSumOfInsurancePayments() {
		return totalSumOfInsurancePayments;
	}

	public void setTotalSumOfInsurancePayments(double totalSumOfInsurancePayments) {
		this.totalSumOfInsurancePayments = totalSumOfInsurancePayments;
	}

	@Override
	public double investFunds(double fundsToInvest) {
		double result = fundsToInvest + fundsToInvest * 0.05;
		System.out.println("Result of investments is - " + result);
		return result;
	}
}
