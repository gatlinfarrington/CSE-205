/*	Gatlin Farrington
 * 	MW @ 4:30
 * 	inheritance project
 * 	30 minutes
 * 
 */
import java.util.Scanner;

import project3.characters.archer;
import project3.characters.character;
import project3.characters.knight;
import project3.characters.wizard;

import java.util.ArrayList;
public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		//create a list to store fighters in
		ArrayList<character> arena = new ArrayList<>();
		//call the methods to collect fighters and simulate fight
		printMenu(arena);
		driver driver = new driver();
		driver.fight(arena);
	}
	//method takes in an arraylist to store players outside of this method
	public static void printMenu(ArrayList<character> copy) {
		//creates an arrayList to store the players
		ArrayList<character> arena = new ArrayList<>();
		//prompt and collect fighters
		System.out.println("Welcome to battle simulator! \n pick your two fighters.");
		System.out.println(" 1. Wizard \n 2. Knight \n 3. Archer");
		int choice1 = s.nextInt();
		int choice2 = s.nextInt();
		//add choices to the list
		switch(choice1) {
			case 1:
				wizard wiz1 = new wizard();
				arena.add(wiz1);
				
				break;
			case 2:
				knight knight1 = new knight();
				arena.add(knight1);
				break;
			case 3:
				archer arch1 = new archer();
				arena.add(arch1);
				break;
			default:
				System.out.println("you did not choose a valid option for fighter 1.");
		}
		switch(choice2) {
		case 1:
			wizard wiz2 = new wizard();
			arena.add(wiz2);
			break;
		case 2:
			knight knight2 = new knight();
			arena.add(knight2);
			break;
		case 3:
			archer arch2 = new archer();
			arena.add(arch2);
			break;
		default:
			System.out.println("you did not choose a valid option for fighter 2.");
	}
		//display choices
		System.out.println(arena.get(0).toString());
		System.out.println(arena.get(1).toString());
		//add them to the list outside of this method
		for(int i = 0; i < arena.size(); i++) {
			copy.add(arena.get(i));
		}
		
	}
	
}
