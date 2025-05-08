package presentation3;

public class OddOneOut_32 {
	public static void main(String[] args) {
		// Array declaration and initialization
		String[] str = { "black", "black", "white", "black", "black" };

		// Frequency array
		int[] freq = new int[str.length];

		// Initialize frequency array
		for (int i = 0; i < str.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					freq[i]++;
					// Marking duplicate as visited
					str[j] = "";
				}
			}
		}

		// Find the element that occurs only once
		for (int i = 0; i < str.length; i++) {
			if (freq[i] == 1 && !str[i].equals("")) {
				System.out.println("Odd one out: " + str[i]);
				break;
			}
		}
	}
}