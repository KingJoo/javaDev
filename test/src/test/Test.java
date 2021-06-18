package test;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Test {
	public static void main(String[] args) throws Exception {

		// final int LIMIT = 1000;
		// System.out.println((int)(Math.random()*LIMIT));
		// long d=324231231234l;
		// System.out.println(Long.toBinaryString(d));
		// char c= ' ';
		// if(c>='A'&&c<='Z') 대문자
		// if(c<='A'||c>='Z') 혹은 if(!(c>='A'&&c<='Z')) !대문자
		// if((c>='A'&&c<='Z')||(c>='a'&&c<='z')) -- 알파벳이라
		// a<=50?"낮은수":"높은수"
		// Scanner scan = new Scanner(System.in);
		// c>=0&&c<=9?"숫자":"숫자x";

		/*
		 * int i=(int)(Math.random()*LIMIT); System.out.println( i+" "+
		 * (i%3==0||i%5==0||i%7==0 ? "3,5,7의 배수" : "나머지") );
		 */

		// char a='A'+1;
		// System.out.println(a);
		// int a=scan.nextInt();

		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("점수 입력 : "); int
		 * score = scan.nextInt(); if(score>=60) System.out.println("통과"); else
		 * System.out.println("재시험"); int com =(int)(Math.random()*100)+1;
		 */

		/*
		 * int change = (int)(Math.random()*3); char c=' '; if(change==0)
		 * c=(char)((int)(Math.random()*26)+'A');//대문자 else if(change==1)
		 * c=(char)((int)(Math.random()*26)+'a');//소문자 else
		 * c=(char)((int)(Math.random()*10)+'0'); if(c>='A'&&c<='Z')
		 * System.out.println(c+"는(은) 대문자 입니다"); else if(c>='a'&&c<='z')
		 * System.out.println(c+"는(은) 소문자 입니다"); else
		 * System.out.println(c+"는 알파벳이 아닙니다");
		 */

		/*
		 * System.out.println(); Scanner scan = new Scanner(System.in);
		 * System.out.print("국어 영어 수학 점수를 입력 : "); int kor = scan.nextInt(); int eng =
		 * scan.nextInt(); int math = scan.nextInt(); double avg = (kor+eng+math)/3d;
		 * System.out.println("총점은 "+(kor+eng+math)+" 입니다.");
		 * System.out.printf("평균은 %.2f 입니다.\n",avg); int iAvg = (kor+eng+math)/3; char
		 * score=' '; if(iAvg>=90) score='A'; else if(iAvg>=80) score='B'; else
		 * if(iAvg>=70) score='C'; else if(iAvg>=60) score='D'; else score='A';
		 * System.out.println("학점은 "+score+" 입니다.");
		 */

		/*
		 * Scanner scan = new Scanner(System.in); System.out.printf("첫번째 정수 입력 : "); int
		 * a=scan.nextInt(); System.out.printf("두번째 정수 입력 : "); int b=scan.nextInt();
		 * 
		 * while(true) { System.out.printf("연산자 입력 : "); char op=scan.next().charAt(0);
		 * if(op=='+') { System.out.printf("%d + %d = %d\n",a,b,a+b); break; } else
		 * if(op=='-') { System.out.printf("%d - %d = %d\n",a,b,a-b); break; } else
		 * if(op=='*') { System.out.printf("%d * %d = %d\n",a,b,a*b); break; } else
		 * if(op=='/') { if(b==0) System.out.println("0으로 나눌 수 없습니다."); else {
		 * System.out.printf("%d / %d = %.16f\n",a,b,a/(double)b); break; } } else
		 * System.out.println("잘못된 연산자 입력입니다."); }
		 */

		/*
		 * int rand = (int) (Math.random() * 2); char alpha = ' '; if (rand == 0) {
		 * alpha = (char) (Math.random() * 26 + 'A'); System.out.println("대문자 " +
		 * alpha); } else { alpha = (char) (Math.random() * 26 + 'a');
		 * System.out.println("소문자 " + alpha); }
		 */

		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("점수 입력 : "); int
		 * score = scan.nextInt(); int remain = score%10; char grade=' ',option=' ';
		 * 
		 * if(score>=90) grade='A'; else if(score>=80) grade='B'; else if(score>=70)
		 * grade='C'; else if(score>=60) grade='D'; else grade='F';
		 * 
		 * if(remain>=8) option='+'; else if(remain<4) option='-'; else option='0';
		 * 
		 * System.out.println(""+grade+option);
		 */

		/*
		 * Scanner scan = new Scanner(System.in); System.out.printf("첫 번째 정수 입력 : ");
		 * int n1=scan.nextInt(); System.out.printf("두 번째 정수 입력 : "); int
		 * n2=scan.nextInt(); System.out.println("연산자 입력"); switch(scan.next()) { case
		 * "+": System.out.println("+"); break; case "-": System.out.println("-");
		 * break; case "*": System.out.println("*"); break; case "/":
		 * System.out.println("/"); break; }
		 */

		/*
		 * Scanner scan = new Scanner(System.in); System.out.printf("월 입력 :");
		 * switch(scan.nextInt()) { case 3,4,5: System.out.println("봄 입니다."); break;
		 * case 6,7,8: System.out.println("여름 입니다."); break; case 9,10,11:
		 * System.out.println("가을 입니다."); break; case 12,1,2:
		 * System.out.println("겨울 입니다."); }
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.printf("월 입력 : ");
//		int month = scan.nextInt();
//		int day = switch (month) {
//		case 1, 3, 5, 7, 8, 10, 12 -> {
//			System.out.println("한 달은 31일입니다.");
//			yield 31;
//		}
//		case 4, 6, 9, 11 -> {
//			System.out.println("한 달은 30일입니다.");
//			yield 30;
//		}
//		case 2 -> {
//			System.out.println("한 달은 28일입니다.");
//			yield 28;
//		}
//		default -> {
//			System.out.println("존재하지 않는 달 입니다.");
//			yield 0;
//		}
//		};
//		System.out.println(month + "월은 " + day + "일입니다.");

		/*
		 * int even=0,odd=0; for(int i=1;i<=100;i++) { if(i%2==0) even+=i; else odd+=i;
		 * } System.out.println("짝수 합 : "+even+", 홀수 합 : "+odd);
		 */

		/*
		 * Scanner scan = new Scanner(System.in); System.out.printf("단 입력 : \n"); int
		 * dan = scan.nextInt(); for(int i=1;i<10;i++)
		 * System.out.println(dan+" * "+i+" = "+dan*i);
		 * 
		 * for(int i=0;i<26;i++) { System.out.printf("%c ",'a'+i); } for(char
		 * c='A';c<='Z';c++) System.out.print(c);
		 */

		/*
		 * Scanner scan = new Scanner(System.in); int rand =(int)(Math.random()*100)+1;
		 * while(true) { System.out.printf("100이하의 정답 찾기 : "); int input =
		 * scan.nextInt(); if(input==rand) { System.out.println("정답입니다. 정답은 "+rand);
		 * break; } else if(input<rand) System.out.println("입력값보다 Up!!"); else
		 * System.out.println("입력값보다 Down!!"); }
		 */

		/*
		 * int sum=0; for(int i=1;i<=10;i++) { if(i%2==0) sum+=i; else sum-=i; }
		 * System.out.println(sum);
		 */

		/*
		 * //구구단 for(int i=1;i<=9;i++) { for(int j=2;j<=9;j++)
		 * System.out.printf("%d * %d = %2d\t",j,i,j*i); System.out.println(); }
		 */

		/*
		 * for(int i=1;i<=3;i++) for(int j=1;j<=3;j++) for(int k=1;k<=3;k++)
		 * System.out.println(""+i+j+k);
		 */

		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("숫자 입력 : "); int num
		 * = scan.nextInt(); for (int i = 0; i < num; i++) { for (int j = 0; j <= i;
		 * j++) System.out.print("*"); System.out.println(); }
		 */

		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("숫자 입력 : "); int num
		 * = scan.nextInt(); for (int i = 0; i < num; i++) { for (int j = 0; j <num-i;
		 * j++) System.out.print("*"); System.out.println(); }
		 */

		/*
		 * int cnt=0; for(int i=1;i<=6;i++) for(int j=1;j<=6;j++)
		 * if(i+j==6){System.out.printf("[%d,%d]\n",i,j);cnt++;}
		 * System.out.println("총 경우의 수는 "+cnt);
		 */

		/*
		 * int cnt = 0; for (int i = 1; i <= 6; i++) for (int j = 1; j <= 6; j++) if (i
		 * + j >= 10) { System.out.printf("[%d,%d]\n", i, j); cnt++; }
		 * System.out.println("총 경우의 수는 " + cnt);
		 */

		/*
		 * for (int i = 1; i <= 5; i++) { for (int j = 1; j <= 5; j++) if (i == j)
		 * System.out.printf("[%d,%d]",i,j); else System.out.printf("\t");
		 * System.out.println(); }
		 */

		/*
		 * for (int i = 4; i > 0; i--) { for (int j = 1; j <= 4; j++) if(j>=i)
		 * System.out.print('*'); else System.out.print(' '); System.out.println(); }
		 * System.out.println("===="); for (int i = 0; i < 4; i++) { for (int j = 0; j <
		 * i; j++) System.out.print(' '); for (int j = 0; j < 4 - i; j++)
		 * System.out.print('*'); System.out.println(); }
		 */

		/*
		 * int init =1; while(init<=100) { System.out.print(init+" "); init++; }
		 */

		/*
		 * int i=0; FileReader fr= new FileReader("/Users/joo/Documents/test.c");
		 * while((i=fr.read())!=-1) { System.out.print((char)i); } fr.close();
		 */
		/*
		 * Scanner scan = new Scanner(System.in); while(true) {
		 * System.out.println("=====menu====="); System.out.println("1. 현재 상영 영화");
		 * System.out.println("2. 개봉 예정 영화"); System.out.println("3. 영화 예매");
		 * System.out.println("4. 종료"); System.out.println("==============");
		 * System.out.println("메뉴 선택"); int menu=scan.nextInt(); if(menu==1)
		 * System.out.println("현재 상영 영화 목록입니다."); else if(menu==2)
		 * System.out.println("개봉 예정 영화 목록입니다"); else if(menu==3)
		 * System.out.println("영화 예매 화면입니다"); else if(menu==4) System.exit(0); }
		 */
		/*
		 * boolean flag=false; while(flag) { System.out.println("dddd"); } do {
		 * System.out.println("aaaa"); }while(flag);
		 */

		/*
		 * //1 Scanner scan = new Scanner(System.in); System.out.println("정수 입력 : ");
		 * int a = scan.nextInt(); if(a<0) System.out.println(a+"는(은) 음수입니다."); else
		 * System.out.println(a+"는(은) 양수입니다.");
		 */

		/*
		 * //1 Scanner scan = new Scanner(System.in); System.out.println("정수 입력 : ");
		 * int b = scan.nextInt(); if(b%3==0) System.out.println(b+"는(은) 3의 배수입니다.");
		 * else System.out.println(b+"는(은) 3의 배수가 아닙니다.");
		 */

		/*
		 * //2 Scanner scan = new Scanner(System.in); System.out.println("정수 입력 : ");
		 * int a = scan.nextInt(); if(a<0) a=-a; System.out.println("a = "+a);
		 */

		/*
		 * //3 Scanner scan = new Scanner(System.in); System.out.println("정수 입력 : ");
		 * int a = scan.nextInt(); if(a<0) System.out.println(a+"는(은) 음수입니다."); else
		 * System.out.println(a+"는(은) 양수입니다.");
		 */

		/*
		 * //10 for(char c='B';c<='N';c+=2) System.out.print(c+"\t");
		 */

		/*
		 * //11 Scanner scan = new Scanner(System.in); System.out.println("정수 입력 : ");
		 * int a = scan.nextInt(); int sum=0; for(int i=1;i<=a;i++) sum+=i;
		 * System.out.println("1~10까지의 합 : "+sum);
		 */

		/*
		 * //12 int cnt=1; for(int i=2;i<=30;i+=2) { System.out.print(i+"\t");
		 * if(cnt%3==0) System.out.println(); cnt++; }
		 */

		/*
		 * //13(밑에 안보여서 대충만듬) int sum=0; for(int i=1;i<=10;i++) { if(i%2==1) sum+=i;
		 * else sum-=i; } System.out.println(sum);
		 */

		/*
		 * Scanner scan = new Scanner(System.in); int score = 0; while(true) {
		 * System.out.println("0~100까지 사이의 점수 입력 : "); score=scan.nextInt();
		 * if(score<0||score>100) { System.out.println("잘못된 입력 입니다."); continue; }
		 * break; } System.out.println("score = " + score);
		 */

		/*
		 * String s = "홍길동"; String s1 = new String("홍길동");
		 * 
		 * if(s==s1) System.out.println("같다"); else System.out.println("다르다");
		 * 
		 * if(s.equals(s1)) System.out.println("같다"); else System.out.println("다르다");
		 */

		/*
		 * String s = "Hello String Data!!!!"; System.out.println(s.toUpperCase());
		 * System.out.println(s.toLowerCase());
		 */

		/*
		 * final String ID = "admin"; final String PW = "1234"; Scanner scan = new
		 * Scanner(System.in); while(true) { System.out.print("ID : "); String id =
		 * scan.next(); if(!id.equals(ID)) continue; System.out.print("PW : "); String
		 * pw = scan.next(); if(!pw.equals(PW)) continue; System.out.println("통과");
		 * break; }
		 */

		/*
		 * String s1="asdfasdf"; String s2="asdf"; if(s1.contains(s2))
		 * System.out.println("포함");
		 */

		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("문자열 입력 : "); String
		 * data = scan.next(); System.out.println("받은 데이터 : " + data); int cnt = 0; for
		 * (int i = 0; i < data.length(); i++) { char c = data.charAt(i); //
		 * System.out.println(c); if (c == 'A' || c == 'a') cnt++; }
		 * System.out.println("A와 a가 몇개 : " + cnt);
		 */

		/*
		 * //서브스트링 String str="0123456789"; System.out.println(str.substring(1,3));
		 */

		/*
		 * //문자열 찾기 String str = "ello java HHHHH우리우리도냥로댭혈극댋";
		 * System.out.println(str.indexOf('H'));
		 */

		/*
		 * // 문자열 찾기 String addr="서울특별시 서초구 신반포로45길 50-9 유진빌딩 지번 서울시 서초구 잠원동 35-8 유진빌딩";
		 * String fStr=addr.substring(0,addr.indexOf("지번")).trim();
		 * System.out.println(fStr); String s =
		 * addr.substring(addr.indexOf("지번")).trim(); System.out.println(s);
		 */

		/*
		 * //replace replaceAll String s = "Hello java "; String S = s.repeat(10);
		 * System.out.println(S.replace('H','!'));
		 * System.out.println(S.replace("Hello","Fxxk")); String
		 * ss="안녕하세요 adsfasdfasefads 안녕 !! 234563456";
		 * System.out.println(ss.replaceAll("[^A-Za-z]",""));
		 * System.out.println(ss.replaceAll("[^0-9]",""));
		 * System.out.println(ss.replaceAll("[^가-힣]",""));
		 */

		/*
		 * //split String menu = "낙지철판덮밥 8,000원 돼지철판덮밥 8,000원 돌솥비빔밥 7,500원" +
		 * "콩나물해장국 7,000원 항아리수제비 7,500원"; String[] s = menu.split("원"); for(String m:s)
		 * System.out.println(m.trim()+"원");
		 */

		/*
		 * int sum=0, i=1; while (i<100) { if(i%3 != 0) { i++; if(i%3==0) sum+=i; } else
		 * sum += i; i++; } System.out.println(sum); sum=0; i=1; while (i<100) { if(i%3
		 * != 0) { i++; continue; } else sum += i; i++; } System.out.println(sum);
		 * 
		 * sum = i = 0; while (i++ < 100) { if(i%3 == 0) sum += i; }
		 * System.out.println(sum);
		 */

		/*
		 * System.out.print("달을 입력하세요(1~12) >> "); Scanner scan = new
		 * Scanner(System.in); int month = scan.nextInt(); if(month>=3&&month<6)
		 * System.out.println("봄"); else if(month>=6&&month<9) System.out.println("여름");
		 * else if(month>=9&&month<12) System.out.println("가을"); else if(month>12)
		 * System.out.println("잘못입력"); else System.out.println("겨울");
		 * 
		 * switch(month) { case 3,4,5 -> System.out.println("봄"); case 6,7,8 ->
		 * System.out.println("여름"); case 9,10,11 -> System.out.println("가을"); case
		 * 12,1,2 -> System.out.println("겨울"); default -> System.out.println("잘"); }
		 */

		// Runtime.getRuntime().exec("브라우저경로 웹주소")//웹브라우저 켜서 웹주소로 감
		/*
		 * long start = 0, end = 0;
		 * 
		 * start = System.nanoTime(); int[] arr1 = { 1, 2, 3, 4, 5 }; for (Object a :
		 * arr1) System.out.println(a); end = System.nanoTime();
		 * System.out.printf("0.%09ds\n", end - start);
		 */
		/*
		 * start=System.nanoTime(); int[] arr= {1,2,3,4,5}; for(int a : arr)
		 * System.out.println(a); end=System.nanoTime();
		 * System.out.printf("0.%09ds\n",end-start);
		 */
		long start=System.nanoTime();
		int[] arr = new int[300];
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * 1011);
		int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int a : arr) {
			sum += a;
			min = min > a ? a : min;
			max = max < a ? a : max;
			System.out.print(a + " ");
		}
		System.out.println('\n'+"Min : " + min + " Max : " + max);
		System.out.println("Total : " + sum);
		long end=System.nanoTime();
		System.out.printf("0.%09ds\n", end - start);
	}

}
