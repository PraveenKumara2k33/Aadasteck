package presentation3;

public class ArrayComparison_31 {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 1, 2, 3, 4 };

		if (a1.length == a2.length) {
			int i;
			for (i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					break;
				}
			}

			if (i == a1.length) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else {
			System.out.println("false");
		}
	}
}