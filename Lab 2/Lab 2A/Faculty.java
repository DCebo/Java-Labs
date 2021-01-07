
public class Faculty extends Employee{
	
	private String officeHours, rank;
	
	public Faculty() {
		String officeHours = "Default Office Hours";
		String rank = "Default Rank";
	}
	
	public Faculty(String name, String address, String emailAddress, int phoneNumber, String office, int salary, String dateHired, 
			String officeHours, String rank) {
		super(name, address, emailAddress, phoneNumber, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString() +  " Office Hours: " + this.officeHours + ". Employee Rank: " + this.rank + ".";
	}
	
}
