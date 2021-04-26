import java.util.Collections;
import java.util.List;

public class WarGame {
	public static void main(String[] args) {
		//decalre everything
		StackHand hand1 = new StackHand();
		StackHand hand2 = new StackHand();
		int score1 = 0;
		int score2 = 0;
		//shuffle my hands
		Collections.shuffle(hand1.myHand);
		Collections.shuffle(hand2.myHand);
		//play the game
		while(hand1.myHand.isEmpty() == false 	) {
			if(hand1.getValue() > hand2.getValue()) {
				score1++;
			}else if(hand1.getValue() < hand2.getValue()) {
				score2++;
			}
			hand1.play();
			hand2.play();
		}
		//display the winenr
		if(score1 > score2) {
			System.out.println("Player 1 Wins! Score: " + score1 + " over " + score2);
		}else if (score2 > score1) {
			System.out.println("Player 2 Wins! Score: " + score2 + " over " + score1);
		}else {
			System.out.println("It was a draw! " + score1 + " to " + score2);
		}
		
	}
}
