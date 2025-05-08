package presentation3;

public class FountNotFound_30 {
	public static void main(String[] args) {
		int a[] = { 1, 4, 6, 9, 6, 1 };
		boolean found = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 9) {
				found = true;
			}

			if (found) {
				System.out.println("Found");
			} else {
				System.out.println("Not Found");
			}
		}
	}
}