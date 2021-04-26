import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem(String input) {
		groceryList.add(input);	
	}
	
	public ArrayList<String> getGroceryList(){
		return groceryList;
	}

	public void printGroceryList() {
		System.out.println("you have " + groceryList.size() + " items in your list");
		//using enhanced for loops
		for(String i : groceryList) 
		{
			System.out.println(i);
		}
	}
	public void modifyGroceryItem(String currentItem, String newItem) {
		int positions = groceryList.indexOf(currentItem);
		if(positions >= 0) {
			modifyGroceryItem(positions, newItem);
		}
	}
	//this is called overloading a method
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("The item has been changed.");
 	}

	public void removeGroceryItem(String itemNo) {
		groceryList.remove(itemNo);		
	}

	public boolean onFile(String itemNo) {
		//using enhanced for loops
		for(String i : groceryList) {
			if(i.equals(itemNo)) {
				return true;
			}
		}
		return false;
	}
	
}
