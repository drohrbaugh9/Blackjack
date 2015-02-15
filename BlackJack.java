package BlackJackText;

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack
{
	private Player player;
        private Dealer dealer;
        private char choice = 'n';
        private char continuePlaying = 'n';
        private int playerHandValue = 0;
        private boolean busted = false;

	public BlackJack()
	{
            player = new Player();
            dealer = new Dealer();
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
                
                dealer.shuffle();
                
                out.println("Welcome to BlackJack, Metropolis : Population 1/2\n");
                out.println("Your dealer:\tSUPERMAN\n");
                out.println("             .=.,");
                out.println("            ;c =\\");
                out.println("          __|  _/");
                out.println("        .'-'-._/-'-._");
                out.println("       /..   ____    \\");
                out.println("      /' _  [<_->] )  \\");
                out.println("     (  / \\--\\_>/-/'._ )");
                out.println("      \\-;_/\\__;__/ _/ _/");
                out.println("       '._}|==o==\\{_\\/");
                out.println("        /  /-._.--\\  \\_");
                out.println("       // /   /|   \\ \\ \\");
                out.println("      / | |   | \\;  |  \\ \\");
                out.println("     / /  | :/   \\: \\   \\_\\");
                out.println("    /  |  /.'|   /: |    \\ \\");
                out.println("    |  |  |--| . |--|     \\_\\");
                out.println("    / _/   \\ | : | /___--._) \\");
                out.println("   |_(---'-| >-'-| |       '-'");
                out.println("snd       /_/     \\_\\");
                out.println("\nOne word of warning: If you try to cheat, he will see through it, literally.\n");
                
                do{
                    busted = false;
                    
                    //Deal the player and dealer two cards
                    player.addCardToHand(dealer.deal());
                    player.addCardToHand(dealer.deal());
                    dealer.addCardToHand(dealer.deal());
                    dealer.addCardToHand(dealer.deal());
                    
                    out.println(player);
                    
                    //Player risks his money...
                    playerHandValue = player.getHandValue();
                    out.print("\nDo you want to hit? (Y/N) ");
                    choice = keyboard.next().charAt(0);
                    
                    while (!busted && (choice == 'Y' || choice == 'y')){
                        player.addCardToHand(dealer.deal());
                        busted = (player.getHandValue() > 21);
                        out.println(player);
                        if (!busted){
                            out.print("\n\nDo you want to hit? (Y/N) ");
                            choice = keyboard.next().charAt(0);
                        }
                    }
                    
                    //Dealer risks his money...
                    out.println("\nDEALER\n" + dealer.toString() + '\n');
                    while (dealer.hit()){
                        dealer.addCardToHand(dealer.deal());
                        out.println(dealer);
                    }
                    
                    //Determine which player won
                    if (busted && dealer.getHandValue() <= 21){
                        out.println("\nDealer wins! Player busted!");
                        dealer.setWinCount(dealer.getWinCount() + 1);
                    }
                    else if (player.getHandValue() <= 21 && dealer.getHandValue() > 21){
                        out.println("\nPlayer wins! Dealer busted!");
                        player.setWinCount(player.getWinCount() + 1);
                    }
                    else if (player.getHandValue() > dealer.getHandValue() && player.getHandValue() <= 21){
                        out.println("\nPlayer's hand is higher than dealer's!");
                        player.setWinCount(player.getWinCount() + 1);
                    }
                    else if (player.getHandValue() < dealer.getHandValue() && dealer.getHandValue() <= 21){
                        out.println("\nDealer's hand is higher than player's!");
                        dealer.setWinCount(dealer.getWinCount() + 1);
                    }
                    else if (busted && dealer.getHandValue() > 21){
                        out.println("\nPush...Nobody won.");
                    }
                    else{
                        out.println("\nPush...Nobody won.");
                    }
                    
                    out.println("\nDealer has won " + dealer.getWinCount() + " times.");
                    out.println("Player has won " + player.getWinCount() + " times.");
                    
                    dealer.shuffle();
                    
                    out.print("\nWould you like to play again? (Y/N) ");
                    continuePlaying = keyboard.next().charAt(0);
                    out.println("\n");
                    player.resetHand();
                    dealer.resetHand();
                    
                } while (continuePlaying == 'Y' || continuePlaying == 'y');
	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
                gandalf();
	}
        
        public static void gandalf(){
                out.println("Gandalf thanks you for playing Blackjack, Metropolis : Population 1/2. He is usually the dealer, but he was sick today.\n");
                out.println("                        ,---.");
                out.println("                       /    |");
                out.println("                      /     |");
                out.println("                     /      |");
                out.println("                    /       |");
                out.println("               ___,'        |");
                out.println("             <  -'          :");
                out.println("              `-.__..--'``-,_\\_");
                out.println("                 |o/ <o>` :,.)_`>");
                out.println("                 :/ `     ||/)");
                out.println("  __________     (_.).__,-` |\\");
                out.println(" /          \\    /( `.``   `| :");
                out.println(" |Thank You!|-._ |-._ /( `.```| :");
                out.println(" \\_________/     \\'`-.)  `  ; ;");
                out.println("                 | `       /-<");
                out.println("                 |     `  /   `.");
                out.println(" ,-_-..____     /|  `    :__..-'\\");
                out.println("/,'-.__\\\\  ``-./ :`      ;       \\");
                out.println("`\\ `\\  `\\\\  \\ :  (   `  /  ,   `. \\");
                out.println("  \\` \\   \\\\   |  | `   :  :     .\\ \\");
                out.println("   \\ `\\_  ))  :  ;     |  |      ): :");
                out.println("  (`-.-'\\ ||  |\\ \\   ` ;  ;       | |");
                out.println("   \\-_   `;;._   ( `  /  /_       | |");
                out.println("    `-.-.// ,'`-._\\__/_,'         ; |");
                out.println("       \\:: :     /     `     ,   /  |");
                out.println("        || |    (        ,' /   /   |");
                out.println("        ||                ,'   /    |");
        }
}