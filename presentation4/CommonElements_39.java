package presentation4;

public class CommonElements_39 {
	public static void main(String[] args) {
		int[] a1 = { 5, 10, 15, 20, 25 };
		int[] a2 = { 10, 20, 30, 40, 50 };

		System.out.print("Common elements: {");
//        boolean first = true;

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					System.out.print("{ " + a1[i] + " }");
					break;
				}
			}
		}
	}
}