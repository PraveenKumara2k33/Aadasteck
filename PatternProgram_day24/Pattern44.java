package PatternProgram_day24;

public class Pattern44 {

	public static void main(String[] args) {
		
		int i,j,n=4,k=0,c=0;
		for(i=1;i<=n;i++) {
			c+=k+i;
			//System.out.println("Before c: "+c);
			for(j=1;j<=i;j++) {
				
				System.out.print(c+" ");
				c--;
				
			}
			//System.out.println("After c: "+c);
			k++;
			System.out.println();
		}

	}

}
