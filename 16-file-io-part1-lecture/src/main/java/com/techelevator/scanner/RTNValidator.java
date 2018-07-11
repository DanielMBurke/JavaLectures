package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RTNValidator {
	
	private static final int[] CHECKSUM_WEIGHTS = new int[] { 3, 7, 1, 3, 7, 1, 3, 7, 1 };

	public static void main(String[] args) throws FileNotFoundException {

		printApplicationBanner();
		
		File inputFile = getInputFileFromUser();					// File object with a name of a file that exists and IS a file
	 // File inpuFile = new File ("TRN.txt");					// Alternative to using a method to get a valid file name
		
		try(Scanner fileScanner = new Scanner(inputFile)) {		// Define a Scanner object using the File Object 			
			while(fileScanner.hasNextLine()) {					// .hasNextLine Is there another line to read?
				String line = fileScanner.nextLine();			// .nextline "gets" the next line
				String rtn = line.substring(0, 9);				// Take the first 9chars and store it int string RTN
				System.out.print("RTN : " + rtn);				// Display RTN found
				if(checksumIsValid(rtn) == false) {				// Pass the RTN to rtn checksum to see if its valid
					System.out.println(" - Invalid");			// prompt user that its NOT valid
				}
					else {
						System.out.println(" - Valid");			// prompt user that it IS valid
				}
			}
		}
	}
	private static void printApplicationBanner() {
		System.out.println("******************");
		System.out.println("RTN Validator 9000");
		System.out.println("******************");
		System.out.println();
	}
	
	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);				// Define a scanner object for keyboard called userinput
		System.out.print("Please enter path to input file >>> ");// Displays a message to prompt user
		String path = userInput.nextLine();						// Reads a line from keyboard input
		System.out.println("Path entered: "+ path + "\n");		// Displays the input entered by user
		
		//START OF FILE INPUT CODE
		File inputFile = new File(path);							// Define a file object for the path entered by user 
		if(inputFile.exists() == false) {						// checks for the existence of a file (returns true or false)
			System.out.println(path+" does not exist");			// Prompt user that the path doesn't exist
			System.exit(1); 										// Ends the program
		} else if(inputFile.isFile() == false) {					// checks the if the name input IS a file (returns true or false
			System.out.println(path+" is not a file");			// prompt user that 
			System.exit(1); 										// Ends the program
		}
		return inputFile;
	}
	private static boolean checksumIsValid(String routingNumber) {
		int checksum = 0;
		for(int i = 0; i < 9; i++) {
			int digit = Integer.parseInt(routingNumber.substring(i, i+1));
			checksum += digit * CHECKSUM_WEIGHTS[i];
		}
		return checksum % 10 == 0;
	}
}
