package BlackJackText; 

import java.util.ArrayList;

public class Dealer extends AbstractPlayer{
    
    Deck deck = new Deck();
    
    public Dealer(){
        super();
    }
    
    public Dealer(ArrayList<Card> h, int w){
        super(h, w);
    }
    
    public void shuffle(){
        deck.shuffle();
    }
    
    public Card deal(){
        return deck.nextCard();
    }
    
    public boolean hit(){
        return super.getHandValue() < 17;
    }
}