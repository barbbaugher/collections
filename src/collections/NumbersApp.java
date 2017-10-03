package collections;

public class NumbersApp {

	public static void main(String[] args) {
		
		NumbersClass creatingAMethod = new NumbersClass();
	
		System.out.println(creatingAMethod.randomNumbers);
		
		System.out.println(creatingAMethod.randomNumberContains23());
		
		System.out.println(creatingAMethod.randomNumberContains77());
	}

}
