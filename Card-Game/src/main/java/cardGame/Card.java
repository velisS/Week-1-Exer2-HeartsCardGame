/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardGame;

/**
 *
 * @author racks
 */
public final class Card {
    String card_symbol,theCard;
    int i;
    public Card(int i, String symbol) {
    	this.card_symbol=symbol;
    	this.i=i;
    	card_Init();
     }
    public String getSymbol() {return card_symbol;}
    public void setSymbol(String symbol) {card_symbol=symbol; }
    public String getCard() {return theCard;}
    public void set_theCard(String cardNum, String card_symbol) {
    	card_symbol=cardNum + card_symbol;
    }
    
    //method that initializes the Card Number/Hero and Symbol/Setter
    public void card_Init() {
    	switch(this.i) {
        case 0:
            this.theCard= "A"+this.card_symbol;//Ace
            break;
        case 10:
            this.theCard= "J"+this.card_symbol;//Jack
            break;
         case 11:
             this.theCard= "Q"+this.card_symbol;//Queen
             break;
         case 12:
        	 this.theCard = "K"+this.card_symbol;//King
             break;
         default:
        	 this.theCard = String.valueOf(i)+this.card_symbol;
    }
   }
    public String getCardSymbol() {return this.card_symbol;}
}

