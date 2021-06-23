package test;

import java.util.Scanner;

public class _6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("양의 정수 10개 입력");
		for(int i=0;i<10;i++)
			a[i]=sc.nextInt();
		for(int i : a)
			if(i%3==0)	System.out.println(i);
	}
}
