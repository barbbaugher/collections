package collections;

import java.util.ArrayList;

public class Tools {

	public static void main(String[] args) {
		String[] myTools = { "hammer", "shovel", "wrench" };
		System.out.println("With basic for:");

		for (int index = 0; index < myTools.length; index++) {
			System.out.println(myTools[index]);
		}
		System.out.println("With enhanced for:");
		for (String tool : myTools) {
			System.out.println(tool);
			if (tool.equals("hammer")) {
				System.out.println("I have a hammer!");
			}
		}

		for (int index = 0; index < myTools.length; index++) {
			if (myTools[index].equals("shovel")) {
				System.out.println("Shovel is element " + index);
			}
		}

		ArrayList<String> myToolsToo = new ArrayList<String>();
		myToolsToo.add("hammer");
		myToolsToo.add("shovel");
		myToolsToo.add("wrench");

		System.out.println("Shovel is element " + myToolsToo.indexOf("shovel"));

	}

}
