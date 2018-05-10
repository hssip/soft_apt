package dbc;

import java.sql.*;

public class DatabaseConnection {
	private static final String URL="jdbc:mysql://localhost:3306/mine";
	private static final String password="root";//MYSQLfmyzc123$";
	private static final String dname="root";
	private static final String driver="com.mysql.jdbc.Driver";
	private Connection conn=null;
	
	public DatabaseConnection() throws Exception{
		try{
			Class.forName(driver);
			this.conn=DriverManager.getConnection(URL,dname,password);
		}catch (Exception e){
			//System.out.println("未能成功加载驱动程序，请检查是否导入驱动程序！");
			throw e;
			//e.printStackTrace();
		}
	}
	public Connection getConnection(){
		return this.conn;
	}
	public void close() throws SQLException{
		if(this.conn!=null){
			try {
				this.conn.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				//e.printStackTrace();
				throw e;
			}
		}
	}
	
	
}
