
public class Staff extends Employee{
	
	private String title;
	
	public Staff() {
		String title = "Default Title";
	}
	
	public Staff(String name, String address, String emailAddress, int phoneNumber, String office, int salary, String dateHired, 
			String title) {
		super(name, address, emailAddress, phoneNumber, office, salary, dateHired);
		this.title = title;
	}
	
	public String toString() {
		return super.toString() +  " Title: " + this.title + ".";
	}
	
}
