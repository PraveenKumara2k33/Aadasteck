package presentation3;

public class ShuttleSortDescending_23 {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 5, 6, 9, 7 };
		int[] array2 = { 3, 4, 12, 10 };

		// Manual merge
		int totalLength = array1.length + array2.length;
		int[] mergedArray = new int[totalLength];
		int index = 0;

		// Copy elements from array1
		for (int i = 0; i < array1.length; i++) {
			mergedArray[index] = array1[i];
			index++;
		}

		// Copy elements from array2
		for (int i = 0; i < array2.length; i++) {
			mergedArray[index] = array2[i];
			index++;
		}

		// Sort using shuttle sort in descending order
		shuttleSortDescending(mergedArray);

		// Print the sorted array
		System.out.println("Sorted Array in Descending Order:");
		for (int i = 0; i < mergedArray.length; i++) {
			System.out.print(mergedArray[i] + " ");
		}
	}

	// Shuttle sort algorithm in descending order
	public static void shuttleSortDescending(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j] > arr[j - 1]) {
				// Swap
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}

	}

}