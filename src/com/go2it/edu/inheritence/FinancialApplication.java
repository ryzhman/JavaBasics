package com.go2it.edu.inheritence;

/**
 * @author Alex Ryzhkov
 */
public class FinancialApplication {
	public static void main(String[] args) {
		FinancialInstitution bankOfAmerica1 = new FinancialInstitution("Bank of America", "123ABC");
		FinancialInstitution bankOfAmerica2 = new FinancialInstitution("Bank of America", "123ABC");


		System.out.println(bankOfAmerica1.equals(bankOfAmerica2));
	}
}
