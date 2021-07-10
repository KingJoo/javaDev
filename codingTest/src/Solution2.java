
import java.util.Scanner;

class Solution2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			int r=0;
			String s=sc.next();
			for(int j=10;j>0;j--) {
				if(j%2==0&&s.substring(0,j>>1).equals(s.substring(j>>1,j))) {
					j>>=1;
					r=j;
					continue;
				}
				if(s.substring(0,j).equals(s.substring(j,j<<1)))	r=j;
			}
			System.out.println("#"+i+" "+r);
		}
	}
}