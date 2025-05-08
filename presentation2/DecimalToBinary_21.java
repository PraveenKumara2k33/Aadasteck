package presentation2;

public class DecimalToBinary_21 {
	public static void main(String[] args) {
		int decimal = 25; // You can change this value to test with other numbers

		String binary = decimalToBinary(decimal);
		System.out.println("Decimal: " + decimal);
		System.out.println("Binary format: " + binary);
	}

	public static String decimalToBinary(int decimal) {
		if (decimal == 0) {
			return "0";
		}

		StringBuilder binary = new StringBuilder();

		while (decimal > 0) {
			int remainder = decimal % 2;
			binary.insert(0, remainder);
			decimal = decimal / 2;
		}

		return binary.toString();
	}
}
