package kr.or.ddit.study06.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	private static Connection conn = null;
	
	public static Connection getConnection() {
		
		//localhost <- IP:1521 <-PORT : xe <- SID
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "PSA92";
		String pwd = "java";
		
		if(conn==null) {		
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, user, pwd);
				}catch (SQLException e) {
					e.printStackTrace();
				}
				catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return conn;
	}
}
