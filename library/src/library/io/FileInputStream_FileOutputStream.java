package library.io;
import java.io.*;
public class FileInputStream_FileOutputStream {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("/Users/joo/Documents/javaDev/javaStudy/crawling/src/crawling/StringPrac1.java");
			FileOutputStream fos = new FileOutputStream("/Users/joo/Downloads/test.txt");
			
			byte[] buffer = new byte[1024];
			int i=0;
			while((i=fis.read(buffer, 0, 1024))!=-1) {
				fos.write(buffer);
			}
			fis.close();
			fos.close();
			System.out.println("저장 완료!!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
