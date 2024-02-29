package numberguessegame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Random rand = new Random();
		 
		 int minRange = 1;
		 int maxRange = 100;
		 int attemptLimit = 3;
		 int roundsWon = 0;
		 
		 System.out.println("Welcome to Guess the Number Game!");
		 
		 boolean playAgain = true;
		 
		 while(playAgain) {
			 int generatedNumber = rand.nextInt(maxRange - minRange +1) + minRange;
			 System.out.println("I have generated a number between " +minRange+ "and" +maxRange+ ". Can you guess what it is?");
			 
			 int attempts = 0;
			 boolean guessedCorrectly = false;
			 
			 while(attempts < attemptLimit && !guessedCorrectly) {
				 System.out.println("Enter Your Guess: ");
				 int userGuess = sc.nextInt();
				 sc.nextLine();
				 
				 if(userGuess == generatedNumber) {
					 System.out.println("Congratulations! You guessed the number correctly.");
					 guessedCorrectly = true;
					 roundsWon++;
				 }else if(userGuess < generatedNumber) {
					 System.out.println("Too Low! Try Again.");
					 
				 }else {
					 System.out.println("Too High! Try Again.");
				 }
				 attempts++;
				 
			 }
			 
			 if(!guessedCorrectly) {
				 System.out.println("Sorry, you've run out of attempts. The correct number was: " + generatedNumber);
			 }
			 
			 System.out.println("Do you want to play again? (yes/no): ");
			 String playAgainInput = sc.nextLine();
			 playAgain = playAgainInput.equalsIgnoreCase("yes");
			 
		 }
		 
		 System.out.println("Thanks for playing! Your score: " + roundsWon);
		 sc.close();

	}

}
