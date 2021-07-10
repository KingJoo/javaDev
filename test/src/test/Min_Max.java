package test;

import java.util.Arrays;

public class Min_Max {
	
	static int[] input() {
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*100)+1;
		return arr;
	}
	
	static int max(int[] arr) {
		int mx=Integer.MIN_VALUE;
		for(int a:arr)
			if(a>mx)	mx=a;
		return mx;
	}
	
	static int min(int[] arr) {
		int mn=Integer.MAX_VALUE;
		for(int a:arr)
			if(a<mn)	mn=a;
		return mn;
	}
	
	public static void main(String[] args) {
		int[] a = input();
		System.out.println(Arrays.toString(a));
		System.out.println("최소값 : "+min(a));
		System.out.println("최대값 : "+max(a));
	}
}
