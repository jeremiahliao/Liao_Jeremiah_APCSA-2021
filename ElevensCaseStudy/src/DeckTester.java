/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck test = new Deck(new String[]{"Ace","Two", "Three"},new String[]{"Spades", "Diamonds"},new int[] {1,2,3}) ;
		System.out.println(test);
	}
}
