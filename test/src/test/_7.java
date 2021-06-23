package test;

import java.util.Arrays;

public class _7 {
	public static void main(String[] args) {
		int[] a= new int[10];
		for(int i=0;i<a.length;i++)
			a[i]=(int)(Math.random()*10)+1;
		System.out.println(Arrays.toString(a));
		int sum=0;
		for(int i : a)
			sum+=i;
		System.out.printf("평균 : %.2f",sum/10d);
	}
}
