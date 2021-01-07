

public class Main {

	public static void main(String[] args) {

		
		Octagon oct = new Octagon(8);
		
		System.out.println(oct);
		
		Octagon oct2 = (Octagon)oct.clone();
	
		if(oct.compareTo(oct2) == 1) {
			System.out.println("They are the same.");
		}else {
			System.out.println("They are not the same.");

		}

	}

}
