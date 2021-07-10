package daumMovie;

public class MovieSystem {
	public static void main(String[] args) {
		Reserve r = new Reserve();
		System.out.println("reserve end");
		DaumReserve d = new DaumReserve();
		System.out.println("daum end");
		NaverReserve n = new NaverReserve();
		System.out.println("naver end");
	}
}
