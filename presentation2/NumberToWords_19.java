package presentation2;

public class NumberToWords_19 {

	static final String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	static final String[] tens = { "", // 0
			"", // 1
			"Twenty", // 2
			"Thirty", // 3
			"Forty", // 4
			"Fifty", // 5
			"Sixty", // 6
			"Seventy", // 7
			"Eighty", // 8
			"Ninety" // 9
	};

	public static String numberToWords(int num) {
		if (num < 20) {
			return units[num];
		} else if (num < 100) {
			return tens[num / 10] + (num % 10 != 0 ? " " + units[num % 10] : "");
		} else if (num == 100) {
			return "One Hundred";
		}
		return "";
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i + " = " + numberToWords(i));
		}
	}
}