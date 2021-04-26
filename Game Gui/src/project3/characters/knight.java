package project3.characters;
public class knight extends character{
	
	//highest health lowest strength
	public knight() {
		health = 100;
		strength = 1;
		name = "Edward the Black Prince";
		Class = "Knight";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The Knight named Edward the Black Prince has been selected.";
	}
	@Override
	public void heal() {
		health = 100;
	}
}
