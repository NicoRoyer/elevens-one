/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card g = new Card("six","spade",6);
        Card h = new Card("six","spade",6);
        Card j = new Card("seven","spade",7);
        System.out.println(g.toString());
        System.out.println(g.matches(h));
		System.out.println(g.matches(j));
	}
}
