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
    private final String chosenWord;
    private final ArrayList<Character> rightGuesses;
    private final ArrayList<Character> wrongGuesses;
    private final Scanner userIn = new Scanner(System.in);


    public Hangman() {
        Random randIndex = new Random();
        int index = randIndex.nextInt(Hangman.WORDBANK.length);
        this.chosenWord = Hangman.WORDBANK[index];
        this.rightGuesses = new ArrayList<>();
        this.wrongGuesses = new ArrayList<>();
        for (int i = 0; i < this.chosenWord.length(); i++) {
            this.rightGuesses.add('_');
        }


    }

    public void playGame() {
        while (!gameOver()) {

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println();
            //Print the correct guesses in the secret word
            System.out.print("Word: ");
            for (Character rightguess : this.rightGuesses) System.out.print(rightguess + " ");
            System.out.println();
            System.out.println();
            //Print the incorrect letters that have been guessed
            System.out.print("Misses: ");
            for (Character wrongguess : this.wrongGuesses) System.out.print(wrongguess + " ");
            System.out.println();
            System.out.println();

            //Prompt and read the next guess
            System.out.print("Guess: ");
            String guess = userIn.nextLine();

            //Process the next guess
            handleGuess(guess.charAt(0));

        }

        System.out.println("The word was: " + chosenWord);
        if (gameWon()) {
            System.out.println("YOU GOT IT!");
        } else {
            System.out.println("Sorry, you lost.");
        }
    }

    private void handleGuess(char ch) {
        int index = chosenWord.indexOf(ch);

        if (index >= 0) {
            while (index >= 0) {
                rightGuesses.set(index, ch);
                index = chosenWord.indexOf(ch, index + 1);
            }
        } else {
            wrongGuesses.add(ch);
        }
    }

    public boolean gameWon() {
        int countRight = 0;
        ArrayList<Character> charsCorrect = new ArrayList<>();
        for (char c : chosenWord.toCharArray()) {
            charsCorrect.add(c);
        }
        for (Character character : charsCorrect) {
            if (rightGuesses.contains(character)) {
                countRight++;
            }
        }

        return countRight == (charsCorrect.size());


    }

    private boolean gameLost() {

        return wrongGuesses.size() == 6;

    }

    private boolean gameOver() {
        return gameLost() || gameWon();

    }

}

