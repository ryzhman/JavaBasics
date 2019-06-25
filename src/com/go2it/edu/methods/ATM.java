package com.go2it.edu.methods;

/**
 * @author Alex Ryzhkov
 */
public class ATM {
	private int sumInATM = 400;

	private static final String ccNumber1 = "1234 1234 1234 9999";
	private static final String ccPin1 = "012";
	private static int ccBalance1 = 100;

	private static final String ccNumber2 = "1234 1234 1234 0000";
	private static final String ccPin2 = "345";
	private static int ccBalance2 = 350;

	private static int totalNumberOfWithdraws = 0;

	private static void increaseTheTotalWithdrawNumber() {
		totalNumberOfWithdraws++;
	}

	public int getSumInATM() {
		return sumInATM;
	}

	public static int getTotalNumberOfWithdraws() {
		return totalNumberOfWithdraws;
	}

	public int withdrawCashFromCreditCard(String cardNumber, String pin, int sumToWithDraw) {
		if (sumToWithDraw <= 0) {
			System.out.println("Sum to withdraw is invalid");
			return 0;
		}
		if (cardNumber.equals(ccNumber1)) {
			if (ccPin1.equals(pin)) {
				if (sumToWithDraw <= ccBalance1) {
					if (sumInATM > sumToWithDraw) {
						sumInATM -= sumToWithDraw;
						ccBalance1 -= sumToWithDraw;
						System.out.println(sumToWithDraw + " was withdrawn successfully");
						increaseTheTotalWithdrawNumber();
						return sumToWithDraw;
					} else {
						System.out.println("THere is no enough money in this ATM. ");
					}
				}
				System.out.println("Sum exceeds the balance");
			} else {
				System.out.println("Pin is incorrect");
			}
		} else if (cardNumber.equals(ccNumber2)) {
			if (ccPin2.equals(pin)) {
				if (sumToWithDraw <= ccBalance2) {
					if (sumInATM > sumToWithDraw) {
						sumInATM -= sumToWithDraw;
						ccBalance2 -= sumToWithDraw;
						System.out.println(sumToWithDraw + " was withdrawn successfully");
						increaseTheTotalWithdrawNumber();
						return sumToWithDraw;
					} else {
						System.out.println("THere is no enough money in this ATM. ");
					}				}
				System.out.println("Sum exceeds the balance");
			} else {
				System.out.println("Pin is incorrect");
			}
		} else {
			System.out.println("Cc number was not found");
		}
		return 0;
	}

	public static void main(String[] args) {
		ATM atmWeWantToUse = new ATM();
		ATM atmWeWantToUse2 = new ATM();
		//second card, balance = 350
		atmWeWantToUse.withdrawCashFromCreditCard("1234 1234 1234 0000", "345", 1);
		System.out.println(atmWeWantToUse.getSumInATM());
		atmWeWantToUse.withdrawCashFromCreditCard("1234 1234 1234 0000", "345", 200);
		System.out.println(atmWeWantToUse.getSumInATM());
		atmWeWantToUse.withdrawCashFromCreditCard("1234 1234 1234 0000", "345", 100);
		System.out.println(atmWeWantToUse.getSumInATM());

		atmWeWantToUse2.withdrawCashFromCreditCard("1234 1234 1234 0000", "345", 349);
		System.out.println(atmWeWantToUse.getSumInATM());

		//first card, balance = 100
		atmWeWantToUse.withdrawCashFromCreditCard("1234 1234 1234 9999", "012", 100);

		System.out.println();
//		atmWeWantToUse2.withdrawCashFromCreditCard("1234 1234 1234 9999", "012", 50);
//		atmWeWantToUse2.withdrawCashFromCreditCard("1234 1234 1234 9999", "012", 1);
//		atmWeWantToUse2.withdrawCashFromCreditCard("1234 1234 1234 9999", "012", 100);

		System.out.println("The number of times ATM was used = " + getTotalNumberOfWithdraws());
	}
}
