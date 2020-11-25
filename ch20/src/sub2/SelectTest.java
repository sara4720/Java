package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 날짜 : 2020/11/25
 * 이름 : 김사라
 * 내용 : JDBC SELECT 실습 교재 p522
 */
public class SelectTest {
 
	public static void main(String[] args) throws Exception {
		
		// DB정보
		String host = "jdbc:mysql://192.168.10.114:3306/ksr";
		String user = "ksr";
		String pass = "1234";
		
		// 1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		// 3단계 - SQL 실행객체 생성 
		Statement stmt = conn.createStatement();
		
		// 4단계 - SQL 실행
		String sql = "SELECT * FROM `USER3`";
		ResultSet rs = stmt.executeQuery(sql);
		
		// 5단계 - 결과셋(ResultSet) 처리(SELECT일 경우)
		while(rs.next()) {
			
			String uid = rs.getString(1);
			String name = rs.getString(2);
			String hp = rs.getString(3);
			int age = rs.getInt(4);
			
			System.out.println("======================");
			System.out.println("아이디 : "+uid);
			System.out.println("이름 : "+name);
			System.out.println("휴대폰 : "+hp);
			System.out.println("나이 : "+age);
			
		}
		
		
		// 6단계 - 데이터베이스 종료
		conn.close();
		
		
		
		
	}
}
