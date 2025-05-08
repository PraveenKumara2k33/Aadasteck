package presentation4;

public class FactorialSeriesSum_41 {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / factorial(i);
        }

        System.out.println("Sum of the series: " + sum);
    }

	public static long factorial(int num) {
		long fact = 1;
		for (int i = 2; i <= num; i++) {
	        fact *= i;
	    }
		return fact;
	}   
}