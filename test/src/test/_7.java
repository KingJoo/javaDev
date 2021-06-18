package test;

import java.util.Scanner;

public class _7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int n = sc.nextInt();
		System.out.println(n>=60?"합격":"불합격");
	}
}
