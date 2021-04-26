/*
 * Name: Gatlin Farrington
 * Class: CSE 205
 * Professor: Osburn
 * Class: MW @ 4:30
 * Time Spent: 10 Minutes
 */

import java.util.ArrayList;
import java.util.Random;
public class Main {
	public static Random rand = new Random();
    public static void main(String[] args){
    	ArrayList<Card> deck = new ArrayList<>();
    	//for loop will iterate through all suits and values to fill the deck ArrayList
    	for(int i =0; i < 4; i++) {
    		for(int j = 1; j<=13; j++) {
    			//will turn i into a suit for the card
    			String suit = "";
    			if(i == 0) {
    				suit = "Diamonds";
    			}else if(i == 1) {
    				suit = "Hearts";
    			}else if(i == 2) {
    				suit = "Clubs";
    			}else if(i == 3) {
    				suit = "Spades";
    			}
    			//add the card to the deck
    			deck.add(new Card(suit, j));
    					
    		}
    	}
    	//create a hand with the draw method
    	ArrayList<Card> hand = draw(5, deck);
    	//print that list
    	for(int i = 0; i < hand.size(); i++) {
    		System.out.println(hand.get(i));
    	}
    	
    	
    }
    //will return a list of num Size with random cards from the deck
    public static ArrayList<Card> draw(int num, ArrayList<Card> deck){
    	//create teh list we will return
    	ArrayList<Card> hand = new ArrayList<>();
    	//populate the list randomly with cards from the deck given, this will be done num times
    	for(int i = 0; i < num; i++) {
    		hand.add(deck.get(rand.nextInt(52)));
    	}
    	//return the list
    	return hand;
    }
}
