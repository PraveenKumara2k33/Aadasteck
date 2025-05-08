package presentation4;

public class FindPairs_36 {
	public static void main(String[] args) {
		int[] input = { 5, 8, 3, 4, 12, 17, 15, 16 };
		int len = input.length;
		int[] pairs = new int[len];
		int index = 0;
		for (int i = 0; i < len / 2; i++) {
			for (int j = 4; j < len; j++) {
				if (input[i] + input[j] == 20) {
					pairs[index++] = input[i];
					pairs[index++] = input[j];
				}
			}
		}
		for (int i = 0; i < len; i += 2) {
			System.out.print("{" + pairs[i] + "," + pairs[i + 1] + "}");
			if (i < (len / 2) - 2) {
				System.out.print(",");
			}
		}
	}
}