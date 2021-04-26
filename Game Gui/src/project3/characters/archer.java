package project3.characters;
public class archer extends character{
	
	//mid health and mid strength
	public archer() {
		health = 80;
		strength = 2;
		name = "Legolas";
		Class = "Archer";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The Archer names Legolas has been Selected";
	}
	
	public void heal() {
		health = 80;
	}
	
}
