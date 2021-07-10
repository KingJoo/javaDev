package test;

class A{
	int a,b;
	A(int a, int b){
		this.a=a;
		this.b=b;
	}
}

public class Oop_0629 {
	//기본형 매개변수 -> 전송시 메모리, 받는 메모리 위치가 다르
	void change(int x, int y) {
		int tmp =x;
		x=y;
		y=tmp;
		System.out.println("x = "+x+", y = "+y);
	}
	void change(String s1, String s2) {
		String tmp=s1;
		s1=s2;
		s2=tmp;
		System.out.println("s1 = "+s1+", s2 = "+s2);
	}
	void change(int[] arr) {
		int tmp = arr[0];
		arr[0]=arr[1];
		arr[1]=tmp;
		System.out.println(arr);
		System.out.println("arr[0] = "+arr[0]+", arr[1] = "+arr[1]);
	}
	void change(A c) {
		int tmp=c.a;
		c.a=c.b;
		c.b=tmp;
		System.out.println(c);
		System.out.println("c.a = "+c.a+", c.b = "+c.b);
	}
	void print(Object... args) {
		for(Object o:args)
			System.out.println(o);
	}
	
	public static void main(String[] args) {
		Oop_0629 cls = new Oop_0629();
		System.out.println("기본형(int)=======================================");
		int a = 10, b = 20;
		cls.change(a,b);
		System.out.println("a = "+a+", b = "+b);
		System.out.println("클래스이지만 기본형취급(String)=======================================");
		String s1="abcde", s2="xyz";
		cls.change(s1,s2);
		System.out.println("s1 = "+s1+", s2 = "+s2);
		System.out.println("배열=======================================");
		int[] arr = {10,20};
		cls.change(arr);
		System.out.println(arr);
		System.out.println("arr[0] = "+arr[0]+", arr[1] = "+arr[1]);
		System.out.println("클래스=======================================");
		A c = new A(10,20);
		cls.change(c);
		System.out.println(c);
		System.out.println("c.a = "+c.a+", c.b = "+c.b);
		System.out.println("=======================================");
		
		cls.print(1,1.23,"ddddd",true,21384);
	}
}
