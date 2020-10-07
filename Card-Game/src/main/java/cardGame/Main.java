/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardGame;
import java.util.Arrays;
/**
 *
 * @author racks
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	Deck deck = new Deck();
 
        HeartsPlayer player1 = new HeartsPlayer(1,0,"Thomas");
        HeartsPlayer player2 = new HeartsPlayer(2,0,"Jimmy");
        HeartsDealer dealer = new HeartsDealer(deck,player1,player2);
        dealer.showDeck();
        dealer.dealToPlayers(player1, player2);
        player1.showHand();
        player2.showHand();
        player1.introduceSelf();
        player2.introduceSelf();
        dealer.introduceSelf();
        dealer.decideWinner(player1, player2);
    
    }
    
}
