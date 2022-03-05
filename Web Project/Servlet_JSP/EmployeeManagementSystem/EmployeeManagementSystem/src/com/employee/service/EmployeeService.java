package com.employee.service;

import com.employee.dao.EmployeeDao;

public class EmployeeService {

	private static EmployeeService service = new EmployeeService();

	public static EmployeeService getInstance() {
		return service;
	}

	public boolean isEmployee(String username, String password) {

		return EmployeeDao.getInstance().check(username, password);
	}
}
