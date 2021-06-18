package test;

public class _2 {
	public static void main(String[] args) {
		int cnt=0, sum=0;
		for(int i=100;i<1000;i++) {
			if(i%4!=0) {
				cnt++;
				sum+=i;
			}
		}
		System.out.println("갯수 : "+cnt+'\n'+"합 : "+sum);
	}
}
