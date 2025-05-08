package presentation2;

public class PrimeNumberAvg_14 {

	public static void main(String[] args) {

		int sum = 0;
		int[] prime = new int[25]; // There are 25 primes <100
		int index = 0;

		for (int i = 2; i <= 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				prime[index++] = i;
				sum += i;
			}
		}

		System.out.println(sum); // Correct sum: 1060
		// To print array contents:
		for (int i = 0; i < index; i++) {
			System.out.print(prime[i] + " ");
		}

	}

}
