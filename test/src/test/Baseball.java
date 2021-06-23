package test;

import java.util.Arrays;
import java.util.Scanner;

public class Baseball {
	static int s,b,input;
	static Scanner sc = new Scanner(System.in);
	
	static int[] randNumWithoutDuplicate(int limitStart, int limitCnt) {
		int[] com = new int[3];
		boolean[] ck = new boolean[limitCnt+limitStart];
		for(int i=0;i<3;) {
			com[i]=(int)(Math.random()*limitCnt)+limitStart;
			if(!ck[com[i]])	ck[com[i++]]=true;
		}
		return com;
	}
	
	static int[] input(Object... args) {
		int[] user = new int[3];
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);
		System.out.print("세자리 정수 입력 : ");
		input = sc.nextInt();
		if(input>999||input<100)
			return input("세자리 정수만 입력하시오.");
		user[0]=input/100;
		user[1]=(input%100)/10;
		user[2]=input%10;
		if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			return input("같은 수 입력 불가!!");
		if(user[0]==0||user[1]==0||user[2]==0)
			return input("0은 입력 불가!!");
		return user;
	}
	
	static void compare(int[] user, int[] com) {
		s=b=0;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				if(com[i]==user[j])
					if(i==j)	s++;
					else	b++;
	}
	
	static void hint() {
		System.out.printf("Input Num : %d, Result : %ds - %db\n",input,s,b);
	}
	
	static void exit(int[] com) {
		System.out.println("Game Over!!"+"\n"+"발생된 난수 : " + Arrays.toString(com));
	}
	
	static void baseballGame() {
		int[] com = randNumWithoutDuplicate(1, 9);
		while(s!=3) {
			int[] user=input();
			compare(user, com);
			hint();
		}
		exit(com);
	}
	
	public static void main(String[] args) {
		baseballGame();
	}
}
