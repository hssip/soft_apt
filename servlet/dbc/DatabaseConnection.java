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
			//System.out.println("δ�ܳɹ������������������Ƿ�����������");
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
				// TODO �Զ����ɵ� catch ��
				//e.printStackTrace();
				throw e;
			}
		}
	}
	
	
}
