package presentation2;

public class PalindromeChecker_18 {

	public static void main(String[] args) {

		String input = "Hello";
		String str = "", sorted = "";

		// Convert to lowercase & remove spaces manually
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch != ' ') {
				// Convert uppercase to lowercase
				if (ch >= 'A' && ch <= 'Z') {
					ch += 32;
				}
				str += ch;
			}
		}

		// Check if the string is a palindrome
		boolean isPalin = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				isPalin = false;
				break;
			}
		}

		if (isPalin) {
			System.out.println("Palindrome");
		} else {
			// Convert string to character array
			char[] chArr = str.toCharArray();

			// Sort using bubble sort
			for (int i = 0; i < chArr.length - 1; i++) {
				for (int j = 0; j < chArr.length - 1 - i; j++) {
					if (chArr[j] > chArr[j + 1]) {
						char temp = chArr[j];
						chArr[j] = chArr[j + 1];
						chArr[j + 1] = temp;
					}
				}
			}

			// Convert sorted array back to string
			for (char c : chArr) {
				sorted += c;
			}

			System.out.println("Not a palindrome");
			System.out.println("Sorted: " + sorted);

		}
	}
}