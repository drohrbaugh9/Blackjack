package BlackJackText;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards = new ArrayList<Card>();

	public Deck ()
	{
		topCardIndex = NUMCARDS - 1;
                for (int i = 0; i < NUMSUITS; i++){
                    for (int j = 1; j <= NUMFACES; j++){
                        stackOfCards.add(new BlackJackCard(j, SUITS[i]));
                    }
                }	
	}
        
        public void shuffle ()
        {
                topCardIndex = NUMCARDS - 1;
                Collections.shuffle(stackOfCards);
	}

	public int  size ()
	{
                return stackOfCards.size();
	}

	public int numCardsLeft()
	{
		return topCardIndex + 1;
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}