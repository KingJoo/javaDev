package library.Object;

import java.lang.reflect.Method;

public class GetClassM {
	public static void main(String[] args) {
		Board b = new Board();
		b.display();
		Class bb=b.getClass();
		Method[] methods=bb.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
		
	}
}

class Board{
	public void display() {
		System.out.println("Board : display() call");
	}
}