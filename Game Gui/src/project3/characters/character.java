package project3.characters;

public abstract class character {
	//variables we need
	protected int health;
	public String name;
	protected String Class;
	protected int strength;
	//attack method gets a number based on the strength. Lower strength will = higher health to balance
	public int attack() {
		int damage = (int) (Math.random()*10 + Math.random()*5*strength);
		System.out.println(name + " did " + damage + " damage");
		return damage;
		
	}
	//subtract the points from the health
	public void hit(int points) {
		health -= points;
	}
	//check if alive
	public boolean isAlive() {
		if(health > 0 ) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getHealth() {
		return health;
	}
	//will be printing info during a fight
	public void printStats() {
		System.out.println(name + " has " + health + " health left");
	}
	//show all info
	//
	//FROM LAST ASSIGNMENT I HAVE CHANGED THIS TO BE ABSTRACT AND ADDED THE DEFINITION IN EACH TYPE OF CHARACTER CLASS
	//
	public abstract String toString();
	//will be used between fights
	public abstract void heal();
}
