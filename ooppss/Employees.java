package ooppss;

public class Employees {

	private String name;
	private int empid;
	private double salary;
	private long phno;
	private String department;
	private String emailid;
	private double percentage;
	private int age;
	private String address;
	
	public  Employees(String name, int empid, double salary, long phno, String department, String emailid,double percentage, int age, String address) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.phno = phno;
		this.department = department;
		this.emailid = emailid;
		this.percentage = percentage;
		this.age=age;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
		
}
