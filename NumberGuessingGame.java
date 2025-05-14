package day7;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// Number guessing game - max attempt -3 
		
		
		
		
		
		Scanner scanner = new Scanner (System.in);
		Random random = new Random();
		
		int targetNumber = random.nextInt(10)+1; // create a random number between 1 and 10
		int attempts = 3;
		boolean guessCorrectly = false;
		
		System.out.println("Welcome to the number guessing game!");
		System.out.println("Guess a number between 1 and 10");
		System.out.println("You have " +attempts+ " attempts. Good luck!" );
		
		
		for(int i=1; i<=attempts; i++)
		
		{
			System.out.println("Attempt" +i+ ":Enter your guess);");
			int userGuess = scanner.nextInt();
			
			if (userGuess == targetNumber) 
			
			{
				System.out.println("Congratulations!! You guessed the correct number");
				guessCorrectly = true;
				break;
			}
					
		
		else 
			
			System.out.println("x Wrong guess");
			if(i<attempts)
				{
					System.out.println("Try again");
				}
		}
		
		if(!guessCorrectly) 
		
		{
			System.out.println("You have not guessed correctly. The correct number was:  "+targetNumber);
			
		}
		scanner.close();
	}
	

}
