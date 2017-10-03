package collections;

import java.util.ArrayList;

public class FeFiFoeFumArrayList {

	public static void main(String[] args) {
		String[] giantWordsArray = { "fee", "fie", "foe " };
		System.out.println(giantWordsArray);
		System.out.println("My array has " + giantWordsArray.length + " elements");

		ArrayList<String> giantWords = new ArrayList<String>();
		giantWords.add("fee");
		giantWords.add("fie");
		giantWords.add("foe");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");

		System.out.println("Are you empty? " + giantWords.isEmpty());

		giantWords.add("fum");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");

		giantWords.remove("fee");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");

		giantWords.remove(0);
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");
	}
}