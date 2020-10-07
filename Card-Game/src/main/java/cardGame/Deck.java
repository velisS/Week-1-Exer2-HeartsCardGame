/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardGame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cardGame.Card;
/**
 *
 * @author racks
 */
public final class Deck {
    Card[][] deckarray; //deck array
    Card[][] shuffled_Array; //for Shuffling the array

    int col, row;
    public Card[][]getInitDeck() {return deckarray;    }
    public Card[][]getShuffeldDeck(){return shuffled_Array;}
    public void setInitDeck(Card[][] Deckarray) {deckarray=Deckarray;}
    public void setShuffeldDeck(Card[][] shuffeldDeck){shuffled_Array=shuffeldDeck;} 

    public Deck() {
        initDeck(); //Function that initializes the game Deck
        shuffleDeck();
    }
    public void initDeck() {
        col = 0;
        row = 0;
        this.deckarray = new Card[4][13];
        for (col = 0; col < 4; col++) {
            for (row = 0; row < 13; row++) {

                switch (col) {
                    case 0:
                        this.deckarray[col][row] = new Card(row, "$");
                        break;
                    case 1:
                        this.deckarray[col][row] = new Card(row, "&");
                        break;
                    case 2:
                        this.deckarray[col][row] = new Card(row, "#");
                        break;
                    case 3:
                        this.deckarray[col][row] = new Card(row, "%");
                        break;
                    default:

                }
            }
        }
    }
    public void shuffleDeck() {
    	shuffled_Array=this.deckarray;
        Card temporary;
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 13; j++) 
            {
                int r = i + (int) (Math.random() * (4-i));
                int t= j+ (int) (Math.random()* (13-j));
                temporary = shuffled_Array[r][t]; 
                shuffled_Array[r][t] = shuffled_Array[i][j]; 
                shuffled_Array[i][j] = temporary ; 
            }
         }
    

    this.deckarray=shuffled_Array;
}
}









//Procedural way of filling the Deck(For help)
//String[][] deck = new String[4][13];
//List < String > symbols = new ArrayList < String > (Arrays.asList("$", "&", "#", "%"));
//
//
//
//int row = 0, col = 0;
//String symbol;
//String cardNum;
//String card;
//for (col = 0; col < 13; col++) {
//
//
//    for (row = 0; row < 4; row++) {
//        switch (col) {
//            case 0:
//                cardNum = "A";
//                symbol = symbols.get(row);
//                card = String.valueOf(symbol) + cardNum;
//                deck[row][col] = (card);
//                break;
//            case 10:
//                cardNum = "J";
//                symbol = symbols.get(row);
//                card = String.valueOf(symbol) + cardNum;
//                deck[row][col] = (card);
//                break;
//            case 11:
//                cardNum = "Q";
//                symbol = symbols.get(row);
//                card = String.valueOf(symbol) + cardNum;
//                deck[row][col] = (card);
//                break;
//            case 12:
//                cardNum = "K";
//                symbol = symbols.get(row);
//                card = String.valueOf(symbol) + cardNum;
//                deck[row][col] = (card);
//                break;
//            default:
//                cardNum = String.valueOf(col + 1);
//                symbol = symbols.get(row);
//                card = String.valueOf(symbol) + cardNum;
//                deck[row][col] = (card);
//                break;
//        }
//    }
//
//}
//return deck;
//}