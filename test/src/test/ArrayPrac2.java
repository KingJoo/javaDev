package test;

import java.util.Arrays;

public class ArrayPrac2 {
	public static void main(String[] args) {
		int[] arr= new int[7];
		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*101);
		System.out.println(Arrays.toString(arr));
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int a : arr) {
			if(max<a)	max = a;
			if(min>a)	min = a;
		}
		System.out.println("최대값 : "+max + "\n"+"최소값 : "+min);
	}
}
