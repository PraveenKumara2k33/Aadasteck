package PatternProgram_day24;

public class Pattern11 {

	public static void main(String[] args) {
		int n=5,i,j;
		for(i=1;i<=n;i++) {
			int c=1;
			for(j=1;j<=n+1;j++) {
				if(j%2==0) {
					System.out.print(c+" ");
					c++;
				}
				else {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}

}
