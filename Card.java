public class Card {

    /**
     * Fields
     */
    //(contains a value from 2-14 representing cards 2-Ace)
    private int value;
    //(e.g. Ace of Diamonds, or Two of Hearts)
    private String name;


    public Card(int value, String name) {

       this.value = value;
       this.name = name;
    }


   /**
     *
     * Methods -Getters and Setters
     */


    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }



    //(prints out information about a card)
    public void describe(){
        System.out.println(getName());
    }
}