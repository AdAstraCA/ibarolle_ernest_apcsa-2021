/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranksOne = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] suitsOne = {"Spades", "Hearts", "Diamonds", "Clubs"};
		int[] valuesOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck fullDeckOne = new Deck(ranksOne, suitsOne, valuesOne);
		System.out.println(fullDeckOne.toString());
		fullDeckOne.shuffle();
		System.out.println(fullDeckOne.toString());	
		System.out.println(fullDeckOne.deal());
		System.out.println(fullDeckOne.isEmpty());
		String[] ranksTwo = {"A", "2", "3", "4", "8", "9", "10", "J"};
		String[] suitsTwo = {"Spades", "Clubs"};
		int[] valuesTwo = {1, 2, 3, 4, 8, 9, 10, 11};
		Deck fullDeckTwo = new Deck(ranksTwo, suitsTwo, valuesTwo);
		System.out.println(fullDeckTwo.toString());
		System.out.println(fullDeckTwo.deal());
		System.out.println(fullDeckTwo.isEmpty());
		String[] ranksThree = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		String[] suitsThree = {"Hearts", "Diamonds"};
		int[] valuesThree = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Deck fullDeckThree = new Deck(ranksThree, suitsThree, valuesThree);
		System.out.println(fullDeckThree.toString());
		System.out.println(fullDeckThree.deal());
		System.out.println(fullDeckThree.isEmpty());
	}
}
