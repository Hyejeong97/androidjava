package db����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// CRUD�߽����� ����� ����
// �����Ϳ� ���õ� �۾�(Data Access Object: DAO)

public class DB��������Ŭ���� {
	// ����� ������ ���� �޼���(�Լ�)�� ���
	// create �޼��� ȣ��� �Է°��� �޾��ִ� �߰� �Ű�ü ������ ����
	// => �Ű�����(parameter, �Ķ����)

	public void create(String id, String pw, String name, String tel) throws Exception {
		// db���α׷� ������ ���߾ �ڵ�
		// 1. connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����!");

		// 2. db����(��Ʈ��ũ ����, ip�ּ�, id, pw)
		// String url = "�����ϴ¹�� : //ip:port/db��";
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		// url�� ������ ������, java.sql ����ϱ�
		System.out.println("2. db���� ����!");

		// 3. sql���� �����.(create)
		String sql = "insert into member values (?,?,?,?)";
		// ���ߵ���ǥ �ȿ��� �Ѱ��� ����ǥ �ֱ�
		// �����͸� �ȳִ´ٸ� null�� ä���
		PreparedStatement ps = con.prepareStatement(sql);
		// java.sql ����ϱ�, ps�� sql�� �־��ִ� ����
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL���� ����!");

		// 4. sql���� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����!");

	}

//	public void read() {
//		// 1. connector����
//		Class.forName("com.mysql.jdbc.Driver");
//		System.out.println("1. connector���� ����!");
//
//		// 2. db����(��Ʈ��ũ ����, ip�ּ�, id, pw)
//		// String url = "�����ϴ¹�� : //ip:port/db��";
//		String url = "jdbc:mysql://localhost:3306/shop1";
//		String user = "root";
//		String password = "";
//		Connection con = DriverManager.getConnection(url, user, password);
//		// url�� ������ ������, java.sql ����ϱ�
//		System.out.println("2. db���� ����!");
//
//		// 3. sql���� �����.(create)
//		String sql = "insert into member values (?,?,?,?)";
//		// ���ߵ���ǥ �ȿ��� �Ѱ��� ����ǥ �ֱ�
//		// �����͸� �ȳִ´ٸ� null�� ä���
//		PreparedStatement ps = con.prepareStatement(sql);
//		// java.sql ����ϱ�, ps�� sql�� �־��ִ� ����
//		ps.setString(1, id);
//		ps.setString(2, pw);
//		ps.setString(3, name);
//		ps.setString(4, tel);
//		System.out.println("3. SQL���� ����!");
//
//		// 4. sql���� ����
//		ps.executeUpdate();
//		System.out.println("4. SQL�� ���� ����!");
//	}

	public void update(String tel, String id) throws Exception {
		// 1. connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����!");

		// 2. db����(��Ʈ��ũ ����, ip�ּ�, id, pw)
		// String url = "�����ϴ¹�� : //ip:port/db��";
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		// url�� ������ ������, java.sql ����ϱ�
		System.out.println("2. db���� ����!");

		// 3. sql���� �����.
		String sql = "update member set tel = ? where id = ?";
		// ���ߵ���ǥ �ȿ��� �Ѱ��� ����ǥ �ֱ�
		// �����͸� �ȳִ´ٸ� null�� ä���
		PreparedStatement ps = con.prepareStatement(sql);
		// java.sql ����ϱ�, ps�� sql�� �־��ִ� ����
		ps.setString(1, tel);
		ps.setString(2, id);

		System.out.println("3. SQL���� ����!");

		// 4. sql���� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����!");

	}

	public void delete(String id) throws Exception {
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
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		// java.sql ����ϱ�, ps�� sql�� �־��ִ� ����
		ps.setString(1, id);
		System.out.println("3. SQL���� ����!");

		// 4. sql�� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����!");
	}
}
