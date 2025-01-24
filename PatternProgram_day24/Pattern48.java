package PatternProgram_day24;

public class Pattern48 {

	public static void main(String[] args) {
		
		int i,j,n=5,k=n,c=1,t,f=0;
		for(i=n;i>=1;i--) {
			t=i;
			f=c-t;
			for(j=n;j>=i;j--) {
				
				if(j==n) {
					System.out.print(c+" ");
				}
				else {
					
					System.out.print(f+" ");
					t++;
					f-=t;
				}
				
			}
			c+=k;
			k--;
			System.out.println();
		}

	}

}
