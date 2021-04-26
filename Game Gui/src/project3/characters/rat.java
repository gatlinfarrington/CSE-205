package project3.characters;

public class rat extends character{
	public rat() {
		health = 30;
		strength = 6;
		name = "ratatullie";
		Class = "rat";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The rat named ratatullie has been selected";
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		health = 30;
	}
}
