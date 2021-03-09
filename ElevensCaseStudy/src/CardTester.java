/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card test = new Card("Five", "Clubs", 5);
		System.out.println(test);
		
		test.setStuff("Ace", "Spades", 1);
		System.out.println(test);
		
		test.setStuff("King","Diamonds", 10);
		System.out.println(test);
		
	}
}
