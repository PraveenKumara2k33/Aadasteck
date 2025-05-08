package presentation3;

public class CountIntOccurence_33 {
	public static int CountOccurrence(int arr[], int target) {
		int count = 0;
		for (int element : arr) {
			if (element == target) {
				count++;
			}

		}
		return count;

	}

	public static void main(String args[]) {
		int myArray[] = { 1, 2, 3, 1, 1, 3 };
		int targetElement = 1;
		int Occurrence = CountOccurrence(myArray, targetElement);
		System.out.println(targetElement + "-" + Occurrence + "times");

		targetElement = 2;
		Occurrence = CountOccurrence(myArray, targetElement);
		System.out.println(targetElement + "-" + Occurrence + "times");

		targetElement = 3;
		Occurrence = CountOccurrence(myArray, targetElement);
		System.out.println(targetElement + "-" + Occurrence + "times");

	}

}