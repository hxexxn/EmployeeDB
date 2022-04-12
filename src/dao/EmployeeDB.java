package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDB {
	
public void joinInsert(String eName, String eId, String ePw, String ePart) {
		
		Connection conn = null; 
		PreparedStatement pstmt = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/employeeDB?useSSL=false";
		String dbId = "root";
		String dbPw = "rootroot";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbId, dbPw);
			
			String sql = "insert into employeeTBL (eName, eId, ePw, ePart) values (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, eName);
			pstmt.setString(2, eId);
			pstmt.setString(3, ePw);
			pstmt.setString(4, ePart);
			pstmt.executeUpdate();
			System.out.println("가입 실행 완료.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}	
	

}
