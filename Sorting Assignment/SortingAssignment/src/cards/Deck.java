package cards;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	private ArrayList<PlayingCard> cards;
	private Random rand;

	public Deck(int n) {
		super();
		rand = new Random();
		cards = new ArrayList<PlayingCard>(n);
		for (int suite = 1; suite <= 4; suite ++)
			for (int rank = 1; rank <= 13; rank ++) {
				if ((suite - 1) * 13 + rank <= n) { 
				  cards.add(new PlayingCard(rank, suite));
				}
			}
	}
	
	public PlayingCard dealOne() {
		return cards.get(rand.nextInt(52));
	}
	
	public String toString(){
		String ret = "";
		for (PlayingCard card : cards){
			ret += card + " ";
		}
		ret += "\n";
		return ret;
	}
	
	public void shuffle() {
		int index1;
		int index2;
		PlayingCard temp = new PlayingCard();
		//swap 1000x
		for(int i = 0; i < 1000; i++) {
			//get two random indexes
			index1 = (int)(rand.nextInt(52));
			index2 = (int)(rand.nextInt(52));
			//swap them
			swapCards(index1, index2, cards, temp);
			
		}
	}
	
	public void swapCards(int a, int b, ArrayList<PlayingCard> cards, PlayingCard temp) {
		//temp to store values
		temp.setSuit(cards.get(a).getSuit());
		temp.setRank(cards.get(a).getRank());
		//set a to b
		cards.get(a).setRank(cards.get(b).getRank());
		cards.get(a).setSuit(cards.get(b).getSuit());
		//set b to temp which is what a was
		cards.get(b).setRank(temp.getRank());
		cards.get(b).setSuit(temp.getSuit());
	}
	
}
