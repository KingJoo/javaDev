package test;

import java.util.Arrays;

public class SelectionSort {//내림차순(DESC) , 오름차순(ASC)
	public static void main(String[] args) {
		final int N =5, LIMIT = 101;
		int[] arr = new int[N];
		
		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*LIMIT);
		
		System.out.println("정렬 전 상태 : "+Arrays.toString(arr));
		
		/*
		 * for(int i=0;i<arr.length-1;i++) for(int j=i+1;j<arr.length;j++)
		 * if(arr[i]>arr[j]) { //ASC //if(arr[i]<arr[j]) { //DESC arr[i]^=arr[j];
		 * arr[j]^=arr[i]; arr[i]^=arr[j]; }
		 */
		Arrays.sort(arr);//오름차순밖에 없어서 내림차순 출력할 때는 반대로 출력해야된다.
		System.out.println("정렬 후 상태 : "+Arrays.toString(arr));//배열 자체의 데이터 출력
	}
	
}
