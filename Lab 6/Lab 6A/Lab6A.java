import java.util.Scanner;

public class Lab6A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hours = 0, minutes = 0;
		while (true) {
			System.out.print("Enter a 24 hour time: ");
			String input24HourFormat = "";

			try {
				input24HourFormat = scan.nextLine();

				String[] hoursAndMinutes = input24HourFormat.split(":");

				hours = Integer.parseInt(hoursAndMinutes[0]);
				minutes = Integer.parseInt(hoursAndMinutes[1]);

				if (hours >= 60 || hours < 0) {
					// hours are bad. Throws some exception.
					throw new TimeFormatException("There is no such time as: " + hours + ":" + minutes);

				}
				if (minutes >= 60 || minutes < 0) {
					// minutes are bad. Throws some exception.
					throw new TimeFormatException("There is no such time as: " + hours + ":" + minutes);
				}
			} catch (TimeFormatException timeFormatException) {
				timeFormatException.printStackTrace();
				System.out.println("Try again...");
				/*
				 * Only needed if you want to exit program
				 */
				// break;

				/*
				 * To keep trying the program
				 */
				continue;
			}

			// to attain correct afternoon time in 12 hours format
			int changedHours = hours;
			if (hours > 12)
				changedHours = hours - 12;
			else if (hours == 0) {
				changedHours = 12;
			}

			if (hours >= 12 && hours < 24) {
				System.out.println("That is the same as " + changedHours + ":" + minutes + " PM");
			} else {
				System.out.println("That is the same as " + changedHours + ":" + minutes + " AM");
			}

			System.out.println("Would you like to enter another time? Enter yes or no");
			if (!scan.nextLine().equals("yes")) {
				System.out.println("Thank you - end of program");
				break;
			}
		}
	}

	public static void CheckHours() throws TimeFormatException {

	}
}
