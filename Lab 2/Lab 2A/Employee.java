
public class Employee extends Person{
	private String office, dateHired;
	private int salary;
	
	
	public Employee() {
		String office = "Default Office";
		int salary = 0000;
		int dateHired = 00000000;
	}
	
	public Employee(String name, String address, String emailAddress, int phoneNumber, String office, int salary, String dateHired) {
		super(name, address, emailAddress, phoneNumber);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public String toString() {
		System.out.println("");
		return super.toString() + " Office: " + this.office + ". Salary: " + this.salary + 
				 ". Start Date: " + this.dateHired + ".";
	}
}
