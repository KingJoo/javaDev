package crawling;

import java.util.Arrays;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 맛집_카테고리 {
	
	/*
	 * <span class="title">비빔밥 맛집 베스트 25곳</span>
       			<p class="desc">"밥은 비벼야 제맛이지!"</p>
	 */
	static Category[] getCategory() throws Exception{
		Category[] cate = new Category[12];
		Document doc = Jsoup.connect("https://www.mangoplate.com").get();
		Elements title = doc.select("span.title");
		Elements subject = doc.select("p.desc");
		for(int i=0;i<12;i++) {
			cate[i]=new Category();
			cate[i].no=i+1;
			cate[i].title=title.get(i).text();
			cate[i].subject=subject.get(i).text();
		}
		return cate;
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Category[] cate = getCategory();
		while(true){
			System.out.println("맛집 카테고리");
			for(Category c : cate)
				System.out.println(c.no+"\t"+c.title+"\t"+c.subject);
			System.out.print("카테고리 번호 선택(1~12) : ");
			int idx = sc.nextInt();
			if(idx==0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
class Category{
	int no; //카테고리 번호
	String title; //제목 
	String subject; //부제목 
}
class FoodHouse{
	
}
