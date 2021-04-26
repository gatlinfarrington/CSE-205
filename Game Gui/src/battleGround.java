import java.util.ArrayList;

import project3.characters.character;

public class battleGround {
	//this code was taken from my last project and modified to fit the requirements for this project
	//it was changed by allowing a pass in of the two different fighters indexes instead of just using index 0 and 1 for a list with two fighters
	//these indexes will be determined randomly and passes in when the method is called.
	public static void fight(ArrayList<character> Arena, int firstFighter, int secondFighter) {
		//while they are alive they hit each other and print the current state of the fight
		while(Arena.get(firstFighter).isAlive() == true && Arena.get(secondFighter).isAlive() == true) {
			Arena.get(secondFighter).hit(Arena.get(firstFighter).attack());
			Arena.get(firstFighter).hit(Arena.get(secondFighter).attack());
			Arena.get(firstFighter).printStats();
			Arena.get(secondFighter).printStats();
		}
		//display whoever lost
		if(Arena.get(firstFighter).isAlive() == false) {
			System.out.println(Arena.get(firstFighter).name + " has lost");
			
		}
		if(Arena.get(secondFighter).isAlive() == false) {
			System.out.println(Arena.get(secondFighter).name + " has lost");
			
		}
		
	}
}
