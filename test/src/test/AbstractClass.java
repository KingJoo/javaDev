package test;

import javax.swing.*;

abstract class Shape{
	public abstract void draw();//하위 클래스에서 무조건 오버라이딩 해야
	public void select(String color) {//필요하면 오버라이딩 가
		color="검정";
		System.out.println(color+"색을 사용한다.");
	}
}

class Line extends Shape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("선을 그린다.");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다.");
	}
}

class Squair extends Shape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다.");
	}
}

class TTT{
	
}

public class AbstractClass extends JFrame{
	public static void main(String[] args) {
		Shape a = new Line();
		a.draw();
		
		a = new Circle();
		a.draw();
		
		a = new Squair();
		a.draw();
		
		a = new Shape() {@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("dddd");
			}
		};
		a.draw();
	}
}
