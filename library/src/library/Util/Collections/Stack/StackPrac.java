package library.Util.Collections.Stack;
import java.util.*;

public class StackPrac {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		while(!st.empty())
			System.out.println(st.pop());
	}
}
