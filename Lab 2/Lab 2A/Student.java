// interview polymorphism vs inheritance
public class Student extends Person{
	
	private String classStatus;
	
	public Student() {
		String classStatus = "Default Class Status";
	}

	public Student(String name, String address, String emailAddress, int phoneNumber, String classStatus) {
		super(name, address, emailAddress, phoneNumber);
		this.classStatus = classStatus;
	}
	
	public String toString() {
		System.out.println("");
		return super.toString() + " Class Status: " + this.classStatus + ".";
	}
	
}
