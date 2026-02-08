package javaLab.Lab3;

public abstract class Employee {

	private int Emp_code;
	private String emp_name;
	private String address;
	private long ph_no;
	
	
	
	
	public int getEmp_code() {
		return Emp_code;
	}




	public void setEmp_code(int emp_code) {
		Emp_code = emp_code;
	}




	public String getEmp_name() {
		return emp_name;
	}




	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public long getPh_no() {
		return ph_no;
	}




	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}




	abstract public void computeSalary();
	
}
