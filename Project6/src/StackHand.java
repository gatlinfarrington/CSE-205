import java.util.Stack;

import cards.PlayingCard;
import hands.HandOfCards;
import jsjf.*;
public class StackHand implements HandOfCards{
//	LinkedStack<PlayingCard> hand = new LinkedStack();
	//will use the build in Java Stack because then I can use collections.shuffle
	Stack<PlayingCard> myHand = new Stack<>();
	
	public StackHand() {
//		LinkedStack<PlayingCard> inHand = new LinkedStack();
	
		for(int i = 1; i <= 4;i++) {
			for(int j = 1; j <=13; j++) {
				//this was me trying to randomly generate a card that isnt already in the stakc when I was using LinkedStack, It didn't work very well
//				PlayingCard add = new PlayingCard((int)(Math.random()*13), (int)Math.random()*4);
//				if(hand.contains(add)) {
//					while(hand.contains(add)) {
//						add.setRank((int)Math.random() * 13);
//						add.setSuit((int)Math.random()*4);
//						System.out.println(hand.toString());
//					}
//				}
				PlayingCard add = new PlayingCard(j,i);
				myHand.push(add);
				
			}
		}
	}
	@Override
	public void add(PlayingCard c) {
		myHand.push(c);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(myHand.peek().getRank());
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return myHand.peek().getRank();
	}
	public PlayingCard play() {
		
		return myHand.pop();
	}
	public int size() {
		return myHand.size();
	}
}
