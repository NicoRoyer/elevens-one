import java.util.List;
import java.util.ArrayList;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Ace","King"};
		String[] suits = {"black","red"};
		int[] value = {1,13};

		Deck rigged = new Deck(ranks,suits,value);
		System.out.println(rigged.isEmpty());
		System.out.println(rigged.deal());
	}
}
