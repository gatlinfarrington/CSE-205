import java.util.Scanner;

/**
 * Driver class
 * 
 * @author Wade Huber
 *
 */
public class Activity {

	public static void main(String[] args) {

		Fraction sampleFraction = new Fraction(8,3);
		
		Scanner scan = new Scanner(System.in);
		String quit = "n";
		//display menu
		printMenu();
		//loop for the interactions with the user
		do {
				//try catch will catch the exceptions being thrown
				try {	
					System.out.print ("Enter the numerator:  ");
					sampleFraction.setNumerator(scan.nextInt());					
					System.out.print ("Enter the denominator:  ");
					sampleFraction.setDenominator(scan.nextInt());						
					System.out.println ("The fraction " + sampleFraction.getNumerator() + "/" +
							sampleFraction.getDenominator() + " is equal to " + sampleFraction.toMixedNumber());
					//catch any exception and pass it into this
				}catch(Exception e) {
					//print the exception
					System.out.println("You have a " + e);
					//clear the values stored
					sampleFraction.setNumerator(0);
					sampleFraction.setDenominator(0);
					//clear the scanner
					scan.next();
				}
				//ask about quitting
				System.out.println("Would you like to quit? (y/n)");
				quit = scan.next();
			//end loop if user wants to quit
		}while(quit.equals("n"));
		
		System.out.println("Thank you.");
		scan.close();

	}
	
	public static void printMenu() {
		System.out.println("Welcome to Fraction Converter");
	}
}