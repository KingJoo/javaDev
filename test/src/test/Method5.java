package test;

import java.util.ArrayList;

public class Method5 {
	static void display() {
		int a=10;
		System.out.println(a);
		++a;
	}
	static void swap(int a, int b) {
		int tmp=a;
		a=b;
		b=tmp;
		System.out.println("swap:a="+a+",b="+b);
	}
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a+" "+b);
		swap(a,b);//원본은 그대로, 전송된 데이터만 변경 Call by Value
		System.out.println(a+" "+b);
	}
}
