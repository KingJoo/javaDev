import java.io.*;

public class IOClass {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("파일 path 넣기 ");
		int i=0;
		StringBuffer sb = new StringBuffer();
		String data ="";
		while((i=fr.read())!=-1) {
			sb.append(String.valueOf((char)i));
			//data+=String.valueOf((char)i);
		}
		fr.close();
		System.out.println(sb.toString());//버퍼가 빠름
		//System.out.println(data);//스트링은 느림
	}
}
