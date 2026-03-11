package Mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {
	
	public static void main (String[] args) {
		
		final String FLAG = "!";

		//Create a File object with the name of your file is the parameter
		File textFile = new File("C:\\Users\\38207518\\git\\CS-30-Sem2\\Chapter11\\src\\Mastery\\RandomWord");
		
		//Declare a File reader object
		FileReader reads;
		//Declare a BufferedReader object
		BufferedReader readF;
		//Create a random number object
		Random ranNum = new Random();
		
		Scanner input = new Scanner(System.in);

		int numWords = 0;
		int wordToGuess;
		String secretWord = "";
		String wordSoFar = "", updatedWord = "";
		String letterGuess, wordGuess = "";
		int numGuesses = 0;	
		String word;
		//char[] letters;

		/* select secret word */
		try {
				//initialize the file reader object to name of the file object
                reads = new FileReader(textFile);
                //initialize the BufferedReader object to the name of the file reader as a parameter
                readF = new BufferedReader(reads);
				//Get the number of words in the file using readFile
                while ((word = readF.readLine()) != null) {
                	numWords ++;
                }               		
                		
                //update the word to guess to the random object and number of words read plus one
                wordToGuess = ranNum.nextInt(1, numWords + 1);
                for (int i = 0; i < numWords; i++) {
                	wordGuess = readF.readLine();
                }
                
				
                //iterate through the word to guess slots
                char[] letters = new char[wordGuess.length()];
                for (int i = 0; i < wordGuess.length(); i ++) {
                	letters[i] = wordGuess.charAt(i);
                }
                        //update the secret work from the lines read from the file
               
                //close your BufferedReader object
                readF.close();
                //close your FileReader object
                reads.close();
				
    	} 
		catch (FileNotFoundException e){
			System.out.println("File doesn't exist.");
			System.err.println("FileNotFOundException: " + e.getMessage());
		}
		catch (IOException e) {
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}



		/* begin the game */
		System.out.println("WordGuess game.\n");

        //iterate through the secret word, and update the word so far variable to represent using dashes 
        //the length of the secret word
        //output the word so far using dashes
		for (int i = 0; i < letters.length(); i ++) {
			
		}



		/* allow player to make guesses*/

		do {
			//?? prompt for a letter


			/* increment number of guesses */
			//?

			/* player correctly guessed a letter--extract string in wordSoFar up to the letter
			 * guessed and then append guessed letter to that string. Next, extract rest of
			 * wordSoFar and append after the guessed letter
			 */
			
             //???





			/* display guessed letter instead of dash */
			    //??


		} while (!letterGuess.equals(FLAG) && !wordSoFar.equals(secretWord));



        
		/* finish game and display message and number of guesses */
		
        //??
		
		
		
		
		
	}
}
