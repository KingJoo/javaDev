package test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

class Music{
	int rank;
	int upDown; // 등폭
	String title;
	String singer;
	String album;
	String state;// 유지 상승 하강 
	//String poster;// 이미지
}

public class MainClass3{
	public static void main(String[] args) throws Exception {
		Music[] m = new Music[200];
		for(int i=1;i<=4;i++) {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20210624&hh=15&rtm=Y&pg="+i).get();
			Elements titles=doc.select("a.title");
			Elements singers = doc.select("a.artist");
			Elements albums = doc.select("a.albumtitle");
			
		}
	}
}
