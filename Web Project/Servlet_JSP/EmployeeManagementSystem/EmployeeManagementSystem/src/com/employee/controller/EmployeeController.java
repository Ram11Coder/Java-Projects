package com.employee.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.service.EmployeeService;

@WebServlet("UserloginPage")
public class EmployeeController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uname = req.getParameter("uname");
		String password = req.getParameter("pass");
		System.out.println("Employee controller!!");
		if (EmployeeService.getInstance().isEmployee(uname, password)) {
			req.setAttribute("uname", uname);
			resp.sendRedirect("/Registration.jsp");
		} else {
			resp.sendRedirect("/LoginPage.jsp");
		}
	}
}
