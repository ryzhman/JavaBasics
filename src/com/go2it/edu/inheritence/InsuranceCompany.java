package com.go2it.edu.inheritence;

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
}
