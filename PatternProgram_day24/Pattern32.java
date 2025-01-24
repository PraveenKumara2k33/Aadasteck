package PatternProgram_day24;

public class Pattern32 {

	public static void main(String[] args) {
		
		for(char i='A';i<='E';i++) {
			char c=i;
			for(char j='A';j<='E';j++) {
				System.out.print(c+" ");
				c+=5;
			}
			System.out.println();
		}

	}

}
