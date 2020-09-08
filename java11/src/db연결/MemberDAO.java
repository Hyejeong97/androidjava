package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// CRUD중심으로 기능을 정의
// 데이터와 관련된 작업(Data Access Object: DAO)

public class MemberDAO {
	// 기능을 정의할 때는 메서드(함수)를 사용
	// create 메서드 호출시 입력값을 받아주는 중간 매개체 역할의 변수
	// => 매개변수(parameter, 파라메터)

	public void create(String id, String pw, String name, String tel) throws Exception {
		// db프로그램 절차에 맞추어서 코딩
		// 1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!");

		// 2. db연결(네트워크 연결, ip주소, id, pw)
		// String url = "연결하는방법 : //ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		// url을 변수에 저장함, java.sql 사용하기
		System.out.println("2. db연결 성공!");

		// 3. sql문을 만든다.(create)
		String sql = "insert into member values (?,?,?,?)";
		// 이중따옴표 안에는 한개의 따옴표 넣기
		// 데이터를 안넣는다면 null로 채우기
		PreparedStatement ps = con.prepareStatement(sql);
		// java.sql 사용하기, ps는 sql을 넣어주는 역할
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL생성 성공!");

		// 4. sql문은 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공!");

	}

	public int read(String id) throws Exception {
		// 1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!");

		// 2. db연결(네트워크 연결, ip주소, id, pw)
		// String url = "연결하는방법 : //ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		// url을 변수에 저장함, java.sql 사용하기
		System.out.println("2. db연결 성공!");

		// 3. sql문을 만든다.(create)
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL생성 성공!");

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공!");
		int result = 0;// 없음.
		if (rs.next() == true) {// 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과가 있어요.");
			result = 1; // 있음.
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			
			System.out.println("검색결과 id: " + id2);
			System.out.println("검색결과 pw: " + pw);
			System.out.println("검색결과 name: " + name);
			System.out.println("검색결과 tel: " + tel);
			
			
		} else {
			System.out.println("검색결과가 없어요.");
		}
		return result;
		// 0이 넘어가면, 검색결과 없음
		// 1이 넘어가면, 검색결과 있음
	}

	public void update(String pw, String name, String tel, String id) throws Exception {
		// 1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!");

		// 2. db연결(네트워크 연결, ip주소, id, pw)
		// String url = "연결하는방법 : //ip:port/db명";
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		// url을 변수에 저장함, java.sql 사용하기
		System.out.println("2. db연결 성공!");

		// 3. sql문을 만든다.
		String sql = "update member set pw = ?, name = ?, tel = ? where id = ?";
		// 이중따옴표 안에는 한개의 따옴표 넣기
		// 데이터를 안넣는다면 null로 채우기
		PreparedStatement ps = con.prepareStatement(sql);
		// java.sql 사용하기, ps는 sql을 넣어주는 역할
		ps.setString(1, pw);
		ps.setString(2, name);
		ps.setString(3, tel);
		ps.setString(4, id);

		System.out.println("3. SQL생성 성공!");

		// 4. sql문은 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공!");

	}

	public void delete(String id) throws Exception {
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!");

		// 2. db연결
		String url = "jdbc:mysql://localhost:3306/shop1";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공!");

		// 3. sql문 생성
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		// java.sql 사용하기, ps는 sql을 넣어주는 역할
		ps.setString(1, id);
		System.out.println("3. SQL생성 성공!");

		// 4. sql문 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공!");
	}
}
