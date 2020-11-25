package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2020/11/25
 * 이름 : 김사라
 * 내용 : JDBC UPDATE 실습 교재 p522
 */
public class UpdateTest {

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
		String sql = "UPDATE `USER3` SET ";
		sql += "`name` = '임꺽정', ";
		sql += "`age` = 51 ";
		sql += "WHERE `uid` = 'B102'";
		
		stmt.execute(sql);
		       
		// 5단계 - 결과셋(ResultSet) 처리(SELECT일 경우)
		
		       
		// 6단계 - 데이터베이스 종료
		conn.close();
		System.out.println("UPDATE 완료...");
	}
}
