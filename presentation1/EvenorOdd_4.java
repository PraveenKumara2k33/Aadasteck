package presentation1;

import java.util.Scanner;

public class EvenorOdd_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		// With using conditional statement
		System.out.println("With using conditional statement");
		for (int i = 1; i <= n; i++) {
			String s = (i % 2 == 0) ? "Even" : "Odd";
			System.out.println(i + "-" + s);
		}
		System.out.println("Without using conditional statement result[i&2]");
		// Without using conditional statement
		String result[] = { "Even", "Odd" };
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "-" + result[i & 1]);
		}

		System.out.println("Without using conditional statement result[i%2]");
		// Without using conditional statement
//		String result[] = {"Even","Odd"};
		for (int i = 1; i <= n; i++) {
			int k = i % 2;
			System.out.println(i + "-" + result[k] + "-" + k);
		}
		sc.close();
	}

}
