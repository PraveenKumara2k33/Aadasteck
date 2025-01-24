package PatternProgram_day24;

public class Pattern17 {

	public static void main(String[] args) {
		int n=5,i,j,c=1,k=1;
		for(i=1;i<=n;i++) {
			//c=i;
			c=k;
			for(j=1;j<=n;j++) {
				
				System.out.print(c+" ");
				c+=2;
			}
			k+=2;
			System.out.println();
		}
	}

}
