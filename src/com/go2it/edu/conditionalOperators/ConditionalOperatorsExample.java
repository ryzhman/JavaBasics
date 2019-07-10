package com.go2it.edu.conditionalOperators;

import com.go2it.edu.enums.EnumExample;

/**
 * @author Alex Ryzhkov
 */
public class ConditionalOperatorsExample {
	public static void main(String[] args) {
		int i = 0;
		int j = 2;
		int x = 1;

//		System.out.println("Before if");
//		if (i == j) {
//			System.out.println("Two numbers (i and j) are equal, " + i + "," + j);
//		} else if (i == x) {
//			System.out.println("Two numbers (i and x) are equal, " + i + "," + x);
//		} else if (x == j) {
//			System.out.println("Two numbers (j and x) are equal, " + j + "," + x);
//		} else {
//			System.out.println("All the numbers are different");
//		}
//		System.out.println("After if");

		char letter = 'b';
		switch (letter) {
			case 'a': {
				System.out.println("This is A");
				break;
			}
			case 'b': {
				System.out.println("This is B");
				break;
			}
			default: {
				System.out.println("This is unknown letter");
				break;
			}
		}



	}

}
