package org.emp;

public class Employee {
	public void empId() {
		String id = "ABC001";
		System.out.println("Employee ID ="+id);
	}
	public void empName() {
		String Name = "Arunkumar";
		System.out.println("Employee Name ="+Name);
	}
	public void empDob() {
		String DOB = "6th March 1997";
		System.out.println("Employee DOB ="+DOB);
	}
	public void empPhone() {
		long ph = 9000093453l;
		System.out.println("Employee Phone ="+ph);
	}
	public void empEmail() {
		String email = "marunkumar865@gmail.com";
		System.out.println("Employee Email ="+email);
	}
	public void empAddress() {
		String address = "No:123, xxxx street, chennai-41";
		System.out.println("Employee address="+address);
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();
			
	}

}
