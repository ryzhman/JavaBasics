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
	public double coverClientLoses(String nameOfCustomer, double requestedSumToCover) {
		double availableSum = getSumToOperate();
		if (requestedSumToCover > availableSum) {
			//calculate the sum that we can pay to customer without the risk of going bankrupt
			double sumToPayToCustomer = availableSum - 100;
			System.out.println(nameOfCustomer + " will get only " + sumToPayToCustomer);

			//before paying off loses to the customer, we need to update our balance with a new value
			setSumToOperate(availableSum - sumToPayToCustomer);

			return sumToPayToCustomer;
		} else {
			System.out.println(nameOfCustomer + " will get " + requestedSumToCover);

			//before paying off loses to the customer, we need to update our balance with a new value
			setSumToOperate(availableSum - requestedSumToCover);
			return requestedSumToCover;
		}
	}
}
