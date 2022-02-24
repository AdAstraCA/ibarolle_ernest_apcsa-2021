/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card pickOne = new Card("9", "Diamonds", 9);
		Card pickTwo = new Card("Jack", "Hearts", 11);
		Card pickThree = new Card("9", "Diamonds", 9);
		System.out.println(pickOne.toString());
		System.out.println(pickTwo.toString());
		System.out.println(pickThree.toString());
		// toString includes the rank(), suit(), and pointValue() methods.
		System.out.println(pickOne.matches(pickTwo));
		System.out.println(pickOne.matches(pickThree));
		System.out.println(pickTwo.matches(pickThree));
		System.out.println(pickTwo.matches(pickOne));
		System.out.println(pickThree.matches(pickOne));
		System.out.println(pickThree.matches(pickTwo));
	}
}
