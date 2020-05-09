import java.util.*;
public class Deck {
    /**
     * fields
     */

    //(List of Card)
//data - uses an ArrayList of Cards to actually store them
    ArrayList<Card> card;
    List<String> values = Arrays.asList("Deuce", "Ace", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Joker");
    List<String> names = Arrays.asList("Hearts", "Spades", "Clubs", "Diamond");

    /**
     * constructor
     *
     * @param
     */
    // In the constructor, when a new Deck is instantiated,
    // the Cards field should be populated with the standard 52 cards.
    public Deck() {
        card = new ArrayList<Card>();
        for (String name : names) {
            for (int i = 2; i <= 14; i++) {
                card.add(new Card(i, CardDeck(i - 2, name)));
            }
        }

    }
    /**
     * methods
     */
    //(randomizes the order of the cards)
    public void shuffle() {
        Collections.shuffle(card);
            }


    //(removes and returns the top card of the Cards field)
    public Card draw() {
        return card.remove(0);
    }

    public String CardDeck(int value, String suite) {
        return values.get(value) + " of " + suite;
    }
}
