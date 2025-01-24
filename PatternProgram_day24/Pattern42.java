package PatternProgram_day24;

public class Pattern42 {

	public static void main(String[] args) {
		
		int i,j,n=5;
		for(i=1;i<=n;i++) {
			int k=i;
			for(j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}

	}

}
