public class MainApp {
    public static void main(String[] args) {

        Deck deck = new Deck( );
        //Card card = new Card();
        Player player1 = new Player("Billy", 0);
        Player player2 = new Player("Rogers", 0);
        deck.shuffle( );

        for (int i = 0; i < 26; i++) {

            player1.draw(deck);
            player2.draw(deck);

        }
    // Starts the game of War
            for (int i = 0; i < 26; i++) {
                Card player1Card = player1.flip( );
                Card player2Card = player2.flip( );
                if (player1Card.getValue( ) > player2Card.getValue( )) {
                    player1.incrementScore( );
                } else if (player1Card.getValue( ) < player2Card.getValue( )) {
                    player2.incrementScore( );
                }
            }
            System.out.println("The Score for Player1 = " + player1.getScore( ));

            System.out.println("The Score for Player2 = " + player2.getScore( ));

            if (player1.getScore( ) > player2.getScore( )) {
                System.out.println("!!!PLAYER ONE IS THE WINNER!!!");
            } else if (player1.getScore( ) < player2.getScore( )) {
                System.out.println("!!!PLAYER TWO IS THE WINNER!!!");
            }



        }
    }


