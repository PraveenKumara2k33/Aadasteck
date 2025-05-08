package presentation4;

public class SplitArrayManual_37 {

	public static void main(String[] args) {

		int[] input = { 2, 4, 6, 8, 10, 12, 14, 16 };

		int mid = input.length / 2;

		int[] firstHalf = new int[mid];
		int[] secondHalf = new int[input.length - mid];

		// Copy elements to first half
		for (int i = 0; i < mid; i++) {
			firstHalf[i] = input[i];
		}

		// Copy elements to second half
		for (int i = mid; i < input.length; i++) {
			secondHalf[i - mid] = input[i];
		}

		// Print the results
		System.out.print("First half: ");
		printArray(firstHalf);
		System.out.print("Second half: ");
		printArray(secondHalf);

	}

	// Helper method to print an array
	public static void printArray(int[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

}