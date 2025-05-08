package presentation1;

import java.util.Scanner;

public class FactorialCalculator_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Input from user
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Check for negative input
		if (number < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
		} else {
			long factorial = 1;
			for (int i = 1; i <= number; i++) {
				factorial *= i;
			}
			System.out.println("Factorial of " + number + " is: " + factorial);
		}
		scanner.close();
	}

}
