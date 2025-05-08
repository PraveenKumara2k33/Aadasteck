package presentation1;

public class SumOfDigits_9 {

	public static int sumOfDigits(int num) {

		if (num == 0) {
			return 0;
		}

		int lastDigit = num % 10;
		int remainingNumber = num / 10;
		return lastDigit + sumOfDigits(remainingNumber);
	}

	public static void main(String[] args) {

		int number = 12345;
		int result = sumOfDigits(number);
		System.out.println("Sum of digits of " + number + " is: " + result);

	}

}
