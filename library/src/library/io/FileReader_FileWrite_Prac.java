package library.io;
import java.io.*;
public class FileReader_FileWrite_Prac {
	public static void main(String[] args) {
//		try {
//			FileWriter fw = new FileWriter("/Users/joo/Downloads/test.txt");
//			String msg = "Hello Java IO!!";
//			fw.write(msg);
//			fw.close();
//			System.out.println("파일 저장 완료!!");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
		try {
			FileReader fr = new FileReader("/Users/joo/Downloads/test.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.println((char)i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
