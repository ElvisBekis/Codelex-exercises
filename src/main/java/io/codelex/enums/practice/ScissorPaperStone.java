package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class ScissorPaperStone {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean gameOver = false;
        Move playerMove = null;
        Move computerMove;
        int numOfTrials = 0;
        int tieCount = 0;
        int playerWinCount = 0;
        int computerWinCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Let us begin...");

        while (!gameOver) {
            System.out.println("Scissor-Paper-Stone");

            boolean validInput;
            do {
                System.out.println("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
                char choice = input.next().toLowerCase().charAt(0);
                validInput = true;
                switch (choice) {
                    case 'q' -> gameOver = true;
                    case 's' -> playerMove = Move.SCISSORS;
                    case 'p' -> playerMove = Move.PAPER;
                    case 't' -> playerMove = Move.STONE;
                    default -> {
                        System.out.println("Invalid input, try again...");
                        validInput = false;
                    }
                }
            } while (!validInput);

            if (!gameOver) {
                int random = rand.nextInt(3);
                computerMove = Move.values()[random];
                System.out.println("My turn: " + computerMove);

                if (computerMove == playerMove) {
                    System.out.println("Tie!");
                    ++tieCount;
                } else if (computerMove == Move.SCISSORS && playerMove == Move.PAPER) {
                    System.out.println("Scissors cut paper, I won");
                    ++computerWinCount;
                } else if (computerMove == Move.PAPER && playerMove == Move.STONE) {
                    System.out.println("Paper wraps stone, I won!");
                    ++computerWinCount;
                } else if (computerMove == Move.STONE && playerMove == Move.SCISSORS) {
                    System.out.println("Stone breaks scissor, I won!");
                    ++computerWinCount;
                } else {
                    System.out.println("You won!");
                    ++playerWinCount;
                }
                ++numOfTrials;
            }
        }
        System.out.println("Number of trials: " + numOfTrials);
        System.out.println("I won " + computerWinCount + "(" + (100 * computerWinCount / numOfTrials) + "%). You won " + playerWinCount + "(" + (100 * playerWinCount / numOfTrials) + "%).");
        System.out.println("Bye!");
    }
}
