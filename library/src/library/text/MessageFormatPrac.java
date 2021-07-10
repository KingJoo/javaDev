package library.text;

import java.util.*;
import java.text.*;

public class MessageFormatPrac {
	public static void main(String[] args) {
		String msg = "이름:{0}\n전화:{1}\n나이:{2}\n성별:{3}\n주소:{4}";
		Object[] o = {"홍길동","010-0000-0000",24,"남자","서울시 마포구"};
		String s = MessageFormat.format(msg, o);
		System.out.println(s);
		System.out.println("====================================");
		String s1 = MessageFormat.format(msg,"홍길동","010-0000-0000",24,"남자","서울시 마포구");
		System.out.println(s1);
	}
}
