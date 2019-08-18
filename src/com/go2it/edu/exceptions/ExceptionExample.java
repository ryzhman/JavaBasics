package com.go2it.edu.exceptions;

/**
 * @author Alex Ryzhkov
 */
public class ExceptionExample {

	public static void main(String[] args){
		ClassToThrowException testClass = new ClassToThrowException("testTitle");
		testClass.setTitle(null);

		System.out.println("It will not be executed");
	}
}
