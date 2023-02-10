import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Rock, Paper, Scissors!");
    System.out.print("Enter your choice (rock/paper/scissors): ");

    String playerChoice = input.nextLine();
    int computerChoice = random.nextInt(3) + 1;

    String computerString;
    if (computerChoice == 1) {
      computerString = "rock";
    } else if (computerChoice == 2) {
      computerString = "paper";
    } else {
      computerString = "scissors";
    }

    System.out.println("Computer chose " + computerString + ".");

    if (playerChoice.equals("rock")) {
      if (computerChoice == 1) {
        System.out.println("It's a tie!");
      } else if (computerChoice == 2) {
        System.out.println("Computer wins!");
      } else {
        System.out.println("You win!");
      }
    } else if (playerChoice.equals("paper")) {
      if (computerChoice == 1) {
        System.out.println("You win!");
      } else if (computerChoice == 2) {
        System.out.println("It's a tie!");
      } else {
        System.out.println("Computer wins!");
      }
    } else if (playerChoice.equals("scissors")) {
      if (computerChoice == 1) {
        System.out.println("Computer wins!");
      } else if (computerChoice == 2) {
        System.out.println("You win!");
      } else {
        System.out.println("It's a tie!");
      }
    } else {
      System.out.println("Invalid input. Please try again.");
    }
  }
}
