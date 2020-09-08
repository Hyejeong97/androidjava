package db����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// CRUD�߽����� ����� ����
// �����Ϳ� ���õ� �۾�(Data Access Object: DAO)

public class MemberDAO {
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

	public int read(String id) throws Exception {
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
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL���� ����!");

		// 4. sql���� ����
		// select�� ����� �˻������ ��� ���̺�(�׸�+����)
		// ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ����!");
		int result = 0;// ����.
		if (rs.next() == true) {// ����� �ִ��� ������ üũ���ִ� �޼���
			System.out.println("�˻������ �־��.");
			result = 1; // ����.
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			
			System.out.println("�˻���� id: " + id2);
			System.out.println("�˻���� pw: " + pw);
			System.out.println("�˻���� name: " + name);
			System.out.println("�˻���� tel: " + tel);
			
			
		} else {
			System.out.println("�˻������ �����.");
		}
		return result;
		// 0�� �Ѿ��, �˻���� ����
		// 1�� �Ѿ��, �˻���� ����
	}

	public void update(String pw, String name, String tel, String id) throws Exception {
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
		String sql = "update member set pw = ?, name = ?, tel = ? where id = ?";
		// ���ߵ���ǥ �ȿ��� �Ѱ��� ����ǥ �ֱ�
		// �����͸� �ȳִ´ٸ� null�� ä���
		PreparedStatement ps = con.prepareStatement(sql);
		// java.sql ����ϱ�, ps�� sql�� �־��ִ� ����
		ps.setString(1, pw);
		ps.setString(2, name);
		ps.setString(3, tel);
		ps.setString(4, id);

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
