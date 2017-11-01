package com.mahesh.services;

import java.sql.SQLException;

import com.mahesh.dao.UserAuthenticationDAO;
import com.mahesh.domain.StudentAppUsers;

public class UserAuthenticationService {
	
	private UserAuthenticationDAO dao = new UserAuthenticationDAO();
	
	public boolean checkParameters(String username, String password) {

		return (username != null && password != null) && (username.trim().length() > 0 && password.trim().length() > 0);
	}

	public StudentAppUsers validatedUser(StudentAppUsers user) {

		StudentAppUsers validated = user;
		try {
			validated = dao.userLogin(user);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return validated;
		
	}


}
