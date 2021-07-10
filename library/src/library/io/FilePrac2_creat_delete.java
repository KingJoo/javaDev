package library.io;
import java.io.*;
public class FilePrac2_creat_delete {
	public static void main(String[] args) {
		try {
			File dir = new File("경로 ");
			if(!dir.exists())	dir.mkdir();
			System.out.println("폴더 만들기 완료!");
			
			File file = new File("경로 ");
			if(!file.exists())
				file.createNewFile();
			System.out.println("파일 만들기 완료!");
			
			File dir1 = new File("경로 ");
			File[] list = dir1.listFiles();
			for(File f : list)	f.delete();
			dir.delete();
			System.out.println("파일 삭제 후 폴더 삭제 가능!! ===> 삭제 완료!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
