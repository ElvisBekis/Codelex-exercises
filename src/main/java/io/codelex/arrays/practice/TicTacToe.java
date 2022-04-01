package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private final static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initBoard();
        game();

    }

    private static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    private static void game() {
        Scanner in = new Scanner(System.in);
        char p1 = 'X';
        char p2 = 'O';
        int row;
        int col;

        boolean p1Turn = true;
        boolean gameEnded = false;

        while (!gameEnded) {

            displayBoard();

            char x = ' ';
            if (p1Turn) {
                x = 'X';
            } else {
                x = 'O';
            }

            while (true) {

                if (p1Turn) {
                    System.out.print(p1 + ", choose your location (row, column): ");
                } else {
                    System.out.print(p2 + ", choose your location (row, column): ");
                }
                row = in.nextInt();
                col = in.nextInt();

                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Position is off the bounds of the board! Try again.");
                } else if (board[row][col] != ' ') {
                    System.out.println("Position is taken! Try again.");
                } else {
                    break;
                }
            }

            board[row][col] = x;

            if (isWinner(board) == 'X') {
                System.out.println(p1 + " has won!");
                gameEnded = true;
            } else if (isWinner(board) == 'O') {
                System.out.println(p2 + " has won!");
                gameEnded = true;
            } else {
                if (boardIsFull(board)) {
                    System.out.println("The game is a tie.");
                    gameEnded = true;
                } else {
                    p1Turn = !p1Turn;
                }
            }
        }
        displayBoard();
    }


    private static char isWinner(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
                return board[0][j];
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != ' ') {
            return board[2][0];
        }
        return ' ';
    }

    private static boolean boardIsFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }


    private static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}