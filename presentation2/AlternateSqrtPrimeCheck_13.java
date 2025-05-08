package presentation2;

public class AlternateSqrtPrimeCheck_13 {

	// Function to manually calculate integer square root
	static int getSqrtInt(int number) {
		for (int i = 1; i <= number; i++) {
			if (i * i > number)
				return i - 1;
		}
		return 0;
	}

	// Function to check if a number is prime
	static boolean checkPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	// Function to display all factors of a number
	static void showFactors(int num) {
		System.out.print("Factors of " + num + ": ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(i + " ");
		}
		System.out.println();
	}

	// Main function
	public static void main(String[] args) {
		int n = 121; // Try changing this number

		int sqrt = getSqrtInt(n);
		int target = sqrt - 1;

		System.out.println("Integer square root of " + n + " = " + sqrt);
		System.out.println("Target (sqrt - 1) = " + target);

		if (checkPrime(target)) {
			System.out.println(target + " is a prime number.");
		} else {
			System.out.println(target + " is not a prime number.");
			showFactors(target);
		}
	}
}