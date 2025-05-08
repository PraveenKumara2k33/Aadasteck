package presentation3;

public class Calculator_24 {

	// Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    String add(String a, String b) {
        return a + b;
    }

    
	public static void main(String[] args) {
		
		Calculator_24 calc = new Calculator_24();

        System.out.println("Add 2 ints: " + calc.add(5, 10));
        System.out.println("Add 3 ints: " + calc.add(5, 10, 15));
        System.out.println("Add 2 doubles: " + calc.add(2.5, 3.7));
        System.out.println("Add 2 strings: " + calc.add("Java", "Program"));

	}

}
