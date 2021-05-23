package main;
import java.util.Scanner;

public class Converter {
	
	public static int convertItem = 0;
	static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		// Declare appropriate objects/variables	
		int menuSelection = 0;
		Scanner scanner = new Scanner(System.in);
		
		// Print your menu with numbered options
		do {
			printMenu();							// Display the menu
			menuSelection = scanner.nextInt();		// Retrieve input from the user
			
			// Based on the user input, pick your case.
			switch (menuSelection) {
			case 1:
				 cupsToTbsp();
				 break;
			case 2:
				 gallToPint();
				 break;
			case 3:
				 feetToInches();
				 break;
			case 4:
				 quit();
				 break;
			}

		} while (menuSelection != 4);
			
		// Close your scanner
		scanner.close();

	}
	
	// Methods
	public static void printMenu() {
		System.out.println("Please select an option:\n"
				+ "1. Cups to tablespoons\n"
				+ "2. Gallons to pints\n"
				+ "3. Feet to inches\n"
				+ "4. Quit\n");
	}
	
	// Conversion methods
	public static void cupsToTbsp() {
		System.out.println("\nHow many cups would you like to convert to tablespoons?: ");
		convertItem = scanner.nextInt();
		System.out.print(convertItem + " cups = " + (convertItem * 16) + " tablespoons\n\n");
	}
	
	public static void gallToPint() {
		System.out.println("\nHow many gallons would you like to convert to pints?: ");
		convertItem = scanner.nextInt();
		System.out.print(convertItem + " gallons = " + (convertItem * 8) + " pints\n\n");
	}
	
	public static void feetToInches() {
		System.out.println("\nHow many feet would you like to convert to inches?: ");
		convertItem = scanner.nextInt();
		System.out.print(convertItem + " feet = " + (convertItem * 12) + " inches\n\n");
	}
	
	// Quitting message
	public static void quit() {
		System.out.println("Thank you for using this converter! Goodbye.");
	} 

}
