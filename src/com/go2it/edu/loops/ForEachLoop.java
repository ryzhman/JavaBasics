package com.go2it.edu.loops;

/**
 * @author Alex Ryzhkov
 */
public class ForEachLoop {

	public static void main(String[] args) {
		String[] strArr = { "Mon", "Tue", "Wed" };
		for (String i : strArr) {
			if (i.equals("Tue")){
				System.out.println("This is Tue");
//				break;
				continue;
			}
			System.out.println(i);
		}
	}

}
