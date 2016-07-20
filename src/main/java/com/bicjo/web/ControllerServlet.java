package com.bicjo.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 4456090928033313345L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doPost(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsp/hello-world.jsp");
		// requestDispatcher.forward(request, response);
		// super.doGet(request, response);
	}
}
