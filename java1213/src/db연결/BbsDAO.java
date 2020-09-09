package db����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

	public BbsVO one(int no) throws Exception {

		// 1. connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����.!!");

		// 2. db����
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����.!!");

		// 3. sql���� �����.
		String sql = "select * from bbs where no = ?";
		// select * from member where id = 'park' //setString
		// select * from bbs where no = 1 //setInt
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);

		// 4. sql���� ����
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ����.!!");
		BbsVO bag = new BbsVO();// ���游��,
		if (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
			System.out.println("�˻������ �־��.");
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");
			// ���濡 �ֱ�
			bag.setNo(no2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
			System.out.println("�˻���� ino2: " + no2);
			System.out.println("�˻���� title: " + title);
			System.out.println("�˻���� content: " + content);
			System.out.println("�˻���� writer: " + writer);
		} else {
			System.out.println("�˻������ �����.");
		}
		return bag;
		// bag�� ������ ����, �ּҸ� ����!
	}
	
	public ArrayList<BbsVO> all() throws Exception {
		// �����̳� �ȿ� ���游 �ֱ�
		// ������ �ִ� �����̳� ������ �ϰ� ��!
		// <>�ȿ��� �����̳ʿ� ������ ������ ����!
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		// list => ������� ���� �������
		
		// 1. connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����.!!");

		// 2. db����
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����.!!");

		// 3. sql���� �����.
		String sql = "select * from bbs";
		// select * from member where id = 'park' //setString
		// select * from bbs where no = 1 //setInt
		PreparedStatement ps = con.prepareStatement(sql);

		// 4. sql���� ����
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ����.!!");
		while (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
			BbsVO bag = new BbsVO();// ���游��,
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");//�ϳ��� ��������
			// ���濡 �ֱ�
			bag.setNo(no2);// Ŀ��(��ġ �˷��ִ� ����)
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
			// �����̳ʿ� �ֱ�
			list.add(bag);
		} 
		return list; // ���� ����
		// bag�� ������ ����, �ּҸ� ����!
	}

	public void update(BbsVO bag) throws Exception {
		// 1. connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����!");

		// 2. db����
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����!");

		// 3. sql���� �����.
		String sql = "update bbs set title = ?, content = ?, writer = ? where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getTitle());
		ps.setString(2, bag.getContent());
		ps.setString(3, bag.getWriter());
		ps.setInt(4, bag.getNo());

		System.out.println("3. SQL���� ����!");

		// 4. sql���� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����!");

	}

	// �� ����
	public void delete(BbsVO bag) throws Exception {
		// 1. connector ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����!");

		// 2. db����
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����!");

		// 3. sql�� ����
		String sql = "delete from bbs where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bag.getNo());
		System.out.println("3. SQL���� ����!");

		// 4. sql�� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����!");
	}

}
