package project3.characters;
public class wizard extends character{
	
	//lowest health highest strength
	public wizard() {
		health = 60;
		strength = 3;
		name = "harry potter";
		Class = "Wizard";
	}
	
	public String toString() {
		return "The wizard named Harry Potter has been Selected";
		
	}
}
