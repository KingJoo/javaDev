package library.Util.Collections.ArrayList;
import java.util.*;
public class MovieMain {
	public static void main(String[] args) {
		MovieDAO dao = new MovieDAO();
		ArrayList<Movie> list = dao.movieAllData();
		System.out.println("저장된 영화 수 : "+list.size());
		for(Movie m : list)
			System.out.println(m.getMno()+". "+m.getTitle());
		System.out.println("==============================");
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int mno = sc.nextInt();
		Movie m = list.get(mno);
		System.out.println("==========상세 영화 보기==========");
		System.out.println("순위 : "+m.getMno());
		System.out.println("영화명 : "+m.getTitle());
		System.out.println("장르 : "+m.getGenre());
		System.out.println("감독 : "+m.getDirector());
		System.out.println("출연 : "+m.getActor());
		System.out.println("줄거리 : "+m.getStory());
		System.out.println("==============================");
		System.out.println();
		System.out.println("==========배우로 영화 찾기==========");
		System.out.print("배우 입력 : ");
		String actor = sc.next();
		boolean ck = false;
		for(Movie mm : list) {
			if(mm.getActor().contains(actor)) {
				ck=true;
				System.out.println(mm.getTitle());
			}
		}
		if(!ck)	System.out.println("검색된 결과가 없습니다.");
	}
}
