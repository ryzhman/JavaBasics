package com.go2it.edu.classes;

/**
 * @author Alex Ryzhkov
 */
public class ClassesExample {

	public static void main(String[] args) {
		Boat smallYacht = new Boat();
		smallYacht.setTitle("Victory");
		smallYacht.setHasSail(true);
		//		Boat smallYacht = new Boat("Victory");
		//		smallYacht.title = "Victory";
		System.out.println("Small yacht= " + smallYacht.getTitle() + ", does it have sail - " + smallYacht.isHasSail());

		Boat cruiseLiner = new Boat();
		cruiseLiner.setTitle("Grand Elizabeth");
		cruiseLiner.setHasSail(false);
		System.out.println("Cruise liner = " + cruiseLiner.getTitle() + ", does it have sail - " + cruiseLiner.isHasSail());

	}

}
