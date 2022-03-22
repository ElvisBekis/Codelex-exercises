package io.codelex.arrays.exercises;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    private static final String[] WORDBANK =
            {"java", "cat", "yesterday", "indiana", "makeup", "boots",
                    "programming", "polish", "transportation", "breakfast", "strawberry", "cake",
                    "remote", "cookies", "terminology", "television", "cranberry", "tool",
                    "caterpillar", "juice", "watermelon", "laptop", "toe", "toad",
                    "aardvark", "capitol", "kitten", "sanguine", "meow", "burger"};
    private final String CHOSENWORD;
    private final ArrayList<Character> RIGHTGUESSES;
    private final ArrayList<Character> WRONGGUESSES;
    private final Scanner USERIN = new Scanner(System.in);


    public Hangman() {
        Random randIndex = new Random();
        int index = randIndex.nextInt(Hangman.WORDBANK.length);
        this.CHOSENWORD = Hangman.WORDBANK[index];
        this.RIGHTGUESSES = new ArrayList<>();
        this.WRONGGUESSES = new ArrayList<>();
        for (int i = 0; i < this.CHOSENWORD.length(); i++) {
            this.RIGHTGUESSES.add('_');
        }


    }

    public void playGame() {
        while (!gameOver()) {

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println();
            //Print the correct guesses in the secret word
            System.out.print("Word: ");
            for (Character rightguess : this.RIGHTGUESSES) System.out.print(rightguess + " ");
            System.out.println();
            System.out.println();
            //Print the incorrect letters that have been guessed
            System.out.print("Misses: ");
            for (Character wrongguess : this.WRONGGUESSES) System.out.print(wrongguess + " ");
            System.out.println();
            System.out.println();

            //Prompt and read the next guess
            System.out.print("Guess: ");
            String guess = USERIN.nextLine();

            //Process the next guess
            handleGuess(guess.charAt(0));

        }

        System.out.println("The word was: " + CHOSENWORD);
        if (gameWon()) {
            System.out.println("YOU GOT IT!");
        } else {
            System.out.println("Sorry, you lost.");
        }
    }

    private void handleGuess(char ch) {
        int index = CHOSENWORD.indexOf(ch);

        if (index >= 0) {
            while (index >= 0) {
                RIGHTGUESSES.set(index, ch);
                index = CHOSENWORD.indexOf(ch, index + 1);
            }
        } else {
            WRONGGUESSES.add(ch);
        }
    }

    public boolean gameWon() {
        int countRight = 0;
        ArrayList<Character> charsCorrect = new ArrayList<>();
        for (char c : CHOSENWORD.toCharArray()) {
            charsCorrect.add(c);
        }
        for (Character character : charsCorrect) {
            if (RIGHTGUESSES.contains(character)) {
                countRight++;
            }
        }

        return countRight == (charsCorrect.size());


    }

    private boolean gameLost() {

        return WRONGGUESSES.size() == 6;

    }

    private boolean gameOver() {
        return gameLost() || gameWon();

    }

}

