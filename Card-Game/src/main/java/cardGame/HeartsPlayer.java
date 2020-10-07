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
public class HeartsPlayer extends Human implements CardsPlayer{
    int id,points;
    String alias;
    Card[] cards_inHand = new Card[5];
    public void setAlias(String Alias) {alias=Alias;}
    public void setPoints(int Points) {points=Points;}
    public void setId(int ID) {id=ID;}
    public void set_card_inHand(Card[] CardsInHand){cards_inHand=CardsInHand;}
    public String getAlias() {return alias;}
    public int getPoints() {return points;}
    public int getId() {return id;}
    public Card[] get_card_inHand(){return cards_inHand;}
    public HeartsPlayer(String alias) 
    {
		super("Player") ;this.alias=alias;
	}
    public HeartsPlayer(int id, int points, String alias)
    {
		super("Player"); this.id=id; this.alias=alias;this.points=points;
	}

	public void introduceSelf()
	{
        System.out.println("Message from "+this.Role+this.id+": Hello everyone I am "+this.alias+"\n");
    }
	
	public void showHand() {
		
		for(int i=0 ;i<5;i++) {
			System.out.print(cards_inHand[i].theCard+" ");
			
		}
		System.out.println(this.alias+"'s Hand \n");
	}; 
}