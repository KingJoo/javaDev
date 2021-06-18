package test;

import java.util.Scanner;

public class StringArr가위바위보 {
	public static void main(String[] args) {
		//배열 없이
		//1.컴퓨터가 가위0 바위1 보2
		int com=(int)(Math.random()*3);
		//2.사용자
		Scanner sc = new Scanner(System.in);
		int user=0;
		while(true) {
			System.out.print("가위(0),바위(1),보(2) : ");
			user = sc.nextInt();
			if(user>2)	System.out.println("잘못입력, 재입력 ㄱㄱ");
			else break;
		}
		/*
		if(com==0)	System.out.println("컴퓨터 : 가위");
		else if(com==1)	System.out.println("컴퓨터 : 바위");
		else	System.out.println("컴퓨터 : 보");
		if(user==0)	System.out.println("사용자 : 가위");
		else if(user==1)	System.out.println("사용자 : 바위");
		else	System.out.println("사용자 : 보");
		*/
		
		//배열 사용
		String[] s= {"가위","바위","보"};
		System.out.println("컴퓨터 : "+s[com]+'\n'+"사용자 : "+s[user]);
		
	}
}
