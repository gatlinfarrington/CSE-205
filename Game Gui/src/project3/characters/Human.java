package project3.characters;

public class Human extends character{
	public Human() {
		health = 50;
		strength = 5;
		name = "Geoffery";
		Class = "Human";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The Human named Geoffery has been Selected";
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		health = 50;
	}

}
