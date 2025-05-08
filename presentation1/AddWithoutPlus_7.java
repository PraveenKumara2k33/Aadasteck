package presentation1;

public class AddWithoutPlus_7 {

	public static int add(int a, int b) {
		while (b != 0) {
			int carry = a & b; // Carry bits
			a = a ^ b; // Sum without carry
			b = carry << 1; // Shift carry to left
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 15;
		int y = 27;
		int result = add(x, y);
		System.out.println("Sum is: " + result);

	}

}
