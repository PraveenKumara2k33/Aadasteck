package presentation4;

public class ArrayRotationUsingFormula_34 {

	// Function to print array
	public static void printArray(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	// Left rotation using formula
	public static void leftRotateFormula(int[] arr) {
		int len = arr.length;
		int mid = len / 2;
		int[] result = new int[len];

		for (int i = 0; i < len; i++) {
			int newIndex = (mid + i) % len;
			result[i] = arr[newIndex];
		}

		System.out.print("Left Rotation using formula: ");
		printArray(result);
	}

	// Right rotation using formula
	public static void rightRotateFormula(int[] arr) {
		int len = arr.length;
		int mid = len / 2;
		int[] result = new int[len];

		for (int i = 0; i < len; i++) {
			int newIndex = (i + len - mid) % len;
			result[i] = arr[newIndex];
		}

		System.out.print("Right Rotation using formula: ");
		printArray(result);
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7 };

		leftRotateFormula(input);
		rightRotateFormula(input);
	}
}