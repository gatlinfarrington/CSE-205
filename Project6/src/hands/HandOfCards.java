package hands;

import cards.PlayingCard;

public interface HandOfCards {
	public void add(PlayingCard c);
	public void print();
	public int getValue();
}
