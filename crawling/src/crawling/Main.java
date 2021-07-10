package crawling;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		// String search = scan.next();
		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ메뉴ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1. 목록 ");
			System.out.println("2. 검색 ");
			System.out.println("3. 종료 ");
			System.out.print("메뉴 선택 : ");
			int n = scan.nextInt();
			if (n == 1) {
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();// 웹 연결
				Elements a = doc.select("a.title");// tag
				for (int i = 0; i < 50; i++)
					System.out.println((i + 1) + ". " + a.get(i).text());
			} else if (n == 2) {
				System.out.print("검색어 입력 : ");
				String fd = scan.next();
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();// 웹 연결
				Elements a = doc.select("a.title");// tag
				for (int i = 0; i < 50; i++) {
					if (a.get(i).text().contains(fd))
						System.out.println((i + 1) + ". " + a.get(i).text());
				}
			} else if (n == 3)
				break;
			else
				System.out.println("잘못된 선택입니다. 다시 선택해주세요. ");
		}
		System.out.println("종료 ~");
	}

}
