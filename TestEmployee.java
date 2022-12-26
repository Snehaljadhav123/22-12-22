package com.exercise.pll;

import com.exercise.bll.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee n1=new Employee(101,"Abhishek","Kolate",40000);
		System.out.println("----Employeee Record-----");
		System.out.println(n1.getFirstName());
		System.out.println(n1.getLastName());
		double sal=n1.raiseSalary(40000);
		System.out.println("Raise Salary :"+sal);
		int annsal= n1.AnnualSalary(40000);
		System.out.println("Annual Salary :"+annsal);
	}

}