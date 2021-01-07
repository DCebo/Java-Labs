
public class Clothes {
	String name, color;
	boolean highTemp;
	
	public Clothes(String name, String color, boolean temp) {
		this.name = name;
		this.color = color;
		this.highTemp = temp;
	}
	
	@Override
	public String toString() {
		String output = "Name is " + this.name + "\n";
		output += "Color is " + this.color + "\n";
		output += "Can be washed at a high temperature is: " + this.highTemp;
		return output;
	}
}
