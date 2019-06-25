package com.go2it.edu.methods;

/**
 * @author Alex Ryzhkov
 */
public class MethodsExamples {
	public static void main(String[] args) {
		iterateForNumberOfTimes(3);
	}

	public static void iterateForNumberOfTimes(int numberOfIterations){
		for (int i = 0; i < numberOfIterations; i++) {
			System.out.println(prepareStringForOutput(i));
		}
	}

	public static String prepareStringForOutput(int i){
		return "Current number is-" + i;
	}

}
