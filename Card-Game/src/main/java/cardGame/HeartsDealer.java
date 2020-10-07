/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardGame;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author racks
 */
public class HeartsDealer extends Human implements CardsDealer {
    HeartsPlayer player1, player2;
    Deck deck;

    int[] cards_Given_toPlayers = new int[10];
    int i, j, rndNumber, position = 0;

    public HeartsDealer(HeartsPlayer player1, HeartsPlayer player2) {
        super("Dealer");
        this.player1 = player1;
        this.player2 = player2;


    }
    public HeartsDealer(Deck deck, HeartsPlayer player1, HeartsPlayer player2) {
        super("Dealer");
        this.deck = deck;
    }

    public void dealToPlayers(HeartsPlayer player1, HeartsPlayer player2) {


        for (int i = 0; i < 5; i++) {

           player1.cards_inHand[i] = this.deck.deckarray[0][i];
            
            player2.cards_inHand[i] = this.deck.deckarray[0][i + 5];
        }
    }



    public void introduceSelf() {
        System.out.println("Message from " + this.Role + ": Hello Player's This message is coming from the Dealer of this Game\n");
    }


    public void showDeck() {


        for (i = 0; i < 4; i++) {
            for (j = 0; j < 13; j++) {

                System.out.print(this.deck.deckarray[i][j].theCard + " | ");

            }

            System.out.println();
        }

    }

    public Card dealRandomCard() {
        int a_counter;
        Card a_card;
        for (a_counter = 0; a_counter < 10; a_counter++) {
            if (cards_Given_toPlayers[a_counter] == rndNumber) {
                i = (int)(Math.random() * 4);
                j = (int)(Math.random() * 13);
                rndNumber = i * j;
            }

        }
        cards_Given_toPlayers[position] = rndNumber;
        position++;

        a_card = this.deck.deckarray[i][j];

        return a_card;
    }
    public void decideWinner(HeartsPlayer player1, HeartsPlayer player2) {
    	
        for(int i=0;i<5;i++){
            if("#".equals(player1.cards_inHand[i].card_symbol)){
              player1.points=player1.points+1;
            }
            if("#".equals(player2.cards_inHand[i].card_symbol)){
                player2.points=player2.points+1;
              }
        }
    if(player1.points>player2.points){

           
            System.out.println("Player One Won!");
 
        }
    else if(player1.points<player2.points){
            
         
            System.out.println("Player two Won!");
    }
    else{
            System.out.println("It's a draw!");
            }

    }



}