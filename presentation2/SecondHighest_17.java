package presentation2;

public class SecondHighest_17 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 4, 45, 99 };

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num < first) {
				second = num;
			}
		}

		if (second == Integer.MIN_VALUE) {
			System.out.println("No second highest number found.");
		} else {
			System.out.println("Second highest number: " + second);
		}
	}
}