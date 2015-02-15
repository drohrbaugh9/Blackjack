package BlackJackText;

public class BlackJackCard extends Card {
  	public BlackJackCard() {
            super();
        }
        
        public BlackJackCard(int f, String s) {
            super(f, s);
        }
        
        public int getValue() {
            if (getFace() > 0 && getFace() < 10)
                return getFace();
            else{
                if (getFace() == 0)
                    return 1;
                if (getFace() >= 10)
                    return 10;
            }
            return 0;
  	}
  	
 }