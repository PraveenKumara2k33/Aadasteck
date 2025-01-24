package PatternProgram_day24;

public class Pattern45 {

	public static void main(String[] args) {
		
		int i,j,c=1,n=5;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(c+" ");
				c+=2;
			}
			System.out.println();
		}
	}

}
