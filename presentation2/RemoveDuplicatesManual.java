package presentation2;

public class RemoveDuplicatesManual {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 4, 1, 5 };
		int n = arr.length;

		int[] duplicates = new int[n];
		int dupCount = 0;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			boolean alreadyAdded = false;

			// Check if arr[i] appears later in the array
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}

			// Check if we've already added this duplicate
			for (int k = 0; k < dupCount; k++) {
				if (arr[i] == duplicates[k]) {
					alreadyAdded = true;
					break;
				}
			}

			if (isDuplicate && !alreadyAdded) {
				duplicates[dupCount++] = arr[i];
			}
		}

		// Print duplicates
		System.out.print("Duplicate values: ");
		for (int i = 0; i < dupCount; i++) {
			System.out.print(duplicates[i] + " ");
		}
	}

}
