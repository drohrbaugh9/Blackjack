package BlackJackText;

public abstract class Card {
	public static final String FACES[] = {"ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
	private String suit;
	private int face;

  	public Card() {
            setFace(0);
            setSuit("");
        }
        
        public Card(int f, String s) {
            setFace(f);
            setSuit(s);
        }
        
        public void setFace(int f) {
            face = f;
        }
        
        public void setSuit(String s) {
            suit = s;
        }
        
        public int getFace() {
            return face;
        }
        
        public String getSuit() {
            return suit;
        }
        
        public abstract int getValue();

	public boolean equals(Object obj) {
            Card c = (Card)obj;
            return c.getValue() == getValue() && c.getSuit().equals(getSuit());
	}
        
        public String toString() {
            return FACES[face] + " of " + getSuit() + " | value = " + getValue();
        }
 }