package kr.or.ddit.study06.sec05;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnMain {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	public static void main(String[] args) {
		DBConnMain db = new DBConnMain();
		db.selectAll();
	}
	
	public void selectAll() {
		try {
			conn = DBConn.getConnection(); // 
			stmt = conn.createStatement(); // 쿼리를 날려주는 객체
			
			String sql = " SELECT MEM_ID, MEM_NAME, MEM_BIR\r\n" + 
						 " FROM MEMBER"
						 + " WHERE MEM_ID = 'a001' ";
			rs = stmt.executeQuery(sql); // 결과를 받아오는 객체(결과값 저장)
			while(rs.next()) { // rs.next :table row를 얘기하는것 있는대로 가져온다
				String id = rs.getString("MEM_ID");
				String name = rs.getString("MEM_NAME");
				String bir = rs.getString("MEM_BIR");
				
				System.out.println(id + "\t" + name + "\t" + bir);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
