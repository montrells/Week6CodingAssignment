import java.util.ArrayList;
import java.util.List;

public class Player {
    /**
     * fields
     */
    //(List of Card)
    private List<Card>hand;
    int score;
    private String name;
    /**
     * constructor
     */
    //(set to 0 in the constructor)
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
        hand = new ArrayList<Card>();

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    /**
     * methods
     */
    //(prints out information about the player and calls the describe method for each card in the Hand List)
    public void describe(){
        System.out.println("Name: "+ name+ "\n"+"Score: "+ score+ "\n"+"Hand: "+ hand);

        for (Card card : hand) {
            card.describe();
        }
        }

    //(removes and returns the top card of the Hand)
    public Card flip() {
        return hand.remove(0);

    }


    //(takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the
    // hand field)
    public void draw(Deck deck){
        Card drawCard = deck.draw();
        hand.add(drawCard);

    }
    //(adds 1 to the Player’s score field)
    public void incrementScore(){
        score++;
    }

}
