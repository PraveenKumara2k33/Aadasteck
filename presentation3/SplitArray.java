package presentation3;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		
		int[] inputArray = {2, 4, 6, 8, 10, 12, 14, 16};

        int midPoint = inputArray.length / 2;

        int[] firstHalf = Arrays.copyOfRange(inputArray, 0, midPoint);
        int[] secondHalf = Arrays.copyOfRange(inputArray, midPoint, inputArray.length);

        System.out.println("First Half: " + Arrays.toString(firstHalf));
        System.out.println("Second Half: " + Arrays.toString(secondHalf));

	}

}
