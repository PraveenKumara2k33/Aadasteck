package PatternProgram_day24;

public class Pattern30 {

	public static void main(String[] args) {
		
		int i,j,n=5;
		char c='A';
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print(c+" ");
				c++;
			}
			
			System.out.println();
		}

	}

}
