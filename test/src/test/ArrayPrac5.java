package test;

import java.util.Scanner;

public class ArrayPrac5 {
	public static void main(String[] args) {
		String[] names = {"1","2","3","4","5","6","7","8"};
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name=sc.next();
		boolean isName=false;
		int i=0;
		for(i=0;i<names.length;i++)
			if(name.equals(names[i])) {
				isName=true;
				System.out.println(name+"는(은)"+(i+1)+"번째에 존재한다.");
				break;
			}
		if(!isName)	System.out.println(name+"는(은) 존재하지 않는다.");
	}
}
