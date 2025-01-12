import java.util.Random;
import java.util.Scanner;

public class Number_guessing_game {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// System.out.println(random.nextInt());
		
		System.out.println("Welcome to the number guessing Game!");
		System.out.println("------------------------------------");
		
		// to get an integer in the range min-max
		int min = 1;
		int max = 100;
		// nextInt(a) - returns a random integer r, where  0 <= r < a
		// for the given values of max and min, nextInt(100 - 1 + 1) returns a random number r
		// 0 <= r < 100
		// 1 <= r < 100
		int MAX_NUM_GUESSES = 7;
		int totalRounds = 0;
		int roundsWon = 0;
		String userChoice = "";
		
		do {
			// r - stores a random integer between 1 - 100 (both inclusive)
			int randomNumber = random.nextInt(max - min + 1) + min;
			int numGuess = 0;
			System.out.print("Enter your guess: ");
			int guess = scanner.nextInt();
			numGuess++;
			
			// run a while loop as long as the guessed number is not equal to random number
			while( guess!=randomNumber && numGuess<MAX_NUM_GUESSES ) {
				// if the guess is less than the random number
				if ( guess<randomNumber ) {
					// give feedback to the user
					System.out.println("Your guess is a little less than the actual number!");
				}
				// this is the case : guess>randomNumber
				else {
					System.out.println("Your guess is a little higher than the actual number!");
				}
				
				// ask the guess again
				int guessesLeft = MAX_NUM_GUESSES-numGuess;
				System.out.print("Enter your guess again (" + guessesLeft + " " + (guessesLeft==1?"guess":"guesses")  +  " left): ");
				guess = scanner.nextInt();
				numGuess++;
			}
			
			if( guess==randomNumber ) {
				System.out.println("You guessed it right!");
				roundsWon++;
			}
			else {
				System.out.println("You are out of turns!");
				System.out.println("The correct number is " + randomNumber);
			}
			
			// increment the total number of rounds
			totalRounds++;
			
			// ask the user to play again
			System.out.print("Do you wish to play again? (y/n): ");
			userChoice = scanner.next();
			
			System.out.println();
			System.out.println("------------------------------------");
		}
		while( userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("YES"));		
		
		System.out.println("Thankyou for playing!");
		System.out.println("Your score: " + roundsWon + "/" + totalRounds);
		
		// closing the scanner 
		scanner.close();
	}

}

