package test;

import java.util.Scanner;

public class _8 {
	public static void main(String[] args) {
		String[] course = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int[] score = { 95, 88, 76, 62, 55 };
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("과목 이름 >> ");
			String cName = sc.next();
			if (cName.equals("그만"))		break;
			boolean ck = false;
			for (int i = 0; i < course.length; i++) {
				if (cName.equals(course[i])) {
					ck = true;
					System.out.println(cName + "의 점수는 " + score[i]);
					break;
				}
			}
			if(!ck)	System.out.println("없는 과목입니다.");
		}
	}
}
