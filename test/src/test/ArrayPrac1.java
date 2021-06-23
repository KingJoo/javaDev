package test;

import java.util.Arrays;

public class ArrayPrac1 {
	public static void main(String[] args) {
		int[] arr= new int[5];
		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*101);
		System.out.println(Arrays.toString(arr));
		int total = 0;
		for(int a : arr) {
			System.out.printf("a = %d, total = %d\n",a,total);
			total+=a;
		}
		System.out.println("총합 : "+total);
		System.out.printf("평균 : %.2f",total/5d);
	}
}