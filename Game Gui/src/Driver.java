import java.awt.Frame;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import java.util.Random;
//import the other package
import project3.characters.*;
import javax.swing.JFrame;
public class Driver {

	public static void main(String[] args) {

		
		//list to store the fighters
		ArrayList<character> Arena = new ArrayList<>(); 
		ArrayList<character> Losers = new ArrayList<>();
		//scanner just to ask how many fighters to have in the arena
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("How many fighters would you like?");
		int numFighters = s.nextInt();
		//switch to add the fighters with a randomly generated number
		for(int i = 0; i < numFighters; i++) {
			//generate a random number 0, 1, or 2
			int option = (int) (Math.random() * 5);
			//add the fighter based on the number
			switch(option) {
			case 0:
				Arena.add(new knight());
				break;
			case 1:
				Arena.add(new archer());
				break;
			case 2:
				Arena.add(new wizard());
				break;
			case 3:
				//human is the fourth type of fighter meeting the requirement
				Arena.add(new Human());
				break;
			case 4:
				Arena.add(new rat());
				break;
			default:
				//this was for debugging to make sure no numbers other than 0, 1, 2 were generated.
				//not needed anymore but will leave to maintain a default case
				System.out.println("DID NOT WORK THE NUMBER GENERATED WAS " + option);
				break;
			}
			
		}
		JFrame frame = new JFrame("ARENA OF DEATH XD");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		battleFrame panel = new battleFrame(Arena);
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
//		System.out.println(Arena.toString());
		battleGround bg = new battleGround();
		int i = 0;
		while(Arena.size() > 1) {
			//randomly generate a number that has an index in the array
			int firstFighter = r.nextInt(Arena.size() - 1);
			int secondFighter = r.nextInt(Arena.size() - 1);
			if(firstFighter == Arena.size()) {
				firstFighter = r.nextInt(Arena.size() - 1);
			}else if(secondFighter == Arena.size()) {
				secondFighter = r.nextInt(Arena.size() - 1);
			}
			//this loop will prevent them from being the same fighter
			while(secondFighter == firstFighter) {
				secondFighter = r.nextInt(Arena.size());
			}
			i++;
			//print the fight number
			System.out.println("***** FIGHT NUMBER " + i + " ******");
			//fight which is in the battleground class using our list of fighters and the fighters at those indexes
			panel.displayfight(Arena, firstFighter, secondFighter);
			battleGround.fight(Arena, firstFighter, secondFighter);
			if(Arena.get(firstFighter).isAlive() == false) {
				System.out.println("Fighter number " + firstFighter + " Has been removed");
				//heal the second before removing the first to prevent out of bounds exception and maintain the fighter being in the same location
				Arena.get(secondFighter).heal();
				Losers.add(Arena.get(firstFighter));
				Arena.remove(firstFighter);	
				panel.addLoser(Losers);
			}else {
				System.out.println("Fighter number " + secondFighter + " Has been removed");
				//heal first to maintain the fighter in the correct position in array
				Arena.get(firstFighter).heal();
				Losers.add(Arena.get(secondFighter));
				Arena.remove(secondFighter);
				panel.addLoser(Losers);
				
			}
			
		}
		//display the winner
		panel.displayWinner(Arena);
		System.out.println("THE WINNER IS " + Arena.get(0).name);
	}

}
