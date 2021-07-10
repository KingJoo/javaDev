package test;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		final int N = 20, LIMIT = 26;
		int[] arr = new int[N];// int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++)
			arr[i] = (char) (Math.random() * LIMIT);// arr[i] = (int) (Math.random() * LIMIT);

		System.out.println("정렬 전 상태 : " + Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - 1 - i; j++)
				if (arr[j] > arr[j + 1]) {
					arr[j] ^= arr[j+1];
					arr[j+1] ^= arr[j];
					arr[j] ^= arr[j+1]; // System.out.println(Arrays.toString(arr));
				}

		// Arrays.sort(arr);//오름차순밖에 없어서 내림차순 출력할 때는 반대로 출력해야된다.
		System.out.println("정렬 후 상태 : " + Arrays.toString(arr));// 배열 자체의 데이터 출력
	}
}
