package PatternProgram_day24;

public class Pattern37 {

	public static void main(String[] args) {
		
		int i,j,n=5;
		for(i=n;i>=1;i--) {
			for(j=n;j>=i;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
