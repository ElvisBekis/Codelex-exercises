package io.codelex.arrays.exercises;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

        private static final String [] wordBank =
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
            int index = randIndex.nextInt(Hangman.wordBank.length);
            this.chosenWord = Hangman.wordBank[index];
            this.rightGuesses = new ArrayList<Character>();
            this.wrongGuesses = new ArrayList<Character>();
            for (int i = 0; i < this.chosenWord.length(); i++){
                this.rightGuesses.add('_');
            }


        }
        public void playGame() {
            while (!gameOver()) {

                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println();
                //Print the correct guesses in the secret word
                    System.out.print("Word: ");
                for (int i = 0; i < this.rightGuesses.size(); i++)
                    System.out.print(this.rightGuesses.get(i) + " ");
                    System.out.println();
                    System.out.println();
                //Print the incorrect letters that have been guessed
                    System.out.print("Misses: ");
                for (int i = 0; i < this.wrongGuesses.size(); i++)
                    System.out.print(this.wrongGuesses.get(i) + " ");
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

            if(index >= 0){
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
            ArrayList<Character> charsCorrect = new ArrayList<Character>();
            for (char c : chosenWord.toCharArray()) {
                charsCorrect.add(c);
            }
            for(int i = 0; i < charsCorrect.size(); i++){
                if(rightGuesses.contains(charsCorrect.get(i))){
                    countRight++;
                }
            }

            if (countRight == (charsCorrect.size())){
                return true;
            } else {
                return false;
            }


        }
        private boolean gameLost() {

            if(wrongGuesses.size() == 6){
                return true;
            } else {
                return false;
            }

        }
        private boolean gameOver() {
            if(gameLost() || gameWon()){
                return true;
            } else{
                return false;
            }

        }

    }

