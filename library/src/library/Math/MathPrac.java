package library.Math;
//난수
//ceil() 올림 -> 페이지 만들때
public class MathPrac {
	public static void main(String[] args) {
		int rowSize=10;
		int count=37;
		int total = (int)Math.ceil(count/(double)rowSize);
		System.out.println("총페이지 : "+total);
		
	}
}
