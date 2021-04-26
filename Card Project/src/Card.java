/*
 * Name: Gatlin Farrington
 * Class: CSE 205
 * Professor: Osburn
 * Class: MW @ 4:30
 * Time Spent: 10 Minutes
 */

public class Card {
    //variables to store our info.
    String suit;
    int value;
    //constructor method
    public Card(String suit, int val){
        this.suit = suit;
        this.value = val;
    }

    
    public String toString(){
        //this will be used to print the name of our card.
        String kind = ""+value;
        //switch statement to change numbers to names for A, J, Q, K.
        switch(value){
            case 1:
            kind = "Ace";
            break;
            case 11:
            kind = "Jack";
            break;
            case 12:
            kind = "Queen";
            break;
            case 13:
            kind = "King";
            break;
            default:
            kind = "" + value;
            break;
        }
        //return a nice string format of the card
        return kind + " of " + suit;
    }
}
