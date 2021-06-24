package test;

import java.util.Scanner;

public class _4 {
	static int input() {
		System.out.print("년도 입력 : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	static boolean yoon(int year) {
		if(year%4==0&&year%100!=0||year%400==0)	return true;
		return false;
	}
	static void print(int year, boolean yoon) {
		if(yoon)	System.out.println(year+"년도는 윤년입니다.");
		else	System.out.println(year+"년도는 윤년이 아닙니다.");
	}
	
	public static void main(String[] args) {
		int year = input();
		print(year,yoon(year));
	}
}
