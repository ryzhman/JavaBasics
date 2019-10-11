package com.go2it.edu.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Alex Ryzhkov
 */
public class ExceptionExample {

	public static void main(String[] args) {
		try {
			try {
				ClassToThrowException testClass = new ClassToThrowException("testTitle");
				testClass.setTitle(null);

				System.out.println("It will not be executed");
			} catch (IllegalArgumentException e) {
				System.out.println("Oops! Exception was thrown: " + e.getMessage());
//			} catch (FileNotFoundException e) {
//				System.out.println("It was FileNotFoundException!");
			} catch (IOException e) {
				System.out.println("Some log");
			} catch (Exception e) {
				//exception logging
			} finally {
				System.out.println("This line will be shown");
			}
		} catch (Exception e) {
			System.out.println(Arrays.toString(e.getSuppressed()));
		}
		System.out.println("After try-catch-finally");
	}
}
