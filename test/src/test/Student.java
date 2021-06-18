package test;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] kor = new int[3], eng = new int[3], math = new int[3], total = new int[3], rank = {1,1,1};
		double[] avg = new double[3];
		char[] score = new char[3];
		
		for(int i=0;i<3;i++) {
			System.out.printf("%d번째 국어점수 입력 : ",i+1);
			kor[i]=scan.nextInt();
			System.out.printf("%d번째 영어점수 입력 : ",i+1);
			eng[i]=scan.nextInt();
			System.out.printf("%d번째 수학점수 입력 : ",i+1);
			math[i]=scan.nextInt();
			total[i]=kor[i]+eng[i]+math[i];	//total
			avg[i]=total[i]/3d;	//avg
			//score
			if((int)avg[i]>=90)	score[i]='A';
			else if((int)avg[i]>=80)	score[i]='B';
			else if((int)avg[i]>=70)	score[i]='C';
			else if((int)avg[i]>=60)	score[i]='D';
			else	score[i]='F';
		}
		
		//rank
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				if(total[i]<total[j])	rank[i]++;	
		
		System.out.println("------------------성적 목록------------------");
		System.out.printf("%-5s%-5s%-6s%-6s%-5s%5s%5s\n","국어","영어","수학","총점","평균","학점","순위");
		for(int i=0;i<3;i++)
			System.out.printf("%-6d%-6d%-6d%-6d%6.2f%6c%6d\n",kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
	}
}
