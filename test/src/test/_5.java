package test;

public class _5 {
	public static void main(String[] args) {
		int sum7=0, sum9=0;
		for(int i=1;i<=1000;i++) {
			if(i%7==0)	sum7+=i;
			if(i%9==0)	sum9+=i;
		}
		System.out.println("7의 배수 : "+sum7+'\n'+"9의 배수 : "+sum9+'\n'+"7의 배수 + 9의 배수 : "+(sum7+sum9));
	}
}
