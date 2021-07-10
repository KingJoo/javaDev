package library.Util.Collections.ArrayList;
import java.util.*;

// 제네릭스 연습
class Box<T>{
	T t;
	public void setT(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
	public T display() {
		return t;
	}
}

public class ArrayListPrac {
	public static void main(String[] args) {
		//ArrayList 연습
		List list = new ArrayList();
		list.add("abc");
		list.add("def");
		list.add("hij");
		list.add("klm");
		list.add(30);
		for(Object o : list)	System.out.println(o);
		System.out.println("==============================");
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("123");
		list1.add("456");
		list1.add("789");
		list1.add("jeong");
		list1.add("123");
		list1.sort(null);
		for(String s:list1)	System.out.println(s);
		
		//제네릭스 연습
		Box<String> b = new Box<>();
		b.setT("sadfasdf");
		//System.out.println(b.display());
	}
}
