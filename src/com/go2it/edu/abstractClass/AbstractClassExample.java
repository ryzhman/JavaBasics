package com.go2it.edu.abstractClass;

/**
 * @author Alex Ryzhkov
 */
public class AbstractClassExample {
	public static void main(String[] args) {
		FinancialInstitution rbcBank = new Bank();
		rbcBank.addFundsToSumToOperate(100);
		rbcBank.addFundsToSumToOperate(33);
		rbcBank.investFunds(70);

		FinancialInstitution aaaInsurance= new InsuranceCompany();
		aaaInsurance.addFundsToSumToOperate(150);
		aaaInsurance.addFundsToSumToOperate(66);
		aaaInsurance.investFunds(70);
	}

}
