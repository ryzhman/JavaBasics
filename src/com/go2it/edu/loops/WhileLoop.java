package com.go2it.edu.loops;

/**
 * @author Alex Ryzhkov
 */
public class WhileLoop {

	public static void main(String[] args) {

		boolean condition = false;
		int i = 0;
		while (condition) {
			if (i == 3) {
				System.out.println("I is 3, skipping it");
				i++;
				continue;
			}
			System.out.println(i);

			if (i == 10) {
				System.out.println("I is 10");
//				break;
				condition = false;
			}
			i++;
		}

	}

}
