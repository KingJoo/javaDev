package library.Util;

import java.util.*;

public class StringTokenizerPrac {
	public static void main(String[] args) {
		String colors = "red,blue,black,yellow,pink";
		StringTokenizer st = new StringTokenizer(colors,",");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
