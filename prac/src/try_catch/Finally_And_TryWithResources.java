package try_catch;

import java.io.*;
//java.io, java.net, java.sql, javax....(jdk1.2)-> xml, web ... =====> 예외처리 필수

public class Finally_And_TryWithResources {
	
	public static void main(String[] args){
		//finally
		FileReader fr = null;
		try {
			fr=new FileReader("/Users/joo/Downloads/test.txt");
			int i=0;// 파일 읽기 -> 한글자씩 읽어온다(한글자 -> 정수) -> char변환해서 처리 <-1 == EOF>
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception e) {
			//오류 처리
			e.printStackTrace();
		}
		finally {
			//파일 닫기
			try {
				fr.close();
			}catch(Exception e) {
			}
		}
		
		System.out.println();
		
		//try-whth-resources
		try(FileReader fr1 = new FileReader("/Users/joo/Downloads/test.txt")){
			int i=0;
			while((i=fr1.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}