package library.String;

public class JavaLangObject {
	public static void main(String[] args){
		// 1. 객체 생성
		Sawon s = new Sawon();
		Sawon s1 = null;
		// 2. 객체 기능 활용(메소드 호출)
		s.display();
		// 2. 복제
		try {
			s1 =(Sawon)s.clone();
			System.out.println(s);
			System.out.println(s1);
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		// 2. 객체를 문자열로(주소값)
		System.out.println(s);
		System.out.println(s.toString());
		// 3. 객체 해제 -> System.gc() -> 해제하는 시간이 늦다(프로그램 종료시 해제) -> 멀티미디어
		s=null;System.gc();//s.finalize();
		// 메모리에서 자동 해제 -> Stack(지역변수), 프로그래머 관리 영역(가비지컬렉션 지원) -> Heap(객체,배열 등)
	}
}

class Sawon implements Cloneable{
	int no;
	public Sawon() {
		System.out.println("Sawon new Object");
	}
	
	public void display() {
		System.out.println("Sawon : display() call");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("Sawon : copy");
		return super.clone();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "주소값 : "+super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Sawon : memory free");
	}
	

}