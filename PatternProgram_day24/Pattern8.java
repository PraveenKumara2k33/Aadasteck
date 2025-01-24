package PatternProgram_day24;

public class Pattern8 {

	public static void main(String[] args) {
		
		int n=5,i,j,c=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				
				System.out.print((c*2)+" ");
				c++;
			}
			System.out.println();
		}

	}

}
