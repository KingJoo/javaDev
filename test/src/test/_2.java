package test;

import java.util.Scanner;

public class _2 {
	
	static int input() {
		Scanner sc= new Scanner(System.in);
		System.out.print("32비트 범위의 정수 입력 : ");
		return sc.nextInt();
	}
	
	static int[] toBinary(int n) {
		int[] arr = new int[32];
		for (int i = 31; i >= 0; i--) {
			if (n == 0)
				break;
			arr[i] = n & 1;
			n >>= 1;
		}
		return arr;
	}

	static void printBinary(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i != 0 && i % 8 == 0)
				System.out.print(' ');
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		printBinary(toBinary(input()));
	}
}
