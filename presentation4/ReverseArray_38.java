package presentation4;

public class ReverseArray_38 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// Reverse using for loop (in-place)
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		// Print the result
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