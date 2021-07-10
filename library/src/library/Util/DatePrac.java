package library.Util;
import java.text.SimpleDateFormat;
import java.util.*;
public class DatePrac {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-M-d h:m:s");
		System.out.println(sdf1.format(date));
		//년도 : 4자리(yyyy) 3자리(yyy) 2자리(yy)
		//월 : M(1자리 십의자리 0 안채움, 값만 가져올 때), MM(2자리 출력, 비어있는자리 0 채워서 출력)
		//일 : d, dd
		//시간 : h, hh
		//분 : m, mm
		//초 : s, ss
	}
}
