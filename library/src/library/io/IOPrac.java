package library.io;
import java.io.*;
public class IOPrac {
	public static void main(String[] args) {
		try {
			//메모리에 저장
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("검색어 입력 : ");
			String data = br.readLine();
			System.out.println(data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
