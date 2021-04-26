
public abstract class character {
	//variables we need
	protected int health;
	protected String name;
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
	//will be printing info during a fight
	public void printStats() {
		System.out.println(name + " has " + health + " health left");
	}
	//show all info
	public String toString() {
		return"You have selected a " + Class + " named " + name + " With a strength of " + strength + " with " + health + " health.";
		
	}
}
