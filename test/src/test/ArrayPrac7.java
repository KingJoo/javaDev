package test;

import java.util.Arrays;

public class ArrayPrac7 {
	public static void main(String[] args) {
		final int N=10;
		int[] arr = new int[N], cnt = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
			cnt[arr[i]]++;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
			System.out.println(i+"의 갯수 : "+cnt[i]);
	}
}
