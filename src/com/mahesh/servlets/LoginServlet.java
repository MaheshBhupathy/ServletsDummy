package com.mahesh.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mahesh.domain.StudentAppUsers;
import com.mahesh.services.UserAuthenticationService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserAuthenticationService service = new UserAuthenticationService();

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		String status = "Some thing went wrong ,please try again";

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		StudentAppUsers user = new StudentAppUsers();

		if (service.checkParameters(username, password)) {

			user.setUsername(username);
			user.setPassword(password);

			if (service.validatedUser(user).getPassword() != null) {
				try {
					status = "Please provide valid username and password";
					request.setAttribute("status", status);
					request.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(request, response);

				} catch (ServletException | IOException e) {
					e.printStackTrace();
				}
			} else {
				user = service.validatedUser(user);

				status = "Hey " + user.getUsername() + ", Welcome to " + user.getUserRole() + " Dashboard";
				if (user.getUserRole().equals("admin")) {
					try {
						request.setAttribute("status", status);
						request.getRequestDispatcher("/WEB-INF/pages/AdminDashBoard.jsp").forward(request, response);
					} catch (ServletException | IOException e) {
						e.printStackTrace();
					}
				} else if (user.getUserRole().equals("student")) {
					try {
						request.setAttribute("status", status);
						request.getRequestDispatcher("/WEB-INF/pages/StudentDashBoard.jsp").forward(request, response);
					} catch (ServletException | IOException e) {
						e.printStackTrace();
					}
				}
			}

		} else {
			// please enter username and password properly
			// redirect to login
			try {
				status = "Please provide valid username and password";
				request.setAttribute("status", status);
				request.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(request, response);

			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}

		}

	}

}
