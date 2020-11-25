package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2020/11/25
 * 이름 : 김사라
 * 내용 : JDBC INSERT 실습 교재 p522
 */
public class InsertTest {

	public static void main(String[] args) {

		
		// DB정보
		String host = "jdbc:mysql://192.168.10.114:3306/ksr";
		String user = "ksr";
		String pass = "1234";
		
		try {
		// 1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host,user,pass);
		
		// 3단계 - SQL 실행객체 생성
		Statement stmt = conn.createStatement();
		
		// 4단계 - SQL 실행
		String sql = "INSERT INTO `USER3` VALUES ('B101','홍길동','010-1234-1117',17)";
		String sql2 = "INSERT INTO `USER3` VALUES ('B102','강감찬','010-1234-1118',18)";
		String sql3 = "INSERT INTO `USER3` VALUES ('B103','이순신','010-1234-1119',19)";
		String sql4 = "INSERT INTO `USER3` VALUES ('B106','장보고','010-1234-1122',22)";
		String sql5 = "INSERT INTO `USER3` VALUES ('B104','김철수','010-1234-1120',20)";
		String sql6 = "INSERT INTO `USER3` VALUES ('B105','박혁거세','010-1234-1121',21)";
		stmt.executeUpdate(sql);
		
		// 5단계 - 결과셋(ResultSet) 처리(SELECT일 경우)
		
		
		// 6단계 - 데이터베이스 종료
		conn.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("INSERT 완료");


		
		
	}
}
