package com.greatlearning.driver;

import com.greatlearning.services.AdminDepartment;
import com.greatlearning.services.HrDepartment;
import com.greatlearning.services.TechDepartment;

public class Main {

	public static void main(String[] args) {
		String greet = "Welcome to ";
		AdminDepartment admDept = new AdminDepartment();
		HrDepartment hrDept = new HrDepartment();
		TechDepartment techDept = new TechDepartment();

		System.out.println(greet + admDept.departmentName());
		System.out.println(admDept.getTodaysWork());
		System.out.println(admDept.getWorkDeadline());
		System.out.println(admDept.IsTodayAHoliday() + '\n');

		System.out.println(greet + hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.IsTodayAHoliday() + '\n');

		System.out.println(greet + techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.IsTodayAHoliday() + '\n');

	}

}
