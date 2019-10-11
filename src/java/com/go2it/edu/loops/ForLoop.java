package com.go2it.edu.loops;

/**
 * @author Alex Ryzhkov
 */
public class ForLoop {

	public static void main(String[] args) {
		//		for(int i=0, j=10;; i++, System.out.println(i)){
		//			if (i == 5) {
		//				System.out.println("I is 5. Skipping the value");
		//				continue;
		//			}
		//			System.out.println("Current values if i- " + i + ", current value of j -" + j);
		//
		//			if (j == 0) {
		//				System.out.println("J is 0. Break the loop");
		//				break;
		//			}
		//		}

		//		int i = 0;
		//		for (; ; ) {
		//			System.out.println(i++);
		//			if (i == 10) {
		//				break;
		//			}
		//		}

		int[] array = { 10, 2, 20, 123 };
		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
