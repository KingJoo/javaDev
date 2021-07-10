package library.String;
import java.sql.*;
import java.util.Scanner;
/*
"따라따라,"
+"parachute,"
+"좋은 사람 있으면 소개시켜줘,"
+"On My Way,"
+"Into the I-LAND,"
+"Shape Of You,"
+"다시 여기 바닷가,"
+"Way Back Home,"
+"고맙소,"
+"팔레트 (Feat. G-DRAGON),"
+"그때가 좋았어,"
+"다시 만날까 봐,"
+"HIP,"
+"Blue & Grey,"
+"미친 소리,"
+"Stuck With U,"
+"그대라는 시,"
+"애인이 되어줄게요 (Prod. by 알고보니 & 혼수상태),"
+"덤디덤디 (DUMDi DUMDi),"
+"소확행,"
+"YOUTH,"
+"Mood (Feat. Iann Dior),"
+"누구 없소,"
+"사랑은 지날수록 더욱 선명하게 남아,"
+"Square (2017),"
+"선물,"
+"나만의 길 (My Way),"
+"사랑이란 멜로는 없어,"
+"페데리코의 탄식 (Lamento Di Federico),"
+"Black Mamba,"
+"할무니,"
+"기억해줘요 내 모든 날과 그때를,"
+"MAGO,"
+"잠시,"
+"니 소식,"
+"Psycho,"
+"오래된 노래,"
+"여백의 미 (Feat. Jessi & JUSTHIS) (Prod. by GroovyRoom),"
+"별은 빛나건만 (E Lucevan Le Stelle),"
+"Celebrity,"
+"고백 (바른연애 길잡이 X 허각),"
+"뒤돌아보지 말아요,"
+"이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM),"
+"술 한잔 해요,"
+"Dynamite,"
+"우린 어쩌다 헤어진 걸까,"
+"I'm Not Cool,"
+"VVS (Feat. JUSTHIS) (Prod. by GroovyRoom),"
+"밤하늘의 별을 (2020),"
+"마음이 그래"
 */
public class StringPracNDatabaseConnection {
	public static void main(String[] args) {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 등록
//			String url = "jdbc:oracle:thin:@211.238.142.181:1521:XE";
//			Connection conn = DriverManager.getConnection(url,"hr","happy");
//			String sql = "select title,rownum from genie_music where rownum<=50";
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getString(1));
//			}
//			rs.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		String s = "따라따라,"
				+"parachute,"
				+"좋은 사람 있으면 소개시켜줘,"
				+"On My Way,"
				+"Into the I-LAND,"
				+"Shape Of You,"
				+"다시 여기 바닷가,"
				+"Way Back Home,"
				+"고맙소,"
				+"팔레트 (Feat. G-DRAGON),"
				+"그때가 좋았어,"
				+"다시 만날까 봐,"
				+"HIP,"
				+"Blue & Grey,"
				+"미친 소리,"
				+"Stuck With U,"
				+"그대라는 시,"
				+"애인이 되어줄게요 (Prod. by 알고보니 & 혼수상태),"
				+"덤디덤디 (DUMDi DUMDi),"
				+"소확행,"
				+"YOUTH,"
				+"Mood (Feat. Iann Dior),"
				+"누구 없소,"
				+"사랑은 지날수록 더욱 선명하게 남아,"
				+"Square (2017),"
				+"선물,"
				+"나만의 길 (My Way),"
				+"사랑이란 멜로는 없어,"
				+"페데리코의 탄식 (Lamento Di Federico),"
				+"Black Mamba,"
				+"할무니,"
				+"기억해줘요 내 모든 날과 그때를,"
				+"MAGO,"
				+"잠시,"
				+"니 소식,"
				+"Psycho,"
				+"오래된 노래,"
				+"여백의 미 (Feat. Jessi & JUSTHIS) (Prod. by GroovyRoom),"
				+"별은 빛나건만 (E Lucevan Le Stelle),"
				+"Celebrity,"
				+"고백 (바른연애 길잡이 X 허각),"
				+"뒤돌아보지 말아요,"
				+"이 밤을 빌려 말해요 (바른연애 길잡이 X 10CM),"
				+"술 한잔 해요,"
				+"Dynamite,"
				+"우린 어쩌다 헤어진 걸까,"
				+"I'm Not Cool,"
				+"VVS (Feat. JUSTHIS) (Prod. by GroovyRoom),"
				+"밤하늘의 별을 (2020),"
				+"마음이 그래";
		
		//split()
		/*
		 * String[] strArr = s.split(","); for(String str : strArr)
		 * System.out.println(str);
		 * System.out.println("=====================================");
		 */
		
		//찾기
		/*
		 * System.out.print("검색어 입력 : "); Scanner sc = new Scanner(System.in); String fd
		 * = sc.next();
		 */
		
		//contains()
		/*
		 * boolean ck = false; for(String str : strArr) { if(str.contains(fd)) {
		 * System.out.println(str); ck = true; } } if(!ck)
		 * System.out.println("검색어가 없습니다.");
		 */
		
		//startsWith()
		/*
		 * boolean ck = false; for(String str : strArr) { if(str.startsWith(fd)) {
		 * System.out.println(str); ck=true; } } if(!ck)
		 * System.out.println("검색어가 없습니다.");
		 */
		
		//endsWith()
		/*
		 * boolean ck = false; for(String str : strArr) { if(str.endsWith(fd)) {
		 * System.out.println(str); ck=true; } } if(!ck)
		 * System.out.println("검색어가 없습니다.");
		 */
		
		//substring()
		/*
		 * String ss = "0123456789"; System.out.println(ss.substring(1,4));
		 * System.out.println(ss.substring(5));
		 */
		
		//length()
		/*
		 * String[] title = {"좋은 사람 있으면 소개시켜줘","다시 만날까 봐"}; for(String str : title) {
		 * if(str.length()>8) System.out.println(str.substring(0,8)+"..."); else
		 * System.out.println(str); }
		 */
		
		//join()
		/*
		 * String[] strArr = s.split(","); String tmp = String.join(", ", strArr);
		 * System.out.println(tmp);
		 */
		
		//replace(old,new), replaceAll(정규식문자열,해당하지 않는 문자를 바꿀 문자열)
		/*
		 * String data = "Hello java"; System.out.println(data.replace("H", "F"));
		 * System.out.println(data.replace("Hello", "java")); int rank =
		 * (int)(Math.random()*500)+1; String data2 = rank+"좋은 사람 있으면 소개시켜줘"; String
		 * num=data2.replaceAll("[^0-9]",""); String
		 * title=data2.replaceAll("[^가-힣]",""); System.out.println("rank : "+ rank);
		 * System.out.println("title : "+ title);
		 */
		
		
	}
}
