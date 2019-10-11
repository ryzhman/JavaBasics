package com.go2it.edu.abstractClass;

/**
 * @author Alex Ryzhkov
 */
public interface PrivatePersonFinancing {
	double creditPerson(String name);

	default void returnCreditFromPrivatePerson(double sumToReturn){
		System.out.println(sumToReturn + " was withdrawn from the private person");
	}

}
