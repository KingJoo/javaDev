package test;

import java.util.Scanner;

public class LeftRight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean symmetry=true;
		for(int i=0;i<s.length()>>1;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				symmetry=false;
				break;
			}
		}
		//Object[] a= {1,2,"dadsf",2.1,'c'};
		Object[] a = new Object[10];
		a[0]="1wqef";
		a[3]=true;
		a[5]=5.23468754;
		a[7]='a';
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		System.out.println("좌우 대칭"+(symmetry?" 입니다.":"이 아닙니다."));
	}
}