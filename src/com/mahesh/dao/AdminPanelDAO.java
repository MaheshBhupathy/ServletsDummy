package com.mahesh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mahesh.domain.StudentsData;

public class AdminPanelDAO {

	Connection con;
	private String password = "root";
	private String username = "system";
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";

	public List<StudentsData> getAllStudents() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, username, password);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(SQLConstants.SQL_STUDENT_APP_GET_ALL_STUDENTS);
		
		List<StudentsData> listOfStudents = new ArrayList<>();
		
		while(rs.next()) {
			StudentsData student = new StudentsData();
			student.setStudentId(rs.getInt(1));
			student.setStudentName(rs.getString(2));
			student.setStudentMobile(rs.getLong(3));
			student.setStudentCity(rs.getString(4));
			listOfStudents.add(student);
		}
		return listOfStudents;
		
	}
}
