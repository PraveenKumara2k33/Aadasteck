package PatternProgram_day24;

public class Pattern12 {

	public static void main(String[] args) {
		int n=5,i,j;
		
		for(i=1;i<=n;i++) {
			int c=i;
			for(j=1;j<=n;j++) {
				
				System.out.print(c+" ");
				c+=5;
			}
			System.out.println();
		}
	}

}
