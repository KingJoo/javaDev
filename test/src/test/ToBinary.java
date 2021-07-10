package test;

import java.util.Scanner;

public class ToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수 입력 : ");
		int n=sc.nextInt();
		//System.out.println(Integer.toBinaryString(n));
		int[] binary = new int[32];
		int idx=32;
		while(n!=0) {
			binary[--idx]=n&1;
			n>>=1;
		}
		for(int i=0;i<binary.length;i++) {
			if(i%8==0&&i!=0)	System.out.print(" ");
			System.out.print(binary[i]);
		}
	}
}
