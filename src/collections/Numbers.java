package collections;

import java.util.ArrayList;

public class Numbers {

	public static void main(String[] args) {
		
		ArrayList<String> randomNumbers = new ArrayList<String>();{
			randomNumbers.add("1");
			randomNumbers.add("23");
			randomNumbers.add("9");
			randomNumbers.add("77");
			randomNumbers.add("922");
			randomNumbers.add("6");
			randomNumbers.add("32");
			randomNumbers.add("63");
			randomNumbers.add("14");
			randomNumbers.add("5");
			}
		
		System.out.println(randomNumbers);

		if (randomNumbers.contains("23")) {
			System.out.println("23 is in the list");
		} else {
			System.out.println("23 is not in the list");
		}
		if (randomNumbers.contains("77")) {
			System.out.println("77 is in the list");
		} else {
			System.out.println("77 is not in the list");
		}
		if (randomNumbers.contains("15")) {
			System.out.println("15 is in the list");
		} else {
			System.out.println("15 is not in the list");
		}
		
		randomNumbers.remove("27");
		randomNumbers.remove("922");
		randomNumbers.remove("32");
		randomNumbers.remove("6");
		
		if (randomNumbers.contains("23")) {
			System.out.println("23 is in the list");
		} else {
			System.out.println("23 is not in the list");
		}
		if (randomNumbers.contains("77")) {
			System.out.println("77 is in the list");
		} else {
			System.out.println("77 is not in the list");
		}
		if (randomNumbers.contains("15")) {
			System.out.println("15 is in the list");
		} else {
			System.out.println("15 is not in the list");
		}
	
	randomNumbers.set(1, "28");
	
	System.out.println(randomNumbers);
	
	randomNumbers.add(1, "16");
		
	System.out.println(randomNumbers);
	}

}
