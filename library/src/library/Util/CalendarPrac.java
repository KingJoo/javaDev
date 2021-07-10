package library.Util;
import java.util.*;

public class CalendarPrac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		System.out.print("일 입력 : ");
		int day = sc.nextInt();
		//요일 구하기(전년도까지의 일수 합 + 전달까지의 일수 합 + day)
		int tot=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		int[] lastDay = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%4==0&&year%100!=0||year%400==0)
			lastDay[2]=29;
		else
			lastDay[2]=28;
		for(int i=1;i<month;i++)
			tot+=lastDay[i];
		tot+=day;
		int week = tot%7;
		char[] w = {'일','월','화','수','목','금','토'};
		System.out.printf("%d년 %d월 %d일은 %c요일입니다.\n",year,month,day,w[week]);
		
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);//0~11
		cal.set(Calendar.DATE, day);
		int week1 = cal.get(Calendar.DAY_OF_WEEK); // 요일 1~7
		week1--;
		int lastday = cal.getActualMaximum(Calendar.DATE); // 각달 마지막 날 읽어올 
		char[] w1 = {'일','월','화','수','목','금','토'};
		System.out.printf("%d년 %d월 %d일은 %c요일입니다.\n",cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE),w1[week1]);
		for(int i=0;i<7;i++)
			System.out.print(w1[i]+"\t");
		System.out.println();
		for(int i=1;i<=lastday;i++) {
			if(i==1)
				for(int j=0;j<week;j++)
					System.out.print("\t");
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)//일요일이면
			{
				week=0;
				System.out.println();
			}
		}
	}
}
