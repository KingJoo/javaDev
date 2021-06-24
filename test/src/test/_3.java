package test;

import java.util.Arrays;

public class _3 {

	static int[] getRand(int len) {
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * 101);
		return arr;
	}

	static boolean sort(int[] arr, String option) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = i + 1; j < arr.length; j++) {
				if (option.equals("ASC")) {
					if (arr[i] > arr[j]) {
						arr[i] ^= arr[j];
						arr[j] ^= arr[i];
						arr[i] ^= arr[j];
					}
				} else if (option.equals("DESC")) {
					if (arr[i] < arr[j]) {
						arr[i] ^= arr[j];
						arr[j] ^= arr[i];
						arr[i] ^= arr[j];
					}
				} else {
					System.out.print("sort(int[] arr, option<only \"ASC\" or \"DESC\">) ... ");
					return false;
				}
			}
		return true;
	}

	static void print(int[] arr, String s) {
		System.out.println(s + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = getRand(5);
		print(arr,"정렬 전 : ");
		if(sort(arr,"ASC")) print(arr,"오름차순 정렬 후 : ");
		else System.out.println("option error");
		if(sort(arr,"DESC")) print(arr,"내림차순 정렬 후 : ");
		else System.out.println("option error");
		if(!sort(arr,"???"))	System.out.println("option error");;
	}
}
