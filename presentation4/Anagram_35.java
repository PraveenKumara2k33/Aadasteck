package presentation4;

import java.util.Scanner;

public class Anagram_35 {

	public static void main(String[] args) {

		Scanner ob = new Scanner(System.in);
		System.out.println("Enter two words");
		String s1 = ob.next();
		String s2 = ob.next();
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		int c = 0;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				char ch = s1.charAt(i);
				if (s2.indexOf(ch) > -1)
					if (s2.indexOf(ch) != s2.lastIndexOf(ch)) {
						c++;
						break;
					}
			}
			if (c == 0)
				System.out.println("words are anagram");
			else
				System.out.println("words are not anagram");
		} else
			System.out.println("words are not anagram");
		
		ob.close();

	}

}
