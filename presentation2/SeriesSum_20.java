package presentation2;

public class SeriesSum_20 {

	public static void main(String[] args) {
		int n = 5;
		int term = 0;
		int sum = 0;

		for (int i = 1; i <= n; i++) {

			term = term * 10 + 3;
			sum += term;
			System.out.println("Term " + i + ": " + term);
		}

		System.out.println("Sum of the series is: " + sum);
	}
}