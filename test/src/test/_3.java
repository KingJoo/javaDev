package test;

public class _3 {
	public static void main(String[] args) {
		int even=0, odd=0;
		for(int i=1;i<=30;i++) {
			if(i%2==1)	odd+=i;
			else	even+=i;
		}
		System.out.println("짝수합 : "+even+'\n'+"홀수합 : "+odd);
	}
}
