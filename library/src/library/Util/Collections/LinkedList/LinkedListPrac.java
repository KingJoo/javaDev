package library.Util.Collections.LinkedList;
import java.util.*;
public class LinkedListPrac {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("사과");
		list.add("복숭아");
		list.add("배");
		list.add("수박");
		list.add("참외");
		list.add("메론");
		list.add(2,"포도");
		for(String s : list)
			System.out.println(s);
		System.out.println("과일의 수 : "+list.size());
		
		list.remove(2);
		
		for(String s : list)
			System.out.println(s);
		System.out.println("과일의 수 : "+list.size());
		
		list.clear();
		
		for(String s : list)
			System.out.println(s);
		System.out.println("과일의 수 : "+list.size());
		
	}
}
