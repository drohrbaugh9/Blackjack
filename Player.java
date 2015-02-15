package BlackJackText;

import java.util.ArrayList;

public class Player extends AbstractPlayer {
    
    public Player() {
        super();
    }
    
    public Player(ArrayList<Card> h, int w) {
        super(h, w);
    }
    
    public void addCardToHand(Card c) {
        super.addCardToHand(c);
    }
    
    public void resetHand() {
        super.resetHand();
    }
    
    public boolean hit() {
        return false;
    }
    
    public void setWinCount(int w) {
        super.setWinCount(w);
    }
    
    public int getWinCount() {
        return super.getWinCount();
    }
    
    public int getHandSize() {
        return super.getHandSize();
    }
    
    public int getHandValue() {
        return super.getHandValue();
    }
}

