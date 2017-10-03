package collections;

import java.util.ArrayList;

public class Umbrella {

	public static void main(String[] args) {
		ArrayList<Boolean> isItGoingToRainToday = new ArrayList<Boolean>();
		isItGoingToRainToday.add(true);
		isItGoingToRainToday.add(false);
		isItGoingToRainToday.add(false);
		isItGoingToRainToday.add(true);
		isItGoingToRainToday.add(false);

		for (Boolean rain : isItGoingToRainToday) {
			if (rain==true) {
				System.out.println("Beter bring an umbrella.");
			} else {
				System.out.println("No rain today, enjoy the sun.");
			}
		}

	}

}
