package PatternProgram_day24;

public class RightReverse {

	public static void main(String[] args) {
		
		int n=5;
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=n;j++){
				if(j<=(n+1-i) && i<=n/2) {
					System.out.print("* ");
				}else if(i>n/2) {
					System.out.print("1 ");
				}
			}
			System.out.println("");
		}
	}

}
