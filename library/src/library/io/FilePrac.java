package library.io;
import java.io.*;
public class FilePrac {
	public static void main(String[] args) {
		try {
			File dir = new File("javaDev");
			// 모든 파일 읽기
			File[] list = dir.listFiles();
			for(File f : list) {
				if(f.isFile())	System.out.println(f.getName());
				if(f.isDirectory())	System.out.println("DIV"+f.getName()+" "+f.getPath());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
