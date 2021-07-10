package try_catch;

import java.sql.*;
import java.util.*;

/*
 * 	자바 응용프로그램 <===================> 	오라클
 * 										데이터 저장
 * 	=> 네트워크(반드시 예외처리)
 * 		1. 드라이버 설정
 * 		2. 연결
 * 		3. SQL문장 전송
 * 		4. 결과값 받기
 * 		5. 연결 해제
 */

public class EmpDAO {
	private Connection conn; //오라클 연결 -> 포함 클래스
	private PreparedStatement ps; //SQL문장 전송 -> 결과값을 받아옴
	private final String URL="jdbc:oracle:thin:@211.238.142.181:1521:XE";
	// XE : 데이터베이스(저장장소 -> 파일, 데이터베이스 -> 테이블)
	// 초기화 : 드라이버 등록 -> 구현
	public EmpDAO() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버매니저 생성
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// 연결
	public void getConnection() {
		try {
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(SQLException e){
			e.getMessage();
		}
	}
	// 연결 해제
	public void disConnection() {
		try {
			if(ps!=null)	ps.close(); // 통신선 
			if(conn!=null)	conn.close(); // 연결 되어 있다면 종료!! -> 전화
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Emp[] empAllData() {
		Emp[] emp = new Emp[14];
		try {
			//연결
			getConnection();
			String sql = "SELECT empno,ename,job,sal FROM emp";// SQL(데이터 검색 : SELECT)
			ps = conn.prepareStatement(sql); // 오라클로 전송할 문장
			ResultSet rs = ps.executeQuery(); // 결과값 읽기 
			int i=0;
			while(rs.next()) {
				emp[i]=new Emp();
				emp[i].setEmpno(rs.getInt(1));
				emp[i].setEname(rs.getString(2));
				emp[i].setJob(rs.getString(3));
				emp[i].setSal(rs.getInt(4));
				i++;
			}
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally { // 무조건 수행 -> 서버 종료, 파일 닫기 
			disConnection(); // 오라클 서버 연결 해제
		}
		return emp;
	}
}
