package com.mahesh.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mahesh.dao.AdminPanelDAO;
import com.mahesh.domain.StudentsData;

public class AdminPanelService {
	
	private AdminPanelDAO dao = new AdminPanelDAO();
	
	public List<StudentsData> getAllStudents(){
		
		List<StudentsData> listOfStudents = new ArrayList<>();
		try {
			listOfStudents.addAll(dao.getAllStudents());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listOfStudents;
		
	}

}
