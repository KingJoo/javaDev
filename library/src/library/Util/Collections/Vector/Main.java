package library.Util.Collections.Vector;
import java.util.*;

class MyClass<E>{
	E e;
	public void add(E e) {
		
	}
	public E get() {
		return e;
	}
}

public class Main {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("홍길동");
		v.add("심청이");
		v.add("박문수");
		v.add("춘향이");
		v.add(2,"이순신");
		v.addElement("강감찬");
		for(String s : v)
			System.out.println(s);
		System.out.println("인원 : "+v.size());
		v.removeElementAt(2);//v.remove(2);
		for(String s : v)
			System.out.println(s);
		System.out.println("인원 : "+v.size());
		v.set(2, "박문자");
		for(String s : v)
			System.out.println(s);
		System.out.println("인원 : "+v.size());
	}
}
