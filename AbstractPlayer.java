package BlackJackText;

import java.util.ArrayList;

public abstract class AbstractPlayer implements Playerable
{
   private ArrayList<Card> hand = new ArrayList<Card>();
   private int winCount;
   private ArrayList<Integer> skip = new ArrayList<Integer>();

   public AbstractPlayer(){
       winCount = 0;
   }
   
   public AbstractPlayer(ArrayList<Card> h, int w){
       hand = h;
       winCount = w;
   }

   public void addCardToHand(Card temp)
   {
       hand.add(temp);
   }

   public void resetHand()
   {
       hand = new ArrayList<Card>();
   }

   public  void setWinCount( int numwins )
   {
       winCount = numwins;
   }

   public int getWinCount() { return winCount; }

   public int getHandSize() { return hand.size(); }

   public int getHandValue()
   {
       int total = 0;
       for (int i = 0; i < hand.size(); i++){
           if (hand.get(i).getFace() == 1){
               skip.add(i);
           }
           else{
               total += hand.get(i).getValue();
           }
       }
       for (int i = 0; i < skip.size(); i++){
           if (total <= 10){
               total += 11;
           }
           else{
               total += 1;
           }
       }
       skip.clear();
       return total;
   }

   public String toString()
   {
      return "hand = " + hand.toString() + "\n Hand value - " + getHandValue() + " \n Wins - " + winCount;
   }
}