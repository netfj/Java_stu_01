package ex41_SQLite;

import java.sql.*;

public class Ex41 {
	public static void main(String[] args) {
		
		System.out.println("== 打开数据库 ===============");
		Connection c = null;
		c = sqliteLink();
		System.out.println(c);
		
		System.out.println("== 创建一个表 ===============");
		createTable(c);
		
	}
	
	
	public static Connection sqliteLink() {
		System.out.println("-- 打开数据库 (没有则创建) -----");
		Connection c = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("打开数据库成功！");
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
		System.out.println("-- 表创建成功！ ---------");
	}
	
	
	
	
	public static boolean tableIsExist(Connection c, String table) {
		
		boolean isExist = true;
		return isExist;
		
	}
	
	
	
	
	
}
