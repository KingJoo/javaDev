package test;

import java.util.Scanner;

public class Method2_score {
	static int[] input() {
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		String[] course = {"국어","영어","수학"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(course[i]+" 점수 입력 : ");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	static int sum(int[] arr) {
		int total=0;
		for(int i:arr)
			total+=i;
		return total;
	}
	static double avg(int[] arr) {
		return sum(arr)/(double)arr.length;
	}
	static char score(int[] arr) {
		return switch((int)avg(arr)/10) {
		case 10,9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};
	}
	static void print(int[] arr) {
		System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %c\n",sum(arr),avg(arr),score(arr));
	}
	public static void main(String[] args) {
		print(input());
	}
}
