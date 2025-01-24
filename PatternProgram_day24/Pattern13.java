package PatternProgram_day24;

public class Pattern13 {

	public static void main(String[] args) {
		
		int n=5,i,j,k=10;
		for(i=1;i<=n;i++) {
			int f=i,t=0;
			t+=k;
			for(j=1;j<=n;j++) {
				if(j==1) {
					System.out.print(i+" ");
				}else if(j%2==0) {
					//t=t+k;
					System.out.print(t+" ");
					t=t+10;
				}else {
					f=f+10;
					System.out.print(f+" ");
				}
			}
			System.out.println();
			k--;
		}
		
	}

}
