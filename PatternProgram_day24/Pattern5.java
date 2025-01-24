package PatternProgram_day24;

public class Pattern5 {

	public static void main(String[] args) {
		
		int n=5,i,j;
		for(i=1;i<=n;i++) {
			for(j=n;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
