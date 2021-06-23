package test;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class StringPrac1 {
	public static void main(String[] args) throws Exception{
		String[] title = new String[200];
		String[] singer = new String[200];
		String[] album = new String[200];
		
		int idx=0;
		for(int i=1;i<=4;i++) {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20210621&hh=15&rtm=Y&pg="+i).get();
			Elements titles=doc.select("a.title");
			Elements singers = doc.select("a.artist");
			Elements albums = doc.select("a.albumtitle");
			for(int j=0;j<50;j++) {
//				System.out.println((idx+1)+"."+titles.get(j).text()
//				+" "+singers.get(j).text()
//				+" "+albums.get(j).text()
//				);
				title[idx]=titles.get(j).text();
				singer[idx]=singers.get(j).text();
				album[idx]=albums.get(j).text();
				idx++;
			}
		}
		
		//프로그램
		//1. 노래제목 출력
		int i=1;
		for(String s: title)
			System.out.println((i++)+". "+s);
		System.out.println("===================================");
//		Scanner sc= new Scanner(System.in);
//		System.out.print("검색어 입력 : ");
//		boolean ck=false;
//		String data=sc.next();
//		for(String s : title)
//			if(s.contains(data)) {
//				System.out.println(s);
//				ck=true;
//			}
//		if(!ck)	System.out.println("검색된 결과가 없습니다.");
		System.out.println("===================================");
		Scanner sc= new Scanner(System.in);
		System.out.print("가수명 입력 : ");
		String data1=sc.next();
		int res=0;
		for(int k=0;k<singer.length;k++) {
			if(singer[k].startsWith(data1)) {
				res=k;
				break;
			}
		}
		System.out.println(title[res]);
		System.out.println(album[res]);
	}
}
