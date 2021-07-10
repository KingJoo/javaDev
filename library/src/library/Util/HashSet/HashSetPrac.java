package library.Util.HashSet;
import java.util.*;
public class HashSetPrac {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("액션");
		list.add("드라마");
		list.add("SF");
		list.add("멜로");
		list.add("판타지");
		list.add("코믹");
		list.add("코믹");
		list.add("판타지");
		list.add("액션");
		
		System.out.println("====중복====");
		System.out.println(list);
		
		Set<String> hs = new HashSet<>();
		hs.addAll(list);
		
		System.out.println("중복 제거");
		System.out.println(hs);
	}
}
