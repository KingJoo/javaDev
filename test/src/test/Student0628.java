package test;

class __Student{
	String name="ddddd";
	int haknun;
	String sex;
	String subject;
}

public class Student0628 {
	public static void main(String[] args) {
		__Student s=new __Student();
		System.out.println(s.name);
		__Student a=s;
		System.out.println(s);
		System.out.println(a);
		s=null;
		System.out.println(s);
		System.out.println(a);
		System.out.println(a.name);
	}
}
