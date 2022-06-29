/*

A number-guessing game.

*/
import java.util.Scanner;


public class Game {
  public static void main(String[] args) {
    System.out.println("Hello world");

    Scanner input = new Scanner(System.in);
    System.out.println("Howdy, what's your name?");
    String name = input.nextLine();  // Get user input
    System.out.println(name + ", I'm thinking of a number between 1 and 100.");
    System.out.println("Try to guess my number within 20 trials.");

    int number = 1 + (int) (100 * Math.random());
    int K = 20;
    int i, guess;

    try{
    for (i = 0; i < K; i++) {
      System.out.println("Guess the number:");

      guess = input.nextInt();


      if (number == guess) {
        System.out.println("Congratulations! " + name + ", you guessed the number.");
        break;
      } else if (number > guess
              && i != K - 1) {
        System.out.println("The number is " + "greater than " + guess);
      } else if (number < guess
              && i != K - 1) {
        System.out.println(
                "The number is" + " less than " + guess);
      }


      if (i == K) {
        System.out.println(
                "You have exhausted" + " K trials.");

        System.out.println(
                "The number was " + number);
      }
    }
  } catch(Exception e) {
  System.out.println("Something went wrong.");
    }
  }
}


