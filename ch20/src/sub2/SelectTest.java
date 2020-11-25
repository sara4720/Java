package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * ��¥ : 2020/11/25
 * �̸� : ����
 * ���� : JDBC SELECT �ǽ� ���� p522
 */
public class SelectTest {
 
	public static void main(String[] args) throws Exception {
		
		// DB����
		String host = "jdbc:mysql://192.168.10.114:3306/ksr";
		String user = "ksr";
		String pass = "1234";
		
		// 1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		// 3�ܰ� - SQL ���ఴü ���� 
		Statement stmt = conn.createStatement();
		
		// 4�ܰ� - SQL ����
		String sql = "SELECT * FROM `USER3`";
		ResultSet rs = stmt.executeQuery(sql);
		
		// 5�ܰ� - �����(ResultSet) ó��(SELECT�� ���)
		while(rs.next()) {
			
			String uid = rs.getString(1);
			String name = rs.getString(2);
			String hp = rs.getString(3);
			int age = rs.getInt(4);
			
			System.out.println("======================");
			System.out.println("���̵� : "+uid);
			System.out.println("�̸� : "+name);
			System.out.println("�޴��� : "+hp);
			System.out.println("���� : "+age);
			
		}
		
		
		// 6�ܰ� - �����ͺ��̽� ����
		conn.close();
		
		
		
		
	}
}
