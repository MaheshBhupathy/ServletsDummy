package com.mahesh.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mahesh.domain.StudentsData;
import com.mahesh.services.AdminPanelService;

@WebServlet("/showAllStudents")
public class StudentsDataServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private AdminPanelService service = new AdminPanelService();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) {

		List<StudentsData> listOfStudents = service.getAllStudents();

		try {
			request.setAttribute("students", listOfStudents);
			request.getRequestDispatcher("/WEB-INF/pages/AdminDashBoard.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
