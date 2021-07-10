package library.Object;

public class EqualsM {
	public static void main(String[] args) {
		Human h = new Human("홍길동");
		Human h1 = new Human("홍길동");
		System.out.println(h);
		System.out.println(h1);
		System.out.println(h.equals(h1));
		h=h1;
		System.out.println(h.equals(h1));
		
		String s=new String("홍길동");
		String s1="홍길동";
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}
}

class Human{
	String name;
	public Human(String name) {
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Human)
			return name.equals(((Human)obj).name);
		else return false;
	}
}