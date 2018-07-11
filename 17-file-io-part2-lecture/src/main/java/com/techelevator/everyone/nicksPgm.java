package com.techelevator.everyone;

import java.io.*;
import java.util.*;

public class nicksPgm {

	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		ArrayList<String> userLines = new ArrayList<String>();

		while (true) { // start of a loop while true
			System.out.println("Enter a line or the word END to stop");
			// userLines.add(keyBoard.nextLine()); //Takes keyboard input and puts it into
			// the ceated array
			String aLine = keyBoard.nextLine();
			if (aLine.equals("END"))
				break; // end the loop
			userLines.add(aLine);
		}

		// we now have all the user input in the ArrayList
		System.out.println("Number of lines enter: " + userLines.size()); // displays the number of lines using the
		// .size method
		
		File aFile = new File("userdata.txt");
		try (PrintWriter diskFile = new PrintWriter(aFile)) {
			for (String currentLine : userLines) {
				diskFile.print(currentLine);
			}
		}
			
}
