package test;

import java.util.Date;
import java.text.SimpleDateFormat;
import static java.lang.Math.*;
import static java.lang.String.*;

public class MainClass {
	public static void main(String[] args) {
//		Date date = new Date();
//		System.out.println(date);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//MM-월, mm-분
//		System.out.println(sdf.format(date));
//		System.out.println(random());
//		System.out.println(ceil(10/3d));
//		System.out.println(abs(-30));
//		System.out.println(valueOf("ddd"));
//		System.out.println("  dd0 ".trim().length());
//		System.out.println();
		Card c1=Card.newInstance();
		Card c2=Card.newInstance();
		Card c3=Card.newInstance();
	}
}
//싱글턴 패턴
class Card{
	private static Card card;
	public static Card newInstance() {
		if(card==null)
			card=new Card();
		return card;
	}
}
