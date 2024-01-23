import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1, enter your choice (rock, paper, scissors):");
        String player1Choice = scanner.nextLine().toLowerCase();
        System.out.println("Player 2, enter your choice (rock, paper, scissors):");
        String player2Choice = scanner.nextLine().toLowerCase();

        if (player1Choice.equals(player2Choice)) {
            System.out.println("Outcome: It's a tie!");
        } else if (player1Choice.equals("rock")) {
            if (player2Choice.equals("scissors")) {
                System.out.println("Outcome: Player 1 wins!");
            } else {
                System.out.println("Outcome: Player 2 wins!");
            }
        } else if (player1Choice.equals("paper")) {
            if (player2Choice.equals("rock")) {
                System.out.println("Outcome: Player 1 wins!");
            } else {
                System.out.println("Outcome: Player 2 wins!");
            }
        } else if (player1Choice.equals("scissors")) {
            if (player2Choice.equals("paper")) {
                System.out.println("Outcome: Player 1 wins!");
            } else {
                System.out.println("Outcome: Player 2 wins!");
            }
        } else {
            System.out.println("Invalid input!");


        }
    }
}
