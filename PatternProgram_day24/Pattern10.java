package PatternProgram_day24;

public class Pattern10 {

	public static void main(String[] args) {
		int n=5,i,j;
		for(i=1;i<=n;i++) {
			int c=1;
			for(j=1;j<=n+1;j++) {
				if(j%2!=0) {
					System.out.print(c+" ");
					c++;
				}
				/*else if(j==2 && i==n-1) {
					System.out.print(2+" ");
				}*/
				else {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}

	}

}
