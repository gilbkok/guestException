package Projects.guestException.src.Projects.guestException.src;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello! What is your name?");
            String name = sc.nextLine();
            boolean keepPlaying = true;
            Random rand = new Random();

            String playResponse;
            for (int randValue = 1 + rand.nextInt(20); keepPlaying; keepPlaying = !playResponse.startsWith("N") && !playResponse.startsWith("n")) {
                int count = 1;
                System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20");
                System.out.println("Take a guess.");

                for (int userNum = sc.nextInt(); userNum != randValue; userNum = sc.nextInt()) {
                    ++count;
                    if (userNum > randValue) {
                        System.out.println("Your guess is too high.");
                    } else {
                        System.out.println("Your guess is too low.");
                    }

                    System.out.println("Take a guess.");
                }

                System.out.println("Good job, " + name + "! You guessed my number in " + count + " guesses!");
                System.out.println("Would you like to play again? (y or n)");
                playResponse = sc.next();
            }

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}