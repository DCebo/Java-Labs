
public class Octagon extends GeometricObject {
	
	public Octagon() {
		
		this.sizeOfSides = 8;
		this.area = (2 + 4 / Math.sqrt(2)) * this.sizeOfSides * this.sizeOfSides;
		this.perimeter = 8 * this.sizeOfSides;
	}
	
	public Octagon(int length) {
		
		this.sizeOfSides = length;
		this.area = (2 + 4 / Math.sqrt(2)) * this.sizeOfSides * this.sizeOfSides;
		this.perimeter = 8 * this.sizeOfSides;
	}
	
	public Object clone() {
		Octagon oClone = new Octagon(this.sizeOfSides);
		return oClone;
	}

	public String toString() {
		return this.getClass() + "'s area: " + String.format("%.2f",  this.area) + " perimeter: " + String.format("%.2f",  this.perimeter);		
	}
	
	@Override
	public int compareTo(Object o) {
		
		Octagon check = (Octagon) o;
		
		if(check.sizeOfSides == this.sizeOfSides) {
			return 1;
		}else {
			return 0;
		}
	
	}
	
}
