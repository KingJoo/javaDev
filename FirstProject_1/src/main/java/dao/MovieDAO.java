package dao;
import java.util.*;
import java.sql.*;
public class MovieDAO {
	// 오라클 연결 객체
	private Connection conn;//포함 기법
	// 오라클 SQL문장 객체
	private PreparedStatement ps;
	// 오라클 연결 주소
	private final String URL="jdbc:oracle:thin:@211.238.142.181:1521:XE";
	
	// 프로그램
	//1. 드라이버 등록 초기화
	MovieDAO(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//forName(String s) throws ClassNotFoundException
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//2. 오라클 연결
	public void getConnection() {
		try {
			conn=DriverManager.getConnection(URL,"hr","happy");//오라클 명령어 : conn hr/happy
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//3. 오라클 해제
	public void disConnection() {
		try {
			// exit
			if(ps!=null)	ps.close();
			if(conn!=null)	conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//4. 기능 : 네이버 영화 전체 읽어오기 -> 메모리 저장(고정-배열/가변-리스트)
	public ArrayList<Movie> movieAllData(){
		ArrayList<Movie> list = new ArrayList<>();
		try {
			//연결
			getConnection();
			//SQL문장 제작
			String sql = "SELECT mno,title,genre,director,actor,story,poster FROM naver_movie "
					+"ORDER BY mno ASC";
			ps=conn.prepareStatement(sql);
			//SQL문장 전송
			ResultSet rs = ps.executeQuery();
			//오라클로부터 데이터 받기
			int i=0;
			while(rs.next()) {
				Movie m = new Movie();
				m.setMno(rs.getInt(1));
				m.setTitle(rs.getString(2));
				m.setGenre(rs.getString(3));
				m.setDirector(rs.getString(4));
				m.setActor(rs.getString(5));
				m.setStory(rs.getString(6));
				m.setPoster(rs.getString(7));
				list.add(m);
				i++;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			disConnection();
		}
		return list;
	}
}
