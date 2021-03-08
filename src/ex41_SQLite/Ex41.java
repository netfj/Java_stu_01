package ex41_SQLite;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Ex41 {
	
	private static String databaseName = null;
	private static Connection connectionDatabase = null;
	private static Statement databseStatement = null;
	private static ResultSet resultSet_sqlExecuteQuery = null;
	
	public static void main(String[] args) throws SQLException {
		
		System.out.println("\n== �����ݿ� ===============");
		databaseName = "test.db";
		databaseLink();
		if(connectionDatabase != null){
			System.out.println("���÷��غ���ԣ����ӳɹ���" + "| �������ݿ⣺"+databaseName);
		}else {
			System.out.println("���÷��غ���ԣ����Ӳ��ɹ���" + "| �������ݿ⣺"+databaseName);
			connectionDatabase = null;
		}
		
		System.out.println("\n== �������ݿ�sql���ӿ� databaseStatement ===========");
		createStatement();
		String info = (databseStatement != null)?"�ӿڴ����ɹ���":"�ӿڴ���ʧ�ܣ�";
		System.out.println("���غ���ԣ�" + info);
		String databseStatementState = (databseStatement.isClosed())?"�ӿ�״̬���ر�":"�ӿ�״̬��������Ч";
		System.out.println(databseStatementState);
		
		System.out.println("\n== test XX =========");
//		test01();
//		test02();
//		test03("����ִ��һ�� sql Update ����");
		test04();	//����sqlExecuteQuery()
		
		
		
//		System.out.println("\n== �ж�һ�����Ƿ���ڣ����ز�����boolean true/false ==");
//		tableIsExist("company");
//		tableIsExist("test");
		
//		System.out.println("== ����һ���� ===============");
//		tableCreate("company_02");
		
		
		
	}
	
	
	public static boolean databaseLink() {
		System.out.println("-- �����ݿ� (û���򴴽�) -----");
		if (databaseName == null) {
			System.out.println("û�д������ݿ����ƣ�");
			return false;
		}
		try {
			Class.forName("org.sqlite.JDBC");
			connectionDatabase = DriverManager.getConnection("jdbc:sqlite:test.db");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			connectionDatabase = null;
			return false;
		}
		return true;
	}
	
	public static boolean createStatement() {
		System.out.println("-- ���� statement(����)�������ݿ�sql��䷢�ͽӿڡ����Դ���sql��� -----");
		if (connectionDatabase == null){
			System.out.println("û�д������ݿ����ӣ�connectionDatabase = null");
			return false;
		}
		
		try {
			databseStatement = connectionDatabase.createStatement();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			databseStatement = null;
			return false;
		}
		
		return true;
	}
	
	public static boolean sqlExecute(String sqlString) throws SQLException {
		System.out.println("-- Statement.execute(sqlString) : ִ��һ��sql���(����), ������ʹ�ñ�����, �����صĽ�����̶��������ж��Ƿ�ɹ� -----");
		if ( databseStatement == null || databseStatement.isClosed()) {
			System.out.println("û�з������ݿ�ӿڣ� statement �ر�");
			return false;
		}
		try {
			boolean suc = databseStatement.execute(sqlString);
			if (suc == false) {
				System.out.println("ִ�� sql ���ʧ�ܡ�sqlString : ");
				System.out.println(sqlString);
				return false;
			}else {
				return true;
			}
			
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			return false;
		}
	}
	
	public static int sqlExecuteUpdate(String sqlUpdateString) throws SQLException{
		System.out.println("-- Statement.executeUpdate(sqlUpdateString) : ִ��һ�� sql Update (DML���ı����ݣ���ɾ�����ݡ�/DDL���ı��ṹ����ɾ��) ��� -----");
		System.out.println("   # ������Ҳ��ִ�� DML���ı����ݣ���ѯ���ݡ������Ƽ�ʹ��ר�õĲ�ѯ���� Statement.executeQuery(sqlString)");
		System.out.println("   # ����ֵ��-2��ʾû�����ݽӿ� statement; -1��ʾִ�з��������ʧ�ܣ� 0����������ʾӰ�쵽������");
		if ( databseStatement == null || databseStatement.isClosed()) {
			System.out.println("û�з������ݿ�ӿڣ� statement �ر�");
			return -2;
		}
		
		try {
			int i = databseStatement.executeUpdate(sqlUpdateString);
			return i;
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.out.println("ִ�� sql ���ʧ�ܡ�sqlString : ");
			System.out.println(sqlUpdateString);
			return -1;
		}
	}
	
	public static boolean sqlExecuteQuery(String sqlExecuteQuery) throws SQLException {
		System.out.println("-- Statement.executeQuery(sqlExecuteQuery) : ִ��һ�� sql Query ��� -----");
		System.out.println("   # ����ֵ��true-ִ�гɹ�; false-ʧ�ܡ��ɹ�ʱ�������صĽ��������������ı������� resultSet_sqlExecuteQuery");
		if ( databseStatement == null || databseStatement.isClosed()) {
			System.out.println("û�з������ݿ�ӿڣ� statement �ر�");
			resultSet_sqlExecuteQuery = null;
			return false;
		}
		
		try {
			ResultSet rSet =  databseStatement.executeQuery(sqlExecuteQuery);
			resultSet_sqlExecuteQuery = rSet;
			return true;
			
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.out.println("ִ�� sql ���ʧ�ܡ�sqlString : ");
			System.out.println(sqlExecuteQuery);
			return false;
		}
	}
	
	public static void sqlExecuteQuery_MetaData() throws SQLException {
		System.out.println(" -- sqlExecuteQuery_MetaData() �� ������Ľṹ, ���� map");
		ResultSetMetaData rSetMetaData = resultSet_sqlExecuteQuery.getMetaData();
		int n = rSetMetaData.getColumnCount();
		Map<String,String> mapMetaData = new HashMap<String, String>();
		
		
		for (int i = 1; i <= rSetMetaData.getColumnCount(); i++) {
			
			
			
			System.out.print("���ֶ�" + i + "��ColumnName: " + rSetMetaData.getColumnName(i));
			System.out.print(" | ColumnLabel: "+ rSetMetaData.getColumnLabel(i));
			System.out.print(" | ColumnTypeName: "+ rSetMetaData.getColumnTypeName(i));
			System.out.print(" | ColumnType: "+ rSetMetaData.getColumnType(i));
			System.out.print(" | ColumnClassName: "+ rSetMetaData.getColumnClassName(i));
			System.out.print(" | ColumnDisplaySize: "+ rSetMetaData.getColumnDisplaySize(i));
			System.out.print(" | TableName: "+ rSetMetaData.getTableName(i));
			System.out.print(" | Precision(����): "+ rSetMetaData.getPrecision(i));
			System.out.print(" | Scale(����): "+ rSetMetaData.getScale(i));
			System.out.print(" | SchemaName(ģʽ����): "+ rSetMetaData.getSchemaName(i));
			
			System.out.println("\n");
		}
		
	}
	
	
	public static boolean tableCreate_OLD(String tableName){
		System.out.println(tableName);
		
		if (tableIsExist(tableName)) {
			System.out.println("���Ѿ����ڣ�");
			return true;
		}
		
		
		Statement stmt = null;
		String sqlString = "create table "+ tableName +
							"(id int primary 	key ," + 
							"name				text,	" + 
							"age				int,		" + 
							"address			char(50)," + 
							"salary				real)" ;
		try {
			stmt = connectionDatabase.createStatement();
			stmt.executeUpdate(sqlString);
			stmt.close();		
			System.out.println("-- ������� ---------");
		} catch (Exception e) {
			System.out.println("-- ����ʧ�ܣ� ԭ��");
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
		
		if (tableIsExist(tableName)) {
			System.out.println("�����ɹ���");
			return true;
		}else {
			System.out.println("����ʧ�ܣ�");
			return true;
		}
	}
	
	public static boolean tableIsExist(String table) {
		String query = "SELECT count(*) FROM sqlite_master " +
                "WHERE type='table' AND name='" + table +"'";
		
		query = "select * from company ";
		
		System.out.println(query);
		Statement stmt = null;
		try {
			stmt = connectionDatabase.createStatement();
			ResultSet rSet = stmt.executeQuery(query);
			System.out.println(rSet.getRow());
			
			while (rSet.next()) {
				System.out.println(rSet.getInt(3));
			}
			
			
		}catch(Exception e){
			System.out.println(" - tableIsExist() ʧ�ܣ�");
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
			

		return false;
		
	}


	public static void test01() throws SQLException {
		System.out.println(" - test01 start ----");
		Statement stmt = connectionDatabase.createStatement();
		System.out.println(" # ��ѯָ���");
		ResultSet rSet = stmt.executeQuery("select * from sqlite_master");
		
		System.out.println("\n # �ֶε���� rSet.getMetaData()");
		ResultSetMetaData rSetMetaData = rSet.getMetaData();
		System.out.println("Class: "+ rSetMetaData.getClass());
		System.out.println("����(�ֶ���)��"+rSetMetaData.getColumnCount());
		for (int i = 1; i <= rSetMetaData.getColumnCount(); i++) {
			System.out.print("���ֶ�" + i + "��ColumnName: " + rSetMetaData.getColumnName(i));
			System.out.print(" | ColumnLabel: "+ rSetMetaData.getColumnLabel(i));
			System.out.print(" | ColumnTypeName: "+ rSetMetaData.getColumnTypeName(i));
			System.out.print(" | ColumnType: "+ rSetMetaData.getColumnType(i));
			System.out.print(" | ColumnClassName: "+ rSetMetaData.getColumnClassName(i));
			System.out.print(" | ColumnDisplaySize: "+ rSetMetaData.getColumnDisplaySize(i));
			System.out.print(" | TableName: "+ rSetMetaData.getTableName(i));
			System.out.print(" | Precision(����): "+ rSetMetaData.getPrecision(i));
			System.out.print(" | Scale(����): "+ rSetMetaData.getScale(i));
			System.out.print(" | SchemaName(ģʽ����): "+ rSetMetaData.getSchemaName(i));
			
			System.out.println("");
		}
		
		
		
		System.out.println("\n # ��ѯ���ص� rSet ");
		while (rSet.next()) {
			
			System.out.print("�� " + rSet.getRow() + " ����¼�����ݣ�");
			
			System.out.print(rSet.getString(1) + "|");
			System.out.print(rSet.getString(2) + "|");
			System.out.print(rSet.getString(3) + "|");
			System.out.print(rSet.getString(4) + "|");
			System.out.println(rSet.getString(5));
			
		}
		
		
		System.out.println(" - test01 end ----");
	}


	public static void test02() {
		
	}


	public static void test03(String str) throws SQLException {
		//"����ִ��һ�� sql Update ����"
		System.out.println("test03(): "+str);
		String tableName = "table_test_01";
		String sqlStringUpdate = "create table "+ tableName +
				"(id int primary 	key ," + 
				"name				text,	" + 
				"age				int,		" + 
				"address			char(50)," + 
				"salary				real)" ;
		System.out.println("����ֵ��"+sqlExecuteUpdate(sqlStringUpdate));
	}
	
	
	public static void test04() throws SQLException {
		System.out.println("-- ���Բ�ѯģ�� sqlExecuteQuery() ");
		String sql = "select * from company";
		boolean bo = sqlExecuteQuery(sql);
		System.out.print("����ֵ��");
		System.out.println(bo);

		System.out.println("-- ���Բ�ѯģ�鷵��ֵ�еģ���ṹ����ģ�� sqlExecuteQuery_MetadSata() ");
		sqlExecuteQuery_MetaData();
	
	}
	
	
}
