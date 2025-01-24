package PatternProgram_day24;

public class Pattern29 {

	public static void main(String[] args) {
		
		char i,j,n='E';
		for(i='A';i<=n;i++) {
			for(j=n;j>='A';j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
