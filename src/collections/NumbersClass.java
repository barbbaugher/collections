package collections;

import java.util.ArrayList;

public class NumbersClass {

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

	public String randomNumberContains23 () {
		if (randomNumbers.contains("23")) {
			return "23 is in the list";
		}else {
				return "23 is not in the list";
			}
	}
	
	public String randomNumberContains77 () {
		if (randomNumbers.contains("77")) {
			return "77 is in the list";
		}else {
				return "77 is not in the list";
			}
	}
}