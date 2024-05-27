package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program170_171 {

	public static void main(String[] args) {

		method1();

		System.out.println("Finished");

	}

	public static void method1() {
		System.out.println("***Method 1 started***");
		method2();
		System.out.println("***Method 1 finished***");
	}

	public static void method2() {
		System.out.println("***Method 2 started***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("You have only use numbers, not words:");
		}
		sc.close();
		System.out.println("***Method 2 finished***");

	}

}
