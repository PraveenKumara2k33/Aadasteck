package PatternProgram_day24;

public class Pattern39 {

	public static void main(String[] args) {
		
		int i,j,n=5;
		for(i=n;i>=1;i--) {
			int k=i;
			for(j=n;j>=i;j--) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}

	}

}
