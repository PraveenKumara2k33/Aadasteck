package PatternProgram_day24;

public class Pattern31 {

	public static void main(String[] args) {
		
		
		for(char i='A';i<='E';i++) {
			char c= i;
			for(char j='A';j<='E';j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}

	}

}
