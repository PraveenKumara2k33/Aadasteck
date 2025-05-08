package presentation2;

public class UniqueValues_15 {

	public static void main(String[] args) {

		int[] numbers = { 4, 5, 7, 4, 2, 7, 9, 1, 2 };
		int n = numbers.length;
//        int k=0;
//        int[] uniques = new int[n];

		System.out.print("Unique values in the array: ");
		for (int i = 0; i < n; i++) {
			boolean isUnique = true;

			// Compare with every other element
			for (int j = 0; j < n; j++) {
				if (i != j && numbers[i] == numbers[j]) {
					isUnique = false;
					break;
				}
			}

			if (isUnique) {
//            	uniques[k++]=numbers[i];
				System.out.print(numbers[i] + " ");
			}
		}
		/*
		 * for(int i=0;i<k;i++) { System.out.print(uniques[i]+" "); }
		 */
	}
}
