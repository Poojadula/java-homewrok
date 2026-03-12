import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int number = rand.nextInt(100) + 1; // 1 to 100 random number
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100");

        do {
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too High");
            } 
            else if (guess < number) {
                System.out.println("Too Low");
            } 
            else {
                System.out.println("Correct! You won in " + attempts + " attempts");
            }

        } while (guess != number);

        sc.close();
    }
}