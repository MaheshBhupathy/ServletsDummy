package com.mahesh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mahesh.domain.StudentAppUsers;

public class UserAuthenticationDAO {

	Connection con;
	private String password = "root";
	private String username = "system";
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";

	public StudentAppUsers userLogin(StudentAppUsers user) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, username, password);

		
		PreparedStatement ps = con.prepareStatement(SQLConstants.SQL_STUDENT_APP_USERS_AUTH);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			user.setUserId(rs.getInt(1));
			user.setUserRole(rs.getString(2));
			user.setUsername(rs.getString(3));
			user.setPassword(null);
			
		}
		
		return user;

	}

}
