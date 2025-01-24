package PatternProgram_day24;

public class Pattern43 {

	public static void main(String[] args) {
		
		int i,j,n=5,k=0,c=0;
		for(i=1;i<=n;i++) {
			c=k+i;
			for(j=1;j<=i;j++) {
				
				System.out.print(c+" ");
				c+=2;
			}
			k++;
			System.out.println();
		}

	}

}
