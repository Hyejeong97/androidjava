package db����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BbsDAO {

	public void create(BbsVO bag) throws Exception {
		// 1.connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����!");

		// 2.db����
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����!");

		// 3.sql�� ����
		String sql = "insert into bbs values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bag.getNo());
		ps.setString(2, bag.getTitle());
		ps.setString(3, bag.getContent());
		ps.setString(4, bag.getWriter());
		System.out.println("3. SQL���� ����!");

		// 4. sql�� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����!");

	}

	

	

}
