package PatternProgram_day24;

public class Pattern28 {

	public static void main(String[] args) {
		
		char i,j,n='E';
		for(i=n;i>='A';i--) {
			for(j='A';j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
