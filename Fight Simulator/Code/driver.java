import java.util.ArrayList;
public class driver {
	public static void fight(ArrayList<character> Arena) {
		//while they are alive they hit each other and print the current state of the fight
		while(Arena.get(0).isAlive() == true && Arena.get(1).isAlive() == true) {
			Arena.get(1).hit(Arena.get(0).attack());
			Arena.get(0).hit(Arena.get(1).attack());
			Arena.get(0).printStats();
			Arena.get(1).printStats();
		}
		//display whoever lost
		if(Arena.get(0).isAlive() == false) {
			System.out.println(Arena.get(0).name + " has lost");
		}
		if(Arena.get(1).isAlive() == false) {
			System.out.println(Arena.get(1).name + " has lost");
		}
	}
}
