package com.java.review;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee emp1= new Employee();
		emp1.setfirstName("Mirr");
		emp1.setLastName("COLIN");
		emp1.setAge(45);
		emp1.setSsnNum("123456");
		//System.out.println(emp1.getfirstName()+"\n"+emp1.getLastName()+"\n"+emp1.getAge()+"\n"+emp1.getSsnNum());
		System.out.println(emp1.getInfo());
		System.out.println(emp1.getFullName());

	}

}
