package test;

import java.util.Arrays;

public class _10 {
	public static void main(String[] args) {
		final int N = 5, LIMIT = 101;
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * LIMIT);
		System.out.println("===== 정렬전 =====");
		for(int a : arr)
			System.out.print(a+" ");
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - 1 - i; j++)
				if (arr[j] > arr[j + 1]) {
					arr[j] ^= arr[j+1];
					arr[j+1] ^= arr[j];
					arr[j] ^= arr[j+1];
				}
		System.out.println("\n===== 정렬후 =====");
		for(int a : arr)
			System.out.print(a+" ");
	}
}
