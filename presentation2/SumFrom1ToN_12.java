package presentation2;

import java.util.Scanner;

public class SumFrom1ToN_12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Input from user
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();

		// Calculate sum from 1 to n
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("Sum from 1 to " + n + " is: " + sum);

		scanner.close();

	}

}
