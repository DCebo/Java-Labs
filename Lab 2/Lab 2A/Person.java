
public class Person {
	
	private String name, address, emailAddress;
	protected int phoneNumber;
	
	public Person() {
		this.name = "Default Name";
		this.address = "Default Address";
		this.emailAddress = "Default Email Address";
		this.phoneNumber = 678555555;
	}
	
	public Person(String name, String address, String emailAddress, int phoneNumber) {
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		 return "Name: " + this.name + ". Address: " + this.address + ". Email: " + this.emailAddress + ". Phone: " + this.phoneNumber + ".";
	}
}
