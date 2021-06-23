package test;

import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Year : ");
		int year = sc.nextInt();
		boolean yoon = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? true : false;
		int month = 0, day = 0;
		System.out.print("Month(1~12) : ");
		while (true) {
			month = sc.nextInt();
			day = switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> 31;
			case 4, 6, 9, 11 -> 30;
			case 2 -> yoon ? 29 : 28;
			default -> 0;
			};
			if (day != 0)	break;
			else System.out.print("Month(1~12) 재입력 : ");
		}
		System.out.printf("%d년 %d월은 %d일까지 있다.\n", year, month, day);

	}
}
