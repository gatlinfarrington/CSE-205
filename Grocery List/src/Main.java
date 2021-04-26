import java.util.Scanner;

public class Main {
	//globally accessible outside of any methods
	private static Scanner s = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	
	public static void main(String[] args) {
		//choices variables
		boolean quit = false;
		int choice = 0;
		
		printInstructions();
		
		while(!quit) {
			System.out.println("What would you like to do?");
			choice = s.nextInt();
			s.nextLine();
			switch(choice) {
			case 0:
				printInstructions();
			break;
			case 1:
				groceryList.printGroceryList();
			break;
			case 2:
				addItem();
			break;
			case 3:
				modifyItem();
			break;
			case 4:
				deleteItem();
			break;
			case 5:
				searchItem();
			break;
			case 6:
				quit = true;
			break;
			
			}
		}
	}
	
	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To Print choice options.");
		System.out.println("\t 1 - To print the list of groceries.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To delete an item from the list.");
		System.out.println("\t 5 - To search an item in the list");
		System.out.println("\t 6 - To quit the application.");
	}
	
	public static void addItem() {
		System.out.println("Please enter the item");
		groceryList.addGroceryItem(s.nextLine());
	}
	
	public static void modifyItem() {
		System.out.println("Which item would you like to modify?");
		String itemNo = s.nextLine();
		System.out.println("Enter new Item: ");
		String newItem = s.nextLine();
		groceryList.modifyGroceryItem(itemNo, newItem);
	}
	
	public static void deleteItem() {
		System.out.println("Item to remove: ");
		String itemNo = s.nextLine();
		
		groceryList.removeGroceryItem(itemNo);
	}
	
	public static void searchItem() {
		System.out.println("Which item would you like to search for?");
		String itemNo = s.nextLine();
		if(groceryList.onFile(itemNo)) {
			System.out.println("Found " + itemNo);
		}else {
			System.out.println(itemNo + ", not on file.");
		}
		
	}

}
