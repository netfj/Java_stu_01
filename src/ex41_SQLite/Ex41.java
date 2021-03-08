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
		
		System.out.println("\n== 打开数据库 ===============");
		databaseName = "test.db";
		databaseLink();
		if(connectionDatabase != null){
			System.out.println("调用返回后测试：连接成功！" + "| 连接数据库："+databaseName);
		}else {
			System.out.println("调用返回后测试：连接不成功！" + "| 连接数据库："+databaseName);
			connectionDatabase = null;
		}
		
		System.out.println("\n== 创建数据库sql语句接口 databaseStatement ===========");
		createStatement();
		String info = (databseStatement != null)?"接口创建成功。":"接口创建失败！";
		System.out.println("返回后测试：" + info);
		String databseStatementState = (databseStatement.isClosed())?"接口状态：关闭":"接口状态：保持有效";
		System.out.println(databseStatementState);
		
		System.out.println("\n== test XX =========");
//		test01();
//		test02();
//		test03("测试执行一条 sql Update 命令");
		test04();	//测试sqlExecuteQuery()
		
		
		
//		System.out.println("\n== 判断一个表是否存在，返回参数：boolean true/false ==");
//		tableIsExist("company");
//		tableIsExist("test");
		
//		System.out.println("== 创建一个表 ===============");
//		tableCreate("company_02");
		
		
		
	}
	
	
	public static boolean databaseLink() {
		System.out.println("-- 打开数据库 (没有则创建) -----");
		if (databaseName == null) {
			System.out.println("没有传入数据库名称！");
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
		System.out.println("-- 创建 statement(声明)对象【数据库sql语句发送接口】，以传递sql语句 -----");
		if (connectionDatabase == null){
			System.out.println("没有创建数据库连接：connectionDatabase = null");
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
		System.out.println("-- Statement.execute(sqlString) : 执行一条sql语句(任意), 不建议使用本功能, 它返回的结果不固定，不好判断是否成功 -----");
		if ( databseStatement == null || databseStatement.isClosed()) {
			System.out.println("没有发现数据库接口， statement 关闭");
			return false;
		}
		try {
			boolean suc = databseStatement.execute(sqlString);
			if (suc == false) {
				System.out.println("执行 sql 语句失败。sqlString : ");
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
		System.out.println("-- Statement.executeUpdate(sqlUpdateString) : 执行一条 sql Update (DML【改变数据：增删改数据】/DDL【改变表结构：建删表】) 语句 -----");
		System.out.println("   # 本命令也可执行 DML【改变数据：查询数据】，但推荐使用专用的查询方法 Statement.executeQuery(sqlString)");
		System.out.println("   # 返回值：-2表示没有数据接口 statement; -1表示执行发生错误或失败； 0与正整数表示影响到的行数");
		if ( databseStatement == null || databseStatement.isClosed()) {
			System.out.println("没有发现数据库接口， statement 关闭");
			return -2;
		}
		
		try {
			int i = databseStatement.executeUpdate(sqlUpdateString);
			return i;
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.out.println("执行 sql 语句失败。sqlString : ");
			System.out.println(sqlUpdateString);
			return -1;
		}
	}
	
	public static boolean sqlExecuteQuery(String sqlExecuteQuery) throws SQLException {
		System.out.println("-- Statement.executeQuery(sqlExecuteQuery) : 执行一条 sql Query 语句 -----");
		System.out.println("   # 返回值：true-执行成功; false-失败。成功时，将返回的结果集，保存在类的变量对象 resultSet_sqlExecuteQuery");
		if ( databseStatement == null || databseStatement.isClosed()) {
			System.out.println("没有发现数据库接口， statement 关闭");
			resultSet_sqlExecuteQuery = null;
			return false;
		}
		
		try {
			ResultSet rSet =  databseStatement.executeQuery(sqlExecuteQuery);
			resultSet_sqlExecuteQuery = rSet;
			return true;
			
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.out.println("执行 sql 语句失败。sqlString : ");
			System.out.println(sqlExecuteQuery);
			return false;
		}
	}
	
	public static void sqlExecuteQuery_MetaData() throws SQLException {
		System.out.println(" -- sqlExecuteQuery_MetaData() ： 解析表的结构, 返回 map");
		ResultSetMetaData rSetMetaData = resultSet_sqlExecuteQuery.getMetaData();
		int n = rSetMetaData.getColumnCount();
		Map<String,String> mapMetaData = new HashMap<String, String>();
		
		
		for (int i = 1; i <= rSetMetaData.getColumnCount(); i++) {
			
			
			
			System.out.print("【字段" + i + "】ColumnName: " + rSetMetaData.getColumnName(i));
			System.out.print(" | ColumnLabel: "+ rSetMetaData.getColumnLabel(i));
			System.out.print(" | ColumnTypeName: "+ rSetMetaData.getColumnTypeName(i));
			System.out.print(" | ColumnType: "+ rSetMetaData.getColumnType(i));
			System.out.print(" | ColumnClassName: "+ rSetMetaData.getColumnClassName(i));
			System.out.print(" | ColumnDisplaySize: "+ rSetMetaData.getColumnDisplaySize(i));
			System.out.print(" | TableName: "+ rSetMetaData.getTableName(i));
			System.out.print(" | Precision(精度): "+ rSetMetaData.getPrecision(i));
			System.out.print(" | Scale(比例): "+ rSetMetaData.getScale(i));
			System.out.print(" | SchemaName(模式名称): "+ rSetMetaData.getSchemaName(i));
			
			System.out.println("\n");
		}
		
	}
	
	
	public static boolean tableCreate_OLD(String tableName){
		System.out.println(tableName);
		
		if (tableIsExist(tableName)) {
			System.out.println("表已经存在！");
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
			System.out.println("-- 表创建完成 ---------");
		} catch (Exception e) {
			System.out.println("-- 表创建失败！ 原因：");
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
		
		if (tableIsExist(tableName)) {
			System.out.println("表创建成功！");
			return true;
		}else {
			System.out.println("表创建失败！");
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
			System.out.println(" - tableIsExist() 失败：");
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
			

		return false;
		
	}


	public static void test01() throws SQLException {
		System.out.println(" - test01 start ----");
		Statement stmt = connectionDatabase.createStatement();
		System.out.println(" # 查询指令发出");
		ResultSet rSet = stmt.executeQuery("select * from sqlite_master");
		
		System.out.println("\n # 字段的情况 rSet.getMetaData()");
		ResultSetMetaData rSetMetaData = rSet.getMetaData();
		System.out.println("Class: "+ rSetMetaData.getClass());
		System.out.println("列数(字段数)："+rSetMetaData.getColumnCount());
		for (int i = 1; i <= rSetMetaData.getColumnCount(); i++) {
			System.out.print("【字段" + i + "】ColumnName: " + rSetMetaData.getColumnName(i));
			System.out.print(" | ColumnLabel: "+ rSetMetaData.getColumnLabel(i));
			System.out.print(" | ColumnTypeName: "+ rSetMetaData.getColumnTypeName(i));
			System.out.print(" | ColumnType: "+ rSetMetaData.getColumnType(i));
			System.out.print(" | ColumnClassName: "+ rSetMetaData.getColumnClassName(i));
			System.out.print(" | ColumnDisplaySize: "+ rSetMetaData.getColumnDisplaySize(i));
			System.out.print(" | TableName: "+ rSetMetaData.getTableName(i));
			System.out.print(" | Precision(精度): "+ rSetMetaData.getPrecision(i));
			System.out.print(" | Scale(比例): "+ rSetMetaData.getScale(i));
			System.out.print(" | SchemaName(模式名称): "+ rSetMetaData.getSchemaName(i));
			
			System.out.println("");
		}
		
		
		
		System.out.println("\n # 查询返回的 rSet ");
		while (rSet.next()) {
			
			System.out.print("第 " + rSet.getRow() + " 条记录的内容：");
			
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
		//"测试执行一条 sql Update 命令"
		System.out.println("test03(): "+str);
		String tableName = "table_test_01";
		String sqlStringUpdate = "create table "+ tableName +
				"(id int primary 	key ," + 
				"name				text,	" + 
				"age				int,		" + 
				"address			char(50)," + 
				"salary				real)" ;
		System.out.println("返回值："+sqlExecuteUpdate(sqlStringUpdate));
	}
	
	
	public static void test04() throws SQLException {
		System.out.println("-- 测试查询模块 sqlExecuteQuery() ");
		String sql = "select * from company";
		boolean bo = sqlExecuteQuery(sql);
		System.out.print("返回值：");
		System.out.println(bo);

		System.out.println("-- 测试查询模块返回值中的，表结构解析模块 sqlExecuteQuery_MetadSata() ");
		sqlExecuteQuery_MetaData();
	
	}
	
	
}
