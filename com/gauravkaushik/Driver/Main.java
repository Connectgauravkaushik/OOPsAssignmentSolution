package com.gauravkaushik.Driver;

import com.gauravkaushik.Departments.*;
import com.gauravkaushik.SuperClass.SuperDepartment;

public class Main{
	public static void main(String [] args) {
		
		SuperDepartment s = new SuperDepartment();
		
		AdminDepartment A = new AdminDepartment();
		A.departmentName();
		A.getTdayWork();
		A.getWorkDeadline();
		A.isTodayAholiday();
		
		System.out.println();
		
		HrDepartment H = new HrDepartment();
		H.departmentName();
		H.doactivity();
		H.getTodayWork();
		H.getWorkDeadline();
		H.isTodayAholiday();
		
		System.out.println();
		
		TechDepartment T = new TechDepartment();
		T.departmentName();
		T.getTdayWork();
		T.getWorkDeadline();
		T.getTechStackInformation();
		T.isTodayAholiday();

	}
}