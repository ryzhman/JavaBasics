package com.go2it.edu.abstractClass;

/**
 * @author Alex Ryzhkov
 */
public class InsuranceCompany extends FinancialInstitution implements CoverLosses{
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

	@Override
	public double coverLoses(String nameOfCustomer, double sumToCover) {
		if (sumToCover > getSumToOperate()) {
			System.out.println(nameOfCustomer + " will get only " + (getSumToOperate() - 100));
			return getSumToOperate() - 100;
		} else {
			System.out.println(nameOfCustomer + " will get " + sumToCover);
			return sumToCover;
		}
	}
}
