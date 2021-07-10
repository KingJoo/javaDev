package library.io;
import java.io.*;
import java.net.*;

public class IO_NetPrac {
	public static void main(String[] args) {
		// Document doc = Jsoup.connection("https://www.daum.net").get() -> Jsoup
		try {
			URL url = new URL("https://www.daum.net");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			if(conn!=null){//연결되었다면
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
				//conn.getInputStream() -> conn(다)에 있는 메모리에서 데이터를 읽어 온다.
				while(true) {
					String data = br.readLine();
					if(data==null)	break;
					System.out.println(data);
				}
				br.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
