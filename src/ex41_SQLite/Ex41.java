package ex41_SQLite;

import java.sql.*;

public class Ex41 {
	public static void main(String[] args) {
		
		System.out.println("== �����ݿ� ===============");
		Connection c = null;
		c = sqliteLink();
		System.out.println(c);
		
		System.out.println("== ����һ���� ===============");
		createTable(c);
		
	}
	
	
	public static Connection sqliteLink() {
		System.out.println("-- �����ݿ� (û���򴴽�) -----");
		Connection c = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("�����ݿ�ɹ���");
		return c;
	}
	
	
	public static void createTable(Connection c){
		String tableName = "company";
		
		
		
		Statement stmt = null;
		String sqlString = "create table "+ tableName +
							"(id int primary 	key ," + 
							"name				text,	" + 
							"age				int,		" + 
							"address			char(50)," + 
							"salary				real)" ;
		try {
			stmt = c.createStatement();
			stmt.executeUpdate(sqlString);
			stmt.close();		
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("-- �����ɹ��� ---------");
	}
	
	
	
	
	public static boolean tableIsExist(Connection c, String table) {
		
		boolean isExist = true;
		return isExist;
		
	}
	
	
	
	
	
}
