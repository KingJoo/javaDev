package library.String;
import java.io.*;
public class StringBufferPrac {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/Users/joo/Downloads/test.txt");
			int i=0;
			long start=System.currentTimeMillis();
//			String news = "";
//			while((i=fr.read())!=-1) {
//				news+=String.valueOf((char)i);
//			}
			StringBuffer sb = new StringBuffer();
			while((i=fr.read())!=-1) {
				sb.append(String.valueOf((char)i));
			}
			long end=System.currentTimeMillis();
			fr.close();
			//System.out.println(news);//186ms
			//System.out.println(sb.toString());//16ms
			System.out.println("걸린시간 : "+(end-start) + "ms");
		}catch(Exception e) {e.printStackTrace();}
	}
}
