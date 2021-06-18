package test;

import java.util.Scanner;

public class StartsWith_EndsWith {
	public static void main(String[] args) throws Exception{
		/*
		 * String[] names= {"크아앙","엣찌이","밍밍이","댕댕이","고영희"}; String[] sexs=
		 * {"남자","남자","여자","수컷","암컷"}; for(int i=0;i<names.length;i++)
		 * System.out.printf("%s(%s)\n",names[i],sexs[i]);
		 */
		
		String[] book= {
				"자바와 오라클",
				"자바와 JSP",
				"HTML & Ajax",
				"자바와 코틀",
				"혼자 배우는 스프링",
				"혼자 배우는 자바",
				"자바와 AI",
				"모바일과 코틀린",
				"모바일과 자바"
				};
		Scanner sc = new Scanner(System.in);
		System.out.printf("검색어 입력 : ");
		String data = sc.next();
		for(String s : book)
			if (s.startsWith(data)||s.endsWith(data))// 카페 id_board ==> cookie
				System.out.println(s);
	}
}
