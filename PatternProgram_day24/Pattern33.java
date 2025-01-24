package PatternProgram_day24;

public class Pattern33 {

	public static void main(String[] args) {
		
		for(char i='E';i>='A';i--) {
			char c=i;
			for(char j='A';j<='E';j++) {
				System.out.print(c+" ");
				c+=5;
			}
			System.out.println();
		}

	}

}
