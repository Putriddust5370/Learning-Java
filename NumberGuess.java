
import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

	public static void main(String [] args) {

		Scanner in = new Scanner(System.in);	
		Random random = new Random();
		int number = random.nextInt(100) + 1; // generates 0-99 random numbers, +1 makes it 1-100
		int guess, difference;

		System.out.println("I'm thinking of a number between 1 and 100, can you guess it?");
		approximate();
		difference = number - guess;

		//check(guess, number, difference);
		finalStep(guess, number);

	}

	public static void approximate() {
		System.out.print("Type a number: ");
		guess = in.nextInt();
		finalStep(guess, number);
	}

	public static void check(int guess, int number, int difference); {

		System.out.printf("Your guess is : %d.\n", guess);
		System.out.printf("My number is : %d.\n", number);
		System.out.printf("You were off by : %d.\n", difference);
	}

	public static void finalStep(int guess, int number) {
		if (guess < number) {
			System.out.println("That's too low.");
			approximate();
		}
		if (guess > number) {
			System.out.println("That's too high.");
			approximate();
		}
		if (guess = number) {
			System.out.println("Congratulations! You got it!!");
		}

	}
}