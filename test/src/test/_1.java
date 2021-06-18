package test;

public class _1 {
	public static void main(String[] args) {
		int cnt=0, sum=0;
		for(int i=100;i<1000;i++) {
			if(i%7==0) {
				cnt++;
				sum+=i;
			}
		}
		System.out.println("7의 배수 갯수 : "+cnt+'\n'+"7의 배수 합 : "+sum);
	}
}
