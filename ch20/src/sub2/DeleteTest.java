package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2020/11/25
 * �̸� : ����
 * ���� : JDBC DELETE �ǽ� ���� p522
 */
public class DeleteTest {

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
		
		String sql = "DELETE FROM `USER3` WHERE `uid` = 'B101' ";

		stmt.execute(sql);
		       
		// 5�ܰ� - �����(ResultSet) ó��(SELECT�� ���)
		
		// 6�ܰ� - �����ͺ��̽� ����
		conn.close();
		System.out.println("UPDATE �Ϸ�...");
	}
}
