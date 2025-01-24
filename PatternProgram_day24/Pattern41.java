package PatternProgram_day24;

public class Pattern41 {

	public static void main(String[] args) {
		
		int i,j,n=4,c=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}

	}

}
