package test;

import java.util.Arrays;

public class ArrayPrac3 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++)
			arr[i]=i;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<10;i++) {
			int n=(int)(Math.random()*10);
			arr[0]^=arr[n];
			arr[n]^=arr[0];
			arr[0]^=arr[n];
			System.out.println("바꿀 번째 : "+n);
			System.out.println(Arrays.toString(arr));
		}
	}
}
