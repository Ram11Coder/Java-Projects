package com.employee.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AllEmployees extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sql = "select * from employee";
		String url = "jdbc:mysql://localhost:3306/abc";
		String uname = "root";
		String pass = "Ram11cool";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con = DriverManager.getConnection(url, uname, pass);
				PreparedStatement st = con.prepareStatement(sql);


				ResultSet rs = st.executeQuery();

				while(rs.next()) {
				System.out.println(	rs.getRow());
				}
			}catch(

	ClassNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(
	SQLException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
