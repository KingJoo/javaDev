package library.text.DAO;

import java.util.*;
import java.sql.*;

public class EmpDAO {
	private Connection conn; // 오라클 연결
	private PreparedStatement ps; // 오라클 통신 (SQL 문장 전송 = 데이터 읽기)
	// 폴더(데이터베이스), 파일(테이블->구분해서 저장되어 있음)
	private final String URL="jdbc:oracle:thin:@211.238.142.181:1521:XE";
	// 1. 드라이버 등록(한번만), 초기 -> 한번만 호출하는 메소드 = 생성자
	public EmpDAO(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// 드라이버 등록(in ojdbc.jar)
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 2. 오라클 연결
	public void getConnection() {
		try {
			conn=DriverManager.getConnection(URL,"hr","happy");//실무에서 IP(url),계정(user,pw) 보안필요
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 3. 오라클 연결 해제
	public void disConnection() {
		try {
			if(ps!=null)	ps.close();
			if(conn!=null)	conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	// 4. 기능 -> 데이터 읽기, 쓰기, 생성, 삭제~(CRUD 중 지금은 읽기만).
	public Emp[] empListData() {
		Emp[] emp = new Emp[14];
		try {
			// 1. 연결
			getConnection();
			// 2. 오라클로 문장 전송
			String sql = "select * from emp";// SQL(데이터 검색 : SELECT)
			ps = conn.prepareStatement(sql); // 오라클로 전송할 문장
			// 3. 실행 후에 결과값 받음
			ResultSet rs = ps.executeQuery(); // 결과값 <- 쿼리문 실행
			// 4. 받은 값을 Emp[]에 저장
			int i=0;
			while(rs.next()) { // 1개의 row씩 읽어옴(위에서부터 - next() / 밑에서부터 - previous())
				emp[i]=new Emp(); // 메모리 할당
				emp[i].setEmpno(rs.getInt(1));
				emp[i].setEname(rs.getString(2));
				emp[i].setJob(rs.getString(3));
				emp[i].setMgr(rs.getInt(4));
				emp[i].setHiredate(rs.getDate(5));
				emp[i].setSal(rs.getInt(6));
				emp[i].setComm(rs.getInt(7));
				emp[i].setDeptno(rs.getInt(8));
				i++;
			}
			rs.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			disConnection(); // 연결 해제
		}
		return emp;
	}
}
