package library.text;

import java.util.*;
import java.text.*;

public class ChoiceFormatPrac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int math = sc.nextInt();
		System.out.println("총점 : " + (kor + eng + math));
		System.out.printf("평균 : %.2f\n", (kor + eng + math) / 3d);
		System.out.println("학점 : " + switch ((kor + eng + math) / 30) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		});
		double[] limits= {50,60,70,80,90};
		String[] grade= {"F","D","C","B","A"};
		ChoiceFormat cf = new ChoiceFormat(limits,grade);
		System.out.println("학점 : "+cf.format((kor + eng + math) / 3d));
	}
}