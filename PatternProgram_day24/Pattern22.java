package PatternProgram_day24;

public class Pattern22 {

	public static void main(String[] args) {
		
		int n=5,i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i%2==0) {
					System.out.print(1+" ");
				}else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}

	}

}
