package presentation1;

public class SwapWithoutTemp_6 {
	public static void main(String[] args) {
		int a = 5, b = 3;

		// Method 1: Using Arithmetic
		System.out.println("Before Arithmetic Swap: a = " + a + ", b = " + b);
		a = a + b; // a becomes 8
		b = a - b; // b becomes 5 (original a)
		a = a - b; // a becomes 3 (original b)
		System.out.println("After Arithmetic Swap:  a = " + a + ", b = " + b);

		// Resetting values
		a = 5;
		b = 3;

		// Method 2: Using XOR
		System.out.println("\nBefore XOR Swap:       a = " + a + ", b = " + b);
		a = a ^ b; // a becomes 6
		b = a ^ b; // b becomes 5 (original a)
		a = a ^ b; // a becomes 3 (original b)
		System.out.println("After XOR Swap:        a = " + a + ", b = " + b);
	}
}
