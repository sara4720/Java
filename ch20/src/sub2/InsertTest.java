package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2020/11/25
 * �̸� : ����
 * ���� : JDBC INSERT �ǽ� ���� p522
 */
public class InsertTest {

	public static void main(String[] args) {

		
		// DB����
		String host = "jdbc:mysql://192.168.10.114:3306/ksr";
		String user = "ksr";
		String pass = "1234";
		
		try {
		// 1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host,user,pass);
		
		// 3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();
		
		// 4�ܰ� - SQL ����
		String sql = "INSERT INTO `USER3` VALUES ('B101','ȫ�浿','010-1234-1117',17)";
		String sql2 = "INSERT INTO `USER3` VALUES ('B102','������','010-1234-1118',18)";
		String sql3 = "INSERT INTO `USER3` VALUES ('B103','�̼���','010-1234-1119',19)";
		String sql4 = "INSERT INTO `USER3` VALUES ('B106','�庸��','010-1234-1122',22)";
		String sql5 = "INSERT INTO `USER3` VALUES ('B104','��ö��','010-1234-1120',20)";
		String sql6 = "INSERT INTO `USER3` VALUES ('B105','�����ż�','010-1234-1121',21)";
		stmt.executeUpdate(sql);
		
		// 5�ܰ� - �����(ResultSet) ó��(SELECT�� ���)
		
		
		// 6�ܰ� - �����ͺ��̽� ����
		conn.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("INSERT �Ϸ�");


		
		
	}
}
